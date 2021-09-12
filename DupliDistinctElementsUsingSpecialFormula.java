import java.util.*;
public class DupliDistinctElementsUsingSpecialFormula {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sc.close();
        // SPECIAL FORMULA....
        for(int i=0;i<n;i++)
        {
            a[a[i]%n]=a[a[i]%n]+n;
        }
        System.out.println("Distinct Elements : ");
        for(int i=0;i<n;i++)
        {
            if(a[i]>=n*2) System.out.println(i);
        }
    }
}
