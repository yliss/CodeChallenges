package problemSolving.Staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem: https://www.hackerrank.com/challenges/staircase/
 */

class Result {

    public static void staircase(int n) {
        for (int i =0 ; i < n; i++){
            String line = "";
            for (int j = 0; j <= i ;j++)
                line=line + "#";
            System.out.format("%"+n+"s", line);
            System.out.println();
            line ="";
        }
    }

    public static void staircaseStringBuffer(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0 ; i < n; i++){

            for (int j = 0; j <= i ;j++)
                stringBuilder.append("#") ;
            System.out.format("%"+n+"s", stringBuilder.toString());
            System.out.println();
            stringBuilder = new StringBuilder();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

       // Result.staircase(n);
        Result.staircaseStringBuffer(n);

        bufferedReader.close();
    }
}
