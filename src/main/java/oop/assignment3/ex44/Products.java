package oop.assignment3.ex44;

public class Products {
    String name;
    Double price;
    Integer quantity;

    public Products(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Getters and setters methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nPrice: "+price+"\nQuantity: "+quantity;
    }
}

