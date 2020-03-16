package com.tgt.igniteplus;
import java.util.*;
public class largestOfThree
{
    public static void main(String[] args)
    {   int i,j;
        int temp;
        Scanner sc=new Scanner(System.in);
        int n[]=new int[3];
        System.out.println("Enter the three numbers");
        for(i=0;i<3;i++)
        {
            n[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<i;j++)
            {
                if (n[j] < n[i])
                {
                    temp=n[j];
                    n[j]=n[i];
                    n[i]=temp;
                }
            }
        }
        System.out.println("The largest and second largest number is as follows:");
        for(j=0;j<2;j++)
        {
            System.out.println(n[j]);
        }
    }
}
