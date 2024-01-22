package org.example.IOC;

public class Employee {
    String id;
    String DOJ;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", DOJ='" + DOJ + '\'' +
                '}';
    }

    public Employee(String id, String DOJ) {
        this.id = id;
        this.DOJ = DOJ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }
}
