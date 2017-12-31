import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        double p = 1.0 / 3.0;
        double q = 1.0 - p;

        double prob = (p * Math.pow(q, 5.0 - 1.0)) + (p * Math.pow(q, 4.0 - 1.0)) + (p * Math.pow(q, 3.0 - 1.0)) + (p * Math.pow(q, 2.0 - 1.0)) + (p * Math.pow(q, 1.0 - 1.0));

        prob = (double) Math.round(prob * 1000d) / 1000d;

        System.out.println(prob);
    }
}
