package pl.sda;

public class Programmer extends Employee {
    private String backendLanguage;
    private String seniorityLevel;

    public String getBackendLanguage() {
        return backendLanguage;
    }


    public Programmer setBackendLanguage(String backendLanguage) {
        this.backendLanguage = backendLanguage;
        return this;
    }

    public String getSeniorityLevel() {
        return seniorityLevel;
    }

    public Programmer setSeniorityLevel(String seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
        return this;
    }

    public static Programmer from(Employee emp1) {
        Programmer programmer = new Programmer();
        programmer.setName(emp1.getName());
        programmer.setSurname(emp1.getSurname());
        return programmer;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "backendLanguage='" + backendLanguage + '\'' +
                ", seniorityLevel='" + seniorityLevel + '\'' +
                '}';
    }
}
