package com.kodilla;

/**
 * Created by ola on 03/07/2017.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(8, 2);
        System.out.println(result);
        System.out.println("It works!");
    }
}


