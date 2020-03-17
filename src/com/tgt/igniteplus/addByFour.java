package com.tgt.igniteplus;
import java.util.*;
public class addByFour
{
    public static void main(String[] args)
    {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number of terms");
        int n=in.nextInt();
        int a[]=new int[n];
        a[0]=1;a[1]=-2;
        for(i=2;i<n;i++)
        {
            if(i%2==0)
                a[i]=a[i-2]+3;
            if(i%2!=0)
                a[i]=a[i-2]-4;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
