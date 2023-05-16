package com.Operators;

import java.sql.SQLOutput;

public class TernaryOperator {
    //Ternary Operator used as alternative of if-else
    //Combination of ? and :
    /* Syntax:
       (expression/conmdition)?block1:block2;
    Suppose condition is true then block-1 get executed
  suppose condition is false then block2  will be executed
        */
    public static void main(String[] args) {

        int n1 =15 ; // declaration
        int n2 = 67;
        int n3 =100;

        //Code:Even or odd
        String result = (n1%2==0) ?"Even Number": "odd Number";
        System.out.println(result);

        // Code: greater than 2 numbers
        String invoice = (n1>n2)?"n1 is greater": "n2 is greater";
        System.out.println(invoice);

        //Code : Greater than 3 numbers
        int max = (n1>n2) ?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("Largest number among "+ n1+" "+n2+" and "+ n3+" is "+ max+".");



    }
}
