package org.apwj.bearburger.dao;

import org.apwj.bearburger.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class UserDao
{
    private final JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> getAllUsers() {

        return this.jdbcTemplate.query("SELECT * FROM Users",
                (resultSet, rowNum) -> setUserDetails(resultSet)
        );
    }

    public Boolean insertRow(String username, String email, String pass, String phone, String gender) {

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String insertQuery = "INSERT INTO users (username, email, pass, phone, gender, reg_date) " +
                "VALUES" + "('" + username + "', '" + email + "', '" + pass + "', '" + phone + "', '" + gender + "', '" + ts + "');";

        if (searchByUsername(username) == null && searchByEmail(email) == null) {
            this.jdbcTemplate.execute(insertQuery);
            return true;
        }

        return false;
    }

    public User getByEmail(String email) {

        User user = null;

        try {
            List<User> users = this.jdbcTemplate.query("select * from users where email = '" + email + "';",
                    (resultSet, rowNum) -> setUserDetails(resultSet));

            if (users.size() > 0) {
                user = users.get(0);
            }
        } catch (Exception ignored) { }

        return user;
    }

    public User searchByUsername(String username) {

        User searchUser = null;
        List<User> users;

        try {
            users = this.jdbcTemplate.query("select * from users where username like '" + username + "';",
                    (resultSet, rowNum) -> setUserDetails(resultSet));

            if (users.size() > 0) {
                searchUser = users.get(0);
            }
        } catch (Exception ignored) { }

        return searchUser;
    }

    public User searchByEmail(String email) {

        User searchUser = null;
        List<User> users;

        try {
            users = this.jdbcTemplate.query("select * from users where email like '" + email + "';",
                    (resultSet, rowNum) -> setUserDetails(resultSet));

            if (users.size() > 0) {
                searchUser = users.get(0);
            }
        } catch (Exception ignored) { }

        return searchUser;
    }

    public User searchById(int userId) {

        User searchUser = null;
        List<User> users;

        try {
            users = this.jdbcTemplate.query("select * from users where id = " + userId + ";",
                    (resultSet, rowNum) -> setUserDetails(resultSet));

            if (users.size() > 0) {
                searchUser = users.get(0);
            }
        } catch (Exception ignored) { }

        return searchUser;
    }

    public void deleteUser(int userId) {
        this.jdbcTemplate.update("DELETE FROM  Users WHERE id = ?", userId);
    }

    public void updateUser(int userId, String pass, String phone, String gender) {
        this.jdbcTemplate.update("update users set pass = '" + pass + "', phone = '"
                + phone + "', gender = '" + gender + "' where id = ?", userId);
    }

    private User setUserDetails(ResultSet resultSet) throws SQLException {
        return new User(
                resultSet.getInt("id"),
                resultSet.getString("username"),
                resultSet.getString("email"),
                resultSet.getString("pass"),
                resultSet.getString("phone"),
                resultSet.getString("gender"),
                resultSet.getDate("reg_date")
        );
    }
}
