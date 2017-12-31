import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // scan first line and create an array of this size
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int list1[] = new int[n];

        // initialize sub arrays
        int list2[];
        int list3[];

        // fill and sort initial array
        for (int i = 0; i < n; i++)
            list1[i] = scan.nextInt();
        Arrays.sort(list1);

        // check if n is odd or even and fill arrays
        if (n % 2 == 0) {
            list2 = Arrays.copyOfRange(list1, 0, n / 2);
            list3 = Arrays.copyOfRange(list1, n / 2, n);
        }
        else {
            list2 = Arrays.copyOfRange(list1, 0, n / 2);
            list3 = Arrays.copyOfRange(list1, n / 2 + 1, n);
        }

        // calculate and output quartiles
        double q1, q2, q3;

        if (list2.length % 2 == 0)
            q1 = ((double) list2[list2.length / 2] + (double) list2[list2.length / 2 - 1]) / 2;
        else
            q1 = (double) list2[list2.length / 2];

        if (list1.length % 2 == 0)
            q2 = ((double) list1[list1.length / 2] + (double) list1[list1.length / 2 - 1]) / 2;
        else
            q2 = (double) list1[list1.length / 2];

        if (list3.length % 2 == 0)
            q3 = ((double) list3[list3.length / 2] + (double) list3[list3.length / 2 - 1]) / 2;
        else
            q3 = (double) list3[list3.length / 2];

        System.out.println((int) Math.round(q1));
        System.out.println((int) Math.round(q2));
        System.out.println((int) Math.round(q3));
    }
}
