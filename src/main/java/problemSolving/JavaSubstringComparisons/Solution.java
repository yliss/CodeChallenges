package problemSolving.JavaSubstringComparisons;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

/*
Problem: https://www.hackerrank.com/challenges/java-string-compare
 */
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        String[] subStrings ;
        for(int beginIndex =0 ; beginIndex<s.length();beginIndex+=k) {
            s.substring(beginIndex, beginIndex + k);
        }
        for(int beginIndex =1; beginIndex<s.length()-1;beginIndex+=k) {
            s.substring(beginIndex, beginIndex + k);
        }

        return smallest + "\n" + largest;
    }
    public static String getSmallestAndLargestSet(String s, int k) {
        SortedSet<String> subStringsList = new TreeSet<>();
        for(int beginIndex =0 ; beginIndex<s.length()-k;beginIndex+=k) {
            subStringsList.add(s.substring(beginIndex, beginIndex + k));
        }
        for(int beginIndex =1 ; beginIndex<s.length()-k+1;beginIndex+=k) {
            subStringsList.add(s.substring(beginIndex, beginIndex + k));
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return subStringsList.first() + "\n" + subStringsList.last();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}