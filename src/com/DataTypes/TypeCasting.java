package com.DataTypes;

public class TypeCasting{
    public static void main(String[] args) {
    /*Converting one datatype to another datatype
    2 types
    1. Explicit and
    2. Implicit

    1.Explicit - also called as widening
   * Converting a lower datatype to a higher datatype is known as widening.
   * In this case the casting/conversion is done automatically therefore, it is known as implicit type casting.
   * In this case both datatypes should be compatible with each other
     */

    int a = 10; //4 bytes
    double b =  a; // 4 bytes
    System.out.println(b); //Implicit Type Casting converting from int to double.

     /* 2. Explicit Type casting - also called narrowing
      Narrowing − Converting a higher datatype to a lower datatype is known as narrowing.
     In this case the casting/conversion is not done automatically, you need to convert explicitly using the cast operator “( )” explicitly.
     Therefore, it is known as explicit type casting.
     In this case both datatypes need not be compatible with each other.
     */

     double f = 34.90d; // 8bytes
     int d =  (int)f;  // 4 bytes
     System.out.println(d);//Explicit Typecasting converting from double to int.

    }
}
