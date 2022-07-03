package org.apwj.dao;

import org.apwj.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class userDAO {
    private JdbcTemplate jdbcTemplate;

    public userDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<User> getAllUsers(){
        return this.jdbcTemplate.query(
                "select * from users",
                (resultSet,rowNum)->{
                    User user = new User();
                    user.setUserId(resultSet.getInt("id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setEmail(resultSet.getString("email"));
                    user.setGender(resultSet.getString("gender"));
                    user.setPass(resultSet.getString("pass"));
                    user.setPhone(resultSet.getString("phone"));
                    user.setReg_date(resultSet.getDate("reg_date"));
                    return user;
                }
        );
    }
    public Boolean insertRow(String username, String email,String pass,String phone,String gender){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String insertQuery = "INSERT INTO users (username,email,pass,phone,gender,reg_date) VALUES" + "('"+username+"', '"+email+"', '"+pass+"', '"+phone+"', '"+gender+"', '"+ ts +"');";
        System.out.println(insertQuery);
        if(searchByUsername(username)==null && searchByMail(email)==null) {
            this.jdbcTemplate.execute(insertQuery);
            return true;
        }
        else{
            System.out.println("User already exists");
            return false;
        }
    }
    public User searchByUsername(String username){
        User searchUser = null;
        List<User> users;
        try{
            users = this.jdbcTemplate.query("select * from users where username like '"+ username+"';",(resultSet,rowNum)->{
            User user = new User();
            user.setUserId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            user.setGender(resultSet.getString("gender"));
            user.setPass(resultSet.getString("pass"));
            user.setPhone(resultSet.getString("phone"));
            user.setReg_date(resultSet.getDate("reg_date"));
            System.out.println("User found with creds: "+user.getUsername()+","+user.getPass());
            return user;
        });
            if(users.size()>0){
                searchUser = users.get(0);
            }
            else{
                System.out.println("No similar username found");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return searchUser;
    }
    public User searchByMail(String mail){
        User searchUser = null;
        List<User> users;
        try{
            users = this.jdbcTemplate.query("select * from users where email like '"+mail+"';",(resultSet,rowNum)->{
                User user = new User();
                user.setUserId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setGender(resultSet.getString("gender"));
                user.setPass(resultSet.getString("pass"));
                user.setPhone(resultSet.getString("phone"));
                user.setReg_date(resultSet.getDate("reg_date"));
                System.out.println("User found with creds: "+user.getUsername()+","+user.getPass());
                return user;
            });
            if(users.size()>0){
                searchUser = users.get(0);
            }
            else{
                System.out.println("No similar email user found");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return searchUser;
    }
    public User searchById(int userId){
        User searchUser = null;
        List<User> users;
        try{
            users = this.jdbcTemplate.query("select * from users where id = "+userId+";",(resultSet,rowNum)->{
                User user = new User();
                user.setUserId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setGender(resultSet.getString("gender"));
                user.setPass(resultSet.getString("pass"));
                user.setPhone(resultSet.getString("phone"));
                user.setReg_date(resultSet.getDate("reg_date"));
                System.out.println("User found with creds: "+user.getUsername()+","+user.getPass());
                return user;
            });
            if(users.size()>0){
                searchUser = users.get(0);
            }
            else{
                System.out.println("No similar user found");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return searchUser;
    }
    public void deleteUser(int userId) {
        this.jdbcTemplate.update(
                "delete from users where id = ?",
                userId);
    }

    public void updateUser(int userId,String pass,String phone,String gender){
        this.jdbcTemplate.update(
                "update users set pass = '"+pass+"',phone = '"+phone+"',gender = '"+gender+"' where id = ?",
                userId);

    }

}
