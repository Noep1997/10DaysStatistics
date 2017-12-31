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
        int values[] = new int[n];

        // fill and sort initial array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            values[i] = scan.nextInt();
            sum += values[i];
        }

        // mean
        double mean = sum / n;

        // calculate squared distance
        double squared_distance = 0.0;
        for (int i =0; i < n; i++) {
            squared_distance += Math.pow(values[i] - mean, 2);
        }

        // calculate and output standard deviation
        double standard_deviation = Math.pow(squared_distance / n, 0.5);
        standard_deviation = (double) Math.round(standard_deviation * 10.0) / 10.0;
        System.out.println(standard_deviation);
    }
}
