package org.apwj.dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apwj.domain.Food;
import org.apwj.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Timestamp;
import java.util.List;

public class foodDAO {
    private JdbcTemplate jdbcTemplate;

    public foodDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Boolean insertRow(String category, String title,String description,int price){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String insertQuery = "INSERT INTO foods (catagory,title,description,price) VALUES" + "('"+category+"', '"+title+"', '"+description+"', "+price+");";

        System.out.println(insertQuery);
        if(getFoodDetails(category,title)==null) {
            this.jdbcTemplate.execute(insertQuery);
            return true;
        }
        else{
            System.out.println("Food already exists");
            return false;
        }
    }
    public List<Food> getAllFoods(){
        return this.jdbcTemplate.query(
                "select * from foods",
                (resultSet,rowNum)->{
                    Food food = new Food();
                    food.setId(resultSet.getInt("id"));
                    food.setCategory(resultSet.getString("catagory"));
                    food.setTitle(resultSet.getString("title"));
                    food.setDescription(resultSet.getString("description"));
                    food.setPrice(resultSet.getFloat("price"));
                    return food;
                }
        );
    }
    public List<String> getAllCategory(){
        return this.jdbcTemplate.query(
                "select distinct catagory from foods",
                (resultSet,rowNum)->{
                    String category = resultSet.getString("catagory");
                    return category;
                }
        );
    }
    public List<String> getTitlesByCategory(String category){
        return this.jdbcTemplate.query(
                "select title from foods where catagory like '"+category+"';",
                (resultSet,rowNum)->{
                    String title = resultSet.getString("title");
                    return title;
                }
        );
    }
    public Food getFoodDetails(String category,String title){
        try {
            return this.jdbcTemplate.query(
                    "select * from foods where catagory like '" + category + "' and title like '" + title + "';",
                    (resultSet, rowNum) -> {
                        Food food = new Food();
                        food.setId(resultSet.getInt("id"));
                        food.setTitle(resultSet.getString("title"));
                        food.setPrice(resultSet.getFloat("price"));
                        food.setCategory(resultSet.getString("catagory"));
                        food.setDescription(resultSet.getString("description"));
                        return food;
                    }
            ).get(0);
        }
        catch (Exception e){
            return null;
        }
    }
    public Food getFoodDetails(int foodId){
        return this.jdbcTemplate.query(
                "select * from foods where id = "+foodId+";",
                (resultSet,rowNum)->{
                    Food food = new Food();
                    food.setId(resultSet.getInt("id"));
                    food.setTitle(resultSet.getString("title"));
                    food.setPrice(resultSet.getFloat("price"));
                    food.setCategory(resultSet.getString("catagory"));
                    food.setDescription(resultSet.getString("description"));
                    return food;
                }
        ).get(0);
    }
}
