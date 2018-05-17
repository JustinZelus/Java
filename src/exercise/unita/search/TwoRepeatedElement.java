package exercise.unita.search;
//Created by JZ on 2018/5/17.

import java.util.Scanner;

/**
 * you are given an array of N+2 integer elements.All elements of the array
 * are in range 1 to N. And all elements occur once except two numbers
 * which occur twice. Find the two repeating numbers.
 *
 *
 * Input:
 * The first line of the input contains an integer T, denoting the total number
 * of test cases. Then T test cases follow Each test case consists of two
 * lines. First line of each test case contains an integer N denoting the range
 * of numbers to be inserted in array of size N+2. Second line of each test
 * case contains the N+2 space separated integers denoting the array
 * elements.
 *
 *
 * Output:
 * Print the two elements occuring twice in the array. Order of the two
 * elements must be preserved as in the original list, i.e.,print the elements
 * which arrives first(2nd time).
 *
 *
 * Constraints
 * 1 <= T <= 30
 * 1 <= N <= 100
 *
 *
 * Example
 *
 * Input
 * 1
 * 4
 * 1 2 1 3 4 3
 * Output
 * 1 3
 *
 */

public class TwoRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int n2 = n + 2;
            int[] arr = new int[n2];
            for(int i = 0; i < n2; i++) {
                if (sc.nextInt() > n) {
                    System.out.println("input wrong number");
                    i = 0;
                }
                else
                    arr[i] = sc.nextInt();
            }
            printRepeatingMethod1(arr,n);
        }
    }

    public static void printRepeatingMethod1(int[] arr , int size) {
        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++) {
                if(arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
