import java.util.*;

public class uniqueNumOccurences {

    public static boolean Naive(int arr[],int n)
    {
       HashMap<Integer,Integer> mp=new HashMap<>();

       for(int x:arr)
       {
        mp.put(x, mp.getOrDefault(x, 0)+1);
       }

       ArrayList<Integer> al=new ArrayList<>();
       Set<Integer> s=new HashSet<>();

       for(Map.Entry<Integer,Integer> m:mp.entrySet())
       {
        al.add(m.getValue());
        s.add(m.getValue());
       }
    
       return al.size()==s.size();
    }
    public static void main(String[] args) {
       int arr[]={-3,0,1,-3,1,1,1,-3,10,0};
       System.out.println("Are the occurences in the array unique: "+Naive(arr, arr.length));        
    }
    /*
     OUTPUT:-
     Are the occurences in the array unique: true
     */
}
