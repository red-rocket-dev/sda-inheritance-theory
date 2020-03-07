package pl.sda;

public class Employee {
    private String name;
    private String surname;
    private Long salary;

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
}
