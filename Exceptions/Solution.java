package Exceptions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int input = Integer.parseInt(scan.nextLine());
            System.out.println(input);

            scan.close();

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
            // TODO: handle exception
        }
    }
}
