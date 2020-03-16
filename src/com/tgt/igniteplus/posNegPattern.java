package com.tgt.igniteplus;
import java.util.*;
public class posNegPattern
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)      //check if even
                System.out.print(i+",");
            else
                System.out.print("-"+i+",");    //odd numbers with - sign
        }
    }
}
