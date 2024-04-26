package com.zaurtregulov.spring.mvc;


import com.zaurtregulov.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name is short")
    private String name;

    @NotEmpty(message = "surname is required field")
    private String surname;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{3}", message = "please use pattern: XXX-XX-XXX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "email must be ends with abc.com")
    private String email;

    private int salary;

    private String department;

    private String[] languages;

    private String car;

    private Map<String, String> cars = new HashMap<>();

    private Map<String, String> departments = new HashMap<>();


    {
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");
        cars.put("Volvo", "Volvo");

        departments.put("It", "It");
        departments.put("HR", "HR");
        departments.put("Sales", "Sales");
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
