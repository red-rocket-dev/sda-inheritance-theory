package pl.sda;

public class JavaProgrammer extends Programmer {

    public JavaProgrammer() {
        super("Java");
        System.out.println("JavaProgrammer");
    }

    /* Tak nie robimy, to stoi w sprzecznosci z literka L z SOLID
    Liskov substitution principle
    @Override
    public void setBackendLanguage(String backendLanguage) {
    }*/

    public static JavaProgrammer from(Programmer programmer) {
        return null;
    }
}
