package org.apwj.bearburger.dao;

import org.apwj.bearburger.domain.Food;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FoodDao
{
    private final JdbcTemplate jdbcTemplate;

    public FoodDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertRow(String category, String title, String description, int price) {

        String insertQuery = "INSERT INTO foods (category,title,description,price) " +
                "VALUES ('" + category + "', '" + title + "', '" + description + "', " + price + ");";

        if (getFoodDetails(category, title) == null) {
            this.jdbcTemplate.execute(insertQuery);
        }
    }

    public List<Food> getAllFoods() {

        return this.jdbcTemplate.query(
                "SELECT * FROM Foods",
                (resultSet, rowNum) -> setFoodDetails(resultSet)
        );
    }

    public List<String> getAllCategory() {

        return this.jdbcTemplate.query(
                "SELECT DISTINCT category FROM Foods",
                (resultSet, rowNum) -> resultSet.getString("category")
        );
    }

    public List<String> getTitlesByCategory(String category) {

        return this.jdbcTemplate.query(
                "select title from foods where category like '" + category + "';",
                (resultSet, rowNum) -> resultSet.getString("title")
        );
    }

    public Food getFoodDetails(String category, String title) {

        try {
            return this.jdbcTemplate.query(
                    "select * from foods where category like '" + category + "' and title like '" + title + "';",
                    (ResultSet resultSet, int rowNum) -> setFoodDetails(resultSet)).get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public Food getFoodDetails(int foodId) {

        return this.jdbcTemplate.query(
                "select * from foods where id = " + foodId + ";",
                (resultSet, rowNum) -> setFoodDetails(resultSet)).get(0);
    }

    private Food setFoodDetails(ResultSet resultSet) throws SQLException {
        return new Food(
                resultSet.getInt("id"),
                resultSet.getString("category"),
                resultSet.getString("title"),
                resultSet.getString("description"),
                resultSet.getFloat("price")
        );
    }
}
