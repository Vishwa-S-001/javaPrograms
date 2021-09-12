import java.util.*;
public class RemoveDuplicates {

    private static ArrayList<Integer> sortingAndLoopingStoringInArrayList(int[] a,int n)
    {
        ArrayList<Integer> al =new ArrayList<>();
        Arrays.sort(a);
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1]) al.add(a[i]);
        }
        return al;
    }

    private static int sortingAndLoopingStoringInArray(int[] a,int n)
    {
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i-1]) a[j++]=a[i];
        }
        a[j++]=a[n-1];
        return j;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sc.close();
        System.out.println("SORTING AND LOOPING : "+sortingAndLoopingStoringInArrayList(a,n));
        int r=sortingAndLoopingStoringInArray(a,n);
        for(int i=0;i<r;i++)
        {
            System.out.println(a[i]);
        }

    }
}
