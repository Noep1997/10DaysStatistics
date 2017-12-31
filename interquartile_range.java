import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        // scan first line and create an array of this size
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int initial[] = new int[n];
        int freq[] = new int[n];

        // fill and sort initial array
        for (int i = 0; i < n; i++)
            initial[i] = scan.nextInt();

        // fill frequencies array and calculate length of final array
        int len = 0;
        for (int i = 0; i < n; i++) {
            freq[i] = scan.nextInt();
            len += freq[i];
        }

        // fill final array
        int index = 0;
        int final_array[] = new int[len];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < freq[i]; j++) {
                final_array[index] = initial[i];
                index++;
            }
        }

        // sort final array
        Arrays.sort(final_array);

        // initialize sub arrays
        int list2[];
        int list3[];

        // check if n is odd or even and fill arrays
        if (n % 2 == 0) {
            list2 = Arrays.copyOfRange(final_array, 0, len / 2);
            list3 = Arrays.copyOfRange(final_array, len / 2, len);
        }
        else {
            list2 = Arrays.copyOfRange(final_array, 0, len / 2);
            list3 = Arrays.copyOfRange(final_array, len / 2 + 1, len);
        }

        // calculate and output quartiles
        double q1, q2, q3;

        if (list2.length % 2 == 0)
            q1 = ((double) list2[list2.length / 2] + (double) list2[list2.length / 2 - 1]) / 2;
        else
            q1 = (double) list2[list2.length / 2];

        if (list3.length % 2 == 0)
            q3 = ((double) list3[list3.length / 2] + (double) list3[list3.length / 2 - 1]) / 2;
        else
            q3 = (double) list3[list3.length / 2];

        // calculate and output interquartile range
        System.out.println(q3 - q1);
    }
}
