import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatesUnsortedArray {

    private static void usingMaps(int[] a,int n)
    {
        HashMap<Integer,Boolean> map =new LinkedHashMap<>();
        for(int i=0;i<n;i++) 
        {
            if(map.get(a[i])==null)
            {
                System.out.println(a[i]); // UNIQUE ELEMENETS IN ATHE ARRAY
            }
            map.put(a[i],true);
        }
    }

    private static void usingSets(int[] a,int n)
    {
        Set<Integer> set =new LinkedHashSet<>();
        for(int i: a) set.add(i); 
        System.out.println(set);
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
       // usingMaps(a, n);
        usingSets(a,n);
    }
}
