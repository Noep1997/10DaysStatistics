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
        int list[] = new int[n];

        // fill the array with the numbers and calculate mean
        double mean = 0.0;
        for (int i = 0; i < n; i++) {
            list[i] = scan.nextInt();
            mean += list[i];
        }

        // calculate and output mean
        mean = (double) Math.round(mean / n * 10.0) / 10.0;
        System.out.println(mean);

        // calculate and output median
        Arrays.sort(list);
        double median;
        if (list.length % 2 == 0)
            median = ((double) list[list.length / 2] + (double) list[list.length / 2 - 1]) / 2;
        else
            median = (double) list[list.length / 2];
        System.out.println(median);

        // calculate and output mode
        int count[] = new int[100001];
        // count the occurrences
        for (int i = 0; i < n; i++) {
          count[list[i]]++;
        }
        // go backwards and find the count with the most occurrences
        int mode = count.length - 1;
        for (int i = count.length - 2; i >= 0; i--) {
            if (count[i] >= count[mode])
             mode = i;
        }
        System.out.println(mode);
   }
}
