package Tinkoff_Exam_Java;

import java.util.Arrays;
import java.util.Scanner;

public class bankRobbery {
    private int n;
    private int m;
    private int[] banknote;
    private int[] stolenBanknote;
    private int stolenBanknoteN;

    public void bankRobbery(){

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // Необходимая сумма
        m = scanner.nextInt(); // Количество номиналов купюр
        banknote = new int[2*m]; // Массив номиналов купюр
        stolenBanknote = new int[2*m]; // Массив украденных купюр
        stolenBanknoteN = 0;

        for (int i = 0; i < 2*m; i = i+2) {
            banknote[i] = scanner.nextInt();
            banknote[i+1] = banknote[i];
        }

        stealMoney();
    }

    private void stealMoney(){
        Arrays.sort(banknote); // Сортируем номиналы купюр по возрастанию

        int k = 2*m-1;

        for (int i = 2*m-1; i >= 0; i--) {
            if (banknote[i] <= n && n >= 0){
                n = n - banknote[i];
                stolenBanknote[k--] = banknote[i];
                stolenBanknoteN++;
            }
        }
        if (n == 0){
            System.out.println(stolenBanknoteN);
            for (int j = (2*m)-1; j >= (2*m) - stolenBanknoteN; j--) {
                System.out.print(stolenBanknote[j] + " ");
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
