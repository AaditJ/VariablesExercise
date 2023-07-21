// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        String firstName, lastName;
//        firstName = "Aadit";
//        lastName = "Jain";
//
//        String name = firstName+lastName;
//        System.out.println(name);

//        int num1 = 4, num2 = 3;
//        System.out.println(num1+num2);
//
//        float result = (float)num1 / (float)num2;
//        System.out.println(result);
//
//        int num3=8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);

        String firstName, lastName;
        System.out.println("What is your first name?");
        firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        lastName = scanner.nextLine();

        System.out.println(firstName + " " + lastName);

        int num1, num2;
        System.out.println("Give me a number");
        num1 =  Integer.valueOf(scanner.nextLine());
        System.out.println("Give me another number");
        num2 =  Integer.valueOf(scanner.nextLine());
        System.out.println(num1 + num2);
    }
}