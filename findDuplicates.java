import java.util.*;
public class findDuplicates {
    public static void Method(int arr[],int n)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("Duplicates in the array are: ");
        for(Map.Entry<Integer,Integer> m:mp.entrySet() )
        {
             if(m.getValue()>1)
             {
                System.out.print(m.getKey()+" ");
             }
        }
        System.out.println();
    }
    public static int oneDuplicateEle(int arr[],int n)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=ans^arr[i];
        }

        for(int i=1;i<n;i++)
        {
            ans=ans^i;
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-3,0,1,-3,1,1,1,-3,10,0};
        int n=arr.length;
        Method(arr, n);

        int brr[]={1,2,3,2,4,5};
        int m=brr.length;
        System.out.println("Duplicate Element in the array is: "+oneDuplicateEle(brr, m));
    }
    /*
     OUTPUT:-
     Duplicates in the array are: 
     0 1 -3 
     Duplicate Element in the array is: 2
     */
}
