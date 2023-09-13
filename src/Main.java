import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String firstName;
        String favFood;
        Scanner scanner;
        int age;
        scanner = new Scanner (System.in);
        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("Enter your name");
        firstName = scanner.next();
        System.out.println("Enter your favourite food");
        favFood = scanner.next();
        System.out.println("First name:" + firstName + "\nAge:" + age + "\nFavourite Food:"+ favFood);
    }

}