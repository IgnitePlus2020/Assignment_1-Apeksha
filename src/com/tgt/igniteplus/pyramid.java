package com.tgt.igniteplus;
import java.util.*;
public class pyramid
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)   //height
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
