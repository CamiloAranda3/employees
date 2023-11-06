package com.amaris.employees.model;

public class Employee {
    private final Id id;
    private final Employee_name employee_name;
    private final Employee_salary employee_salary;
    private final Employee_age employee_age;
    private final Profile_image profile_image;


    public Employee(Id id, Employee_name employee_name, Employee_salary employee_salary, Employee_age employee_age, Profile_image profile_image) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

    public Id getId() {
        return id;
    }

    public Employee_name getEmployee_name() {
        return employee_name;
    }

    public Employee_salary getEmployee_salary() {
        return employee_salary;
    }

    public Employee_age getEmployee_age() {
        return employee_age;
    }

    public Profile_image getProfile_image() {
        return profile_image;
    }
}
