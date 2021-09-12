import java.util.*;
public class CountDuplicates {

    private static int usingSortingAndLooping(int[] a,int n)
    {
        int count=0;
        Arrays.sort(a);
        for(int i=1;i<n;i++)
        {
            if(a[i]==a[i-1]) count++;
        }
        return count;
    }

    private static int BFApproach(int[] a,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("Brute Force Approach : "+BFApproach(a,n));
        System.out.println("SORTING AND LOOPING : "+usingSortingAndLooping(a,n));
        sc.close();
    }
}
