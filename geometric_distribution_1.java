import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        double p = 1.0 / 3.0;
        double q = 1.0 - p;
        double n = 5.0;

        double prob = p * Math.pow(q, n - 1.0);

        prob = (double) Math.round(prob * 1000d) / 1000d;

        System.out.println(prob);
    }
}
