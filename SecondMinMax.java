import java.util.Scanner;
public class SecondMinMax {
    
    private static void usingLooping(int[] a,int n)
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]!=max1) max2=a[i];
            else if(a[i]<min1)
            {
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2 && a[i]!=min1) min2=a[i];
        }
        if(min2==Integer.MAX_VALUE && max2==Integer.MIN_VALUE)
        {
            System.out.println("There is no max2 and min2");
            if(min1==max1) System.out.println("All the elements are unique");
        } 
        else System.out.println("MAX1 : "+max1+"MAX2 : "+max2+"MIN1 : "+min1+"MIN2 : "+min2);
        

    }
    
    public static void main(String[] ars)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        usingLooping(a,n);
        sc.close();
    }
}
