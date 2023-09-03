package Tinkoff_Exam_Java;
import java.util.Scanner;
import java.util.*;

public class Sheriff {
    private String line;
    public void Sheriff() {

        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();

        Count();
    }

    private void Count(){
        int s, h, e, r, i, f, f_temp;
        s = 0; h = 0; e = 0; r = 0; i = 0; f = 0; f_temp = 0;
        int[] counter = new int[6];

        String[] arrayString = line.split("");

        for (int j = 0; j < arrayString.length; j++) {
            if (arrayString[j].equals("s")) {
                s++;
            } else if (arrayString[j].equals("h")) {
                h++;
            } else if (arrayString[j].equals("e")) {
                e++;
            } else if (arrayString[j].equals("r")) {
                r++;
            } else if (arrayString[j].equals("i")) {
                i++;
            } else if (arrayString[j].equals("f")) {
                f++;
                f_temp = f / 2;
            }
        }
        counter[0] = s; counter[1] = h; counter[2] = e;
        counter[3] = r; counter[4] = i; counter[5] = f_temp;

        Arrays.sort(counter);
        System.out.println(counter[0]);
    }
}
