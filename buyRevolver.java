package Tinkoff_Exam_Java;

import java.util.Scanner;

public class buyRevolver {
    private String firstInput;
    private String secondInput;
    public void buyRevolver(){
        Scanner scanner = new Scanner(System.in);

        firstInput = scanner.nextLine();
        secondInput = scanner.nextLine();

        canBuy();
    }

    private void canBuy(){
        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

        int revolvers = Integer.parseInt(firstArray[0]);
        long budget = Long.parseLong(firstArray[1]);

        long[] revolverPrices = new long[secondArray.length];

        for (int i = 0; i < secondArray.length; i++) {
            revolverPrices[i] = Long.parseLong(secondArray[i]);
        }

        long maxAffordable = -1;

        for (int i = 0; i < revolverPrices.length; i++) {
            if (revolverPrices[i] <= budget) {
                if (revolverPrices[i] > maxAffordable) {
                    maxAffordable = revolverPrices[i];
                }
            }
        }

        if (maxAffordable == -1) {
            System.out.println(0);
        } else {
            System.out.println(maxAffordable);
        }
    }
}
