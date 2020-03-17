package com.tgt.igniteplus;
import java.util.*;
public class power
{
    public static void main(String[] args)
    {   int res=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number and it's degree respectively");
        int x=in.nextInt();
        int n=in.nextInt();
        for(int i=n;i>0;i--)
            res=res*x;
        System.out.println(res);
    }
}
