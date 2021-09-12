import java.util.*;
public class FrequencyOfItems {
    private static void usingMaps(int[] a,int n)
    {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.get(a[i])==null ? 1 : map.get(a[i])+1);
        }
        for(Map.Entry e : map.entrySet())
        {
            System.out.println("Element -> "+e.getKey()+" has occurred "+e.getValue()+" times");
        }
    }

    private static void BFApproach(int[] a,int n)
    {
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(visited[i]==true) continue;
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Element -> "+a[i]+" has occurred "+count+" times");
        }
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
        BFApproach(a,n);
        usingMaps(a, n);
    }
}
