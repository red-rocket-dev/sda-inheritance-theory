package pl.sda;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    public Employee() {
        //System.out.println("Employee");
    }

    private String name;
    private String surname;
    private BigDecimal salary;
    private Integer age;


    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal yearlySalary() {
        return this.salary.multiply(BigDecimal.valueOf(12));
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public static String something() {
        return "employee";
    }

    public static void printSomething() {
        System.out.println(something());
    }
}
