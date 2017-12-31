import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int values[] = new int[n];
        int weight[] = new int[n];

        double sum = 0.0;
        double total_weight = 0.0;
        double weighted_mean = 0.0;

        for (int i = 0; i < n; i++) {
            values[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            weight[i] = scan.nextInt();
            total_weight += weight[i];
        }

        for (int i = 0; i < n; i++) {
            sum += values[i] * weight[i];
        }

        weighted_mean = (double) Math.round(sum / total_weight * 10.0) / 10.0;
        System.out.println(weighted_mean);
    }
}
