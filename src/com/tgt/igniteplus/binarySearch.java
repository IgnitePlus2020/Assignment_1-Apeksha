package com.tgt.igniteplus;
import java.util.*;
public class binarySearch
{
    public static void main(String[] args)
    {
        int i,j,temp=0,low=0,high,flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        int a[]=new int[n];
        high=n-1;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.println("Enter the search element");
        int s=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[j]>a[i])
                {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
                }
            }
        }
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(a[mid]==s)
                flag=1;
            if(a[mid]>s)    //access just the left part of the array
                high = mid-1;
            else            //access just the right part of the array
                low=mid+1;
        }
        if(flag==1)
            System.out.println("Search element found");
        else
            System.out.println("Search element not found");
    }
}
