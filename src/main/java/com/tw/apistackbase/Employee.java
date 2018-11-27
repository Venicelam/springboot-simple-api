package com.tw.apistackbase.controller;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Employee(String id, String name, int age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}
