package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner kbReader = new Scanner(System.in);
        int n = kbReader.nextInt();
        if (n % 2 ==0) {
            System.out.println("Integer "+n+" is even");
        }
        else
        {
            System.out.println("Integer "+n+" is odd");
        }



    }
}

