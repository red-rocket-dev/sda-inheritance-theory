package pl.sda;

public class Programmer extends Employee{
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
}
