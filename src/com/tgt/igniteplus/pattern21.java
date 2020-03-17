package com.tgt.igniteplus;
import java.util.*;
public class pattern21
{
    public static void main(String[] args)
    {   int res=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            res=res+(int)Math.pow(i,2);
            if(i%2==0)
                System.out.print(res+" ");
            else
                System.out.print("-"+res+" ");
        }
    }
}
