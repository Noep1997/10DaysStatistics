import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        // scan first line and create arrays of this size
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double first[] = new double[n];
        double second[] = new double[n];

        double sum1 = 0.0;
        double sum2 = 0.0;
        double mean1 = 0.0;
        double mean2 = 0.0;

        // fill first array
        for (int i = 0; i < n; i++) {
            first[i] = scan.nextDouble();
            sum1 += first[i];
        }

        // fill second array
        for (int i = 0; i < n; i++) {
            second[i] = scan.nextDouble();
            sum2 += second[i];
        }

        mean1 = sum1 / n;
        mean2 = sum2 / n;

        // calculate squared distance
        double squared_distance1 = 0.0;
        double squared_distance2 = 0.0;
        for (int i =0; i < n; i++) {
            squared_distance1 += Math.pow(first[i] - mean1, 2);
            squared_distance2 += Math.pow(second[i] - mean2, 2);
        }

        // calculate and output standard deviation
        double standard_deviation1 = Math.pow(squared_distance1 / n, 0.5);
        double standard_deviation2 = Math.pow(squared_distance2 / n, 0.5);

        // compute correlation coefficient
        double coeff = 0.0;
        for (int i = 0; i < n; i++) {
            coeff += (first[i] - mean1) * (second[i] - mean2);
        }
        coeff = coeff / (standard_deviation1 * standard_deviation2 * n);

        // round and output
        coeff = (double) Math.round(coeff * 1000.0) / 1000.0;
        System.out.println(coeff);
    }
}
