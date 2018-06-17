import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Input your born year: ");
        year= scanner.nextInt();

        int Age = 2018 - year;
        System.out.println("Your age now is: " + Age);

    }
}
