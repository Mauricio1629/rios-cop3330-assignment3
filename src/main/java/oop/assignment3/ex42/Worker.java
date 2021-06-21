package oop.assignment3.ex42;

public class Worker {

    public String firstName;
    private String lastName;
    private Integer salary;

    public Worker(String firstName, String lastName, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    //when printing the content of a worker, print in a specific format
    public String toString() {
        return String.format("%-10s %-10s %-17s", getFirstName(), getLastName(), getSalary());
    }
}