package com.tgt.igniteplus;
import java.util.*;
public class reverseString
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.nextLine();
        char c[]=new char[s.length()];
        c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
            System.out.print(c[i]);
    }
}
