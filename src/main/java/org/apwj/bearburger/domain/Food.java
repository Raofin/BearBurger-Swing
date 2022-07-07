package org.apwj.bearburger.domain;

public class Food
{
    private int id;
    private String category;
    private String title;
    private String description;
    private float price;

    public Food() { }

    public Food(int id,
                String category,
                String title,
                String description,
                float price) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - " + category.toUpperCase() + " - " + price + " tk";
    }
}
