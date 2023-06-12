package problemSolving.MiniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Problem: https://www.hackerrank.com/challenges/mini-max-sum/
 */
class Result {

    public static void miniMaxSumImperative(List<Integer> arr) {
        Collections.sort(arr);
        Double min =0.0;
        Double max =0.0;

        for (int i =0 ; i<= 4 && i < arr.size() - 1; i++)
            min += arr.get(i);
        for (int i =arr.size() -4 ; i < arr.size() ; i++)
            max+= arr.get(i);
        System.out.println(min.longValue()+ " " + max.longValue());
    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int [] result = new int[2];
        result[0] = arr.stream().limit(4).mapToInt(Integer::intValue).sum();
        result[1] = arr.stream().skip(arr.size() - 4).mapToInt(Integer::intValue).sum();
        System.out.println(result[0] + " " + result[1]);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSumImperative(arr);

        bufferedReader.close();
    }
}
