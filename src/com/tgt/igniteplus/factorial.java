package com.tgt.igniteplus;
import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number of your choice");
        int n=in.nextInt();
        factorial f=new factorial();
        int s=f.fact(n);
        System.out.println("Factorial of the given number is: "+s);
    }
    public int fact(int n)
    {
            if(n==1)
                return 1;
            else
                return n*fact(n-1);
    }

}
