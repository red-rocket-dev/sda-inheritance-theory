package pl.sda;

public class Main {
    public static void main(String[] args) {
        // funWithInheritance();
        /*
        1. Utworz klase Accountant dziedziczaca po Employee, powinna dodatkowo:
         - miec pole z informacja o przepracowanych latach (int) - pamietaj o setterach lub ustawieniu tego przez konstruktor
         - roczna pensja powinna byc powiekszona o tyle razy ile wynosza przepracowane lata wzgledem employee
        2. Utworz klase FullstackProgrammer, ktora bedzie dziedziczyla z klasy JavaProgrammer, powinna dodatkowo:
         - miec pole frontendLanguage (+setter)
         - roczna pensja powinna byc powiekszona DODATKOWO WZGLEDEM PROGRAMISTY JAVA o 300%
        3. Do jednej z klas dziedziczacej po Employee dopisz toString, tak aby po ich uruchomieniu było widoczne imie, nazwisko i roczna pensja
        4. Utworz obiekt każdej klasy i ustaw wynagrodzenia w każdym z nich na 1000, nie zapomnij o ustawieniu imienia i nazwiska
        5. Wypisz wszystkie obiekty na konsole, sprawdz czy zadanie zostalo wykonane prawidlowo
        ** pole salary zmien na BigDecimal
         */

        Employee emp1 = new Employee();
        emp1.setName("Jan");
        emp1.setSurname("Kowalski");
        emp1.setSalary(10_000L);

        Employee emp2 = new Employee();
        emp2.setName("Jan");
        emp2.setSurname("Kowalski");
        emp2.setSalary(10_000L);
        //System.out.println(emp1.equals(emp2));

        Programmer prog1 = new Programmer("Java");
        prog1.setName("Tomek");
        prog1.setSurname("Kowalski");
        prog1.setSeniorityLevel("Senior");
        prog1.setSalary(1000L);

        System.out.println(prog1.yearlySalary());

        Programmer prog2 = new Programmer("C++");
        prog2.setName("Tomek");
        prog2.setSurname("Kowalski");
        prog2.setSeniorityLevel("Senior");

        System.out.println(prog1.equals(prog2));

        Employee emp3 = prog1;
        //Programmer prog3 = emp1; //tak sie nie da!
        Programmer prog3 = Programmer.from(emp1); //ale mozemy sobie "na piechote" stworzyc/przepisac pola

        System.out.println(emp3.toString());

        System.out.println("-----");
        JavaProgrammer javaProgrammer = new JavaProgrammer();


        JavaProgrammer.from(prog1);

        Cat cat = new Cat("KowalskiKot");
        Dog dog = new Dog("KowalskiPies");

        Animal animal1 = cat;
        Animal animal2 = dog;
        animal1.makeSound();

        //System.out.println(Programmer.something());
        //System.out.println(Employee.something());
        Employee.printSomething();
        Programmer.printSomething();

        //Animal

    }

    private static void funWithInheritance() {
        //* Ile jedna klasa moze rozszerzac klas? Jedną
        //* Co jesli klasa nie ma konstruktora domyslnego? (Java wygeneruje)
        //* Czy klasa dziedziczaca ma dostep do pol klasy bazowej? Zwykle nie, bo powinny byc prywatne (jak nie sa prywatne to ma dostep)
        //* Czy moge przypisc obiekt klasy Programmer do zmiennej klasy Employee? tak
        //* Czy moge przypisc zmienna klasy Employee do obiektu klasy Programmer? nie, bo bedzie brakowalo pol
        //* Co z metodami statycznymi i polami statycznymi? nie mozna nadpisywac metod statycznych, moga byc tylko przesloniete
        //* Jak zrobic, zeby obiekty Programmer zwracaly innego toStringa? nadpisac
        //* Jak zrobic, zeby roczna pensja dla programisty byla podwojna? nadpisac metode yearlySalary (tak jak to zrobilismy)
        //* Jak stworzyc osobna klase programisty dla programistow Java? do tego wrocic - konstruktor
        //* Po jakiej klasie dziedziczy każda klasa w Java? Object
        //* Czy mogę zaimplementować własną wersję metody służącej do porównywania? tak
        //* Jaka jest kolejność wywoływania konstruktorów? od najbardziej ogolnego do najbardziej szczegolowego Object -> Employee -> Programmer -> JavaProgrammer

    }
}
