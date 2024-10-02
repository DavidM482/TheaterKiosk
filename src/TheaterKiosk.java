import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int ageRequirement = 21;
        int age;

        System.out.println("Enter your age as an integer.");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= ageRequirement) {
                System.out.println("You get a paper wristband.");
            }
        }
    }
}