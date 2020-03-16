package com.tgt.igniteplus;
import java.util.*;
public class naming
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        String s=Integer.toString(n);   //converting to string
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++) {
            a[i] = Character.getNumericValue(s.charAt(i)); //converting to array of numbers

            switch(a[i])
            {
                case 0:System.out.print("Zero\t");
                       break;
                case 1:System.out.print("One\t");
                    break;
                case 2:System.out.print("Two\t");
                    break;
                case 3:System.out.print("Three\t");
                    break;
                case 4:System.out.print("Four\t");
                    break;
                case 5:System.out.print("Five\t");
                    break;
                case 6:System.out.print("Six\t");
                    break;
                case 7:System.out.print("Seven\t");
                    break;
                case 8:System.out.print("Eight\t");
                    break;
                case 9:System.out.print("Nine\t");
                    break;
            }
        }

    }
}
