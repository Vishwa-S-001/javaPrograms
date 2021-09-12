
import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;
class Vishwa
{
    private static String usingLooping(int[] a,int n)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i: a)
        {
            if(i>max) max=i;
            else if(i<min && i!=max) min=i;
        }
        return String.valueOf(min)+" "+String.valueOf(max);
    }
    private static String usingCollections(int[] a,int n)
    {
        Integer[] ar = new Integer[n];
        int k=0;
        for(int i:a) ar[k++]=Integer.valueOf(i);
        int min=Collections.min(Arrays.asList(ar));
        int max=Collections.max(Arrays.asList(ar));
        return String.valueOf(min)+" "+String.valueOf(max);
       //return String.valueOf(Collections.min(Arrays.asList(a)))+" "+String.valueOf(Collections.max(Arrays.asList(a)));
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(usingLooping(a,n));
        System.out.println("Using Collection framework: "+usingCollections(a,n));
        sc.close();
    }
}