package com.workintech.s17d2.model;

public class Developer {
    private int id;
    private String name;
    private Double salary;
    private Experience experience;

    public Developer(int id,String name,Double salary,Experience experince){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.experience=experince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Experience getExperince() {
        return experience;
    }

    public void setExperince(Experience experince) {
        this.experience = experince;
    }
}
