package pl.sda;

public class Programmer extends Employee {
    private String backendLanguage;
    private String seniorityLevel;

    public Programmer(String backendLanguage) {
        System.out.println("Programmer");
        this.backendLanguage = backendLanguage;
    }

    public Programmer() {
    }

    public String getBackendLanguage() {
        return backendLanguage;
    }

    public String getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(String seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    public static Programmer from(Employee emp1) {
        Programmer programmer = new Programmer();
        programmer.setName(emp1.getName());
        programmer.setSurname(emp1.getSurname());
        return programmer;
    }

    @Override
    public Long getSalary() {
        return 0L;
    }

    @Override
    public Long yearlySalary() {
        System.out.println(getSalary());
        System.out.println(super.getSalary());

        return super.yearlySalary() * 2;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "backendLanguage='" + backendLanguage + '\'' +
                ", seniorityLevel='" + seniorityLevel + '\'' +
                '}';
    }

    public static String something() {
        return "programmer";
    }
}
