package com.tgt.igniteplus;
import java.util.*;
public class linearSearch
{
    public static void main(String[] args)
    {
        int flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("Enter the search element");
        int s=in.nextInt();
        for(int j=0;j<n;j++)
            if(a[j]==s)
                flag=1;
        if(flag==1)
            System.out.println("Search element found");
        else
            System.out.println("Search element not found");
    }
}
