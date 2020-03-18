package com.tgt.igniteplus;
import java.util.*;
public class separation
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        double n=in.nextDouble();
        String s = Double.toString(n);
        String[] b = s.split("\\.");
        int a= (int)n;
        int d = Integer.parseInt(b[1]);
        System.out.println(a+" "+b[1]);
    }
}
