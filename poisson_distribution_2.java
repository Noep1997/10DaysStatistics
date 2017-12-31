import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        double prob1 = (double) Math.round((160 + 40 * (0.88 + Math.pow(0.88, 2.0))) * 1000d) / 1000d;
        double prob2 = (double) Math.round((128 + 40 * (1.55 + Math.pow(1.55, 2.0))) * 1000d) / 1000d;

        System.out.println(prob1);
        System.out.println(prob2);
    }
}
