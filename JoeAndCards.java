package Tinkoff_Exam_Java;

import java.util.Scanner;
import java.util.*;

public class JoeAndCards {
    private int n;
    private boolean ofcourse;
    private int[] dream; // Желаемый массив
    private int[] real; // Реальный массив

    public void JoeAndCards(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // Размер массива
        ofcourse = true; // Проверка для вывода YES или NO

        dream = new int[n]; // Желаемый массив
        real = new int[n]; // Реальный массив

        for (int i = 0; i < n; i++) {
            real[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            dream[i] = scanner.nextInt();
        }

        Count();
    }

    private void Count(){
        int r = 0; // Индекс числа справа, с которого в real массиве
        // отличаются числа от чисел в dream массиве

        int l = 0; // Индекс числа слева, с которого в real массиве
        // отличаются числа от чисел в dream массиве

        int[] dreamFake = new int[n];
        int[] realFake = new int[n];

        for (int i = 0; i < n; i++) {
            dreamFake[i] = dream[i];
            realFake[i] = real[i];
        }

        Arrays.sort(dreamFake);
        Arrays.sort(realFake);

        for (int i = 0; i < n; i++){
            if (dreamFake[i] != realFake[i]) {
                break;
            }
        }

        for (int i = 0; i < n; i++){
            if (dream[i] != real[i]) {
                i = n;
                l--;
            }
            l++;
        }

        for (int i = n - 1; i > 0; i--){
            if (dream[i] != real[i]) {
                break;
            }
            r++;
        }

        int temp = n - l - r;
        int[] tempArray = new int[temp];

        int j = 0;

        for(int i = l; i < n - r; i++){
            tempArray[j] = real[i];
            j++;
        }

        Arrays.sort(tempArray);

        j = 0;

        for(int i = l; i < n - r; i++){
            real[i] = tempArray[j++];
        }

        for (int i = 0; i < n; i++){
            if (dream[i] != real[i]) {
                ofcourse = false;
                break;
            }
        }

        if (ofcourse)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
