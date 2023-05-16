package com.Operators;

public class Operators {

        public static void main(String[] args) {
            int n1 = 10, n2 = 15, sum, sub, mul, div, mod;
            //ternary operator
            // String a1 = n2/n1=0  ?"True":"False";
            //  System.out.println(a1);

            //arthematic operations//
            sum = n1 + n2;//add
            System.out.println("sum-->" + sum);
            sub = n1 - n2;//sub
            System.out.println("sub-->" + sub);
            mul = n1 * n2;//mul
            System.out.println("mul-->" + mul);
            div = n1 / 2;//div -->gives quociant
            System.out.println("div-->" + div);
            mod = n1 % n2;//modulous --> gives remainder
            System.out.println("mod-->" + mod);

            // Assignment operator//
            int assign1 = n1 += n2; //+= -->  a=a+b --> a+=b
            int assign2= n1 -= n2;//-= -->  a=a-b --> a-=b
            int assign3 = n1 *= n2;//*= -->  a=a*b --> a*=b
            System.out.println("assing1-->"+assign1);
            System.out.println("assing2-->"+assign2);
            System.out.println("assing3-->"+assign3);


            //RELATIONAL OPERATOR
            //==,<,>,<=,>=,!
            int r1 = 10, r2 = 20;
            boolean m3 = r1==r2;
            boolean m4 = r1<=r2;
            boolean m5 = r1!=r2;
            System.out.println("m3-->"+m3);
            System.out.println("m4-->"+m4);
            System.out.println("m5-->"+!m5);

            // Logical operator
            int l1=20,l2=30;
            boolean logicaland = l1>=l2 && l1<=l2; // AND- if both conditions are true then returns true else false
            boolean logicalor = l1>=l2 || l1<=l2; //OR -if any one condition is satisfied returns true else false
            boolean logicalnot = l1!=l2;//NOT -  if the condition is true returns false and vice versa
            System.out.println("logicaland-->"+logicaland);
            System.out.println("logicalor-->"+logicalor);
            System.out.println("logicalnot-->"+!logicalnot);// here ! is used

            //unary operator
            //++ -increase by 1
            // 2 types --> pre increment and post increment

            //1.POST INCREMENT
            int u1=10,u2=20,u3=8,u4=6;
            u1++;//Post-increment
            System.out.println("Post-increment-->" + u1);
            //NOTE: here in the post increment the u1++ value will not be changed in the same line it show the incremented value in the next line.

            //2. PRE-INCREMENT
            ++u2;//pre -increment
            System.out.println("Pre-increment-->" + u2);

            // Decrement

            // 1. pre-decrement
            --u3;// u3=u3-1
            System.out.println("pre-decrement -->"+u3);

            //2. post-decrement
            u4--;// u4= u4-1
            System.out.println("post-decrement u4 -->"+u4);
        }
    }

