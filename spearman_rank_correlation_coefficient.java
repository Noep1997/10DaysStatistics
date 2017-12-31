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
        Double first[] = new Double[n];
        Double second[] = new Double[n];
        Double rank1[] = new Double[n];
        Double rank2[] = new Double[n];

        // fill first array
        for (int i = 0; i < n; i++) {
            first[i] = scan.nextDouble();
            rank1[i] = first[i];
        }
        // fill second array
        for (int i = 0; i < n; i++) {
            second[i] = scan.nextDouble();
            rank2[i] = second[i];
        }

        // since they are unique values, sorting the arrays makes their indexes their rank
        Arrays.sort(rank1);
        Arrays.sort(rank2);

        // calculate the d^2 part
        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double d = Arrays.asList(rank1).indexOf(first[i]) - Arrays.asList(rank2).indexOf(second[i]);
            sum += (double) Math.pow((double) d, 2.0);
        }

        // calculate coefficient
        double coeff = 1 - ((6 * sum) / (n * (Math.pow(n, 2) - 1)));
        coeff = (double) Math.round(coeff * 1000.0) / 1000.0;
        System.out.println(coeff);
    }
}
