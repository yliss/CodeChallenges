package problemSolving.BirthdayCakeCandles;
/*
Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/
 */

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int hNumber=0;
        int count=0;

        for (Integer n : candles){
            count ++;
            if (n > hNumber){
                hNumber= n;
                count= 1;
            }
        }
        return count;
    }
    public static int birthdayCakeCandlesTwo(List<Integer> candles) {
        int maxNumber = Collections.max(candles);
        int count = 0;
        for (int n : candles)
            if (n == maxNumber)
                count++;
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}