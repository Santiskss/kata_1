import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Santi", LocalDate.of(2004, 1, 1));
        System.out.println(person1);
    }
}
