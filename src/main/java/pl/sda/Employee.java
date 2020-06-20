package pl.sda;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private Long salary;
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

    public Long getSalary() {
        return salary;
    }

    public Employee setSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public Long yearlySalary() {
        return this.salary * 12;
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
}
