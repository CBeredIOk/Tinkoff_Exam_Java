package Tinkoff_Exam_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of challenge: 1, 2, 3, 4");
        int choice = scanner.nextInt();

        if(choice == 1){

            JoeAndCards Task = new JoeAndCards();
            Task.JoeAndCards();

        } else if (choice == 2) {

            Sheriff Task = new Sheriff();
            Task.Sheriff();

        } else if (choice == 3) {

            bankRobbery Task = new bankRobbery();
            Task.bankRobbery();

        } else if (choice == 4) {

            buyRevolver Task = new buyRevolver();
            Task.buyRevolver();

        } else System.out.println("You didn't enter one of challenge: 1, 2, 3, 4");
    }
}
