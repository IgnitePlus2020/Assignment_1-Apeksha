package com.tgt.igniteplus;
import java.util.*;
public class primeNum
{
    public static void main(String[] args)
    {   int c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range of number...please enter the lower range first");
        int n=in.nextInt();
        int m=in.nextInt();
        for (int i = n; i <=m; i++)
        {
            c=1;
            for (int j = 2; j <i; j++)
            {
                if (i % j == 0)
                {
                    c=0;
                    break;
                }
            }
            if (c==1)   //print if prime
                System.out.print(i+" ");
        }
    }
}
