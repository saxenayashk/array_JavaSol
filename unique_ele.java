public class unique_ele {
    public static int max_val(int arr[])
    {
        int res=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(x>res)
            {
                x=res;
            }
        }
        return res;
    }
    public static int min_val(int arr[])
    {
        int res=Integer.MAX_VALUE;
        for(int x:arr)
        {
            if(x<res)
            {
                 x=res;
            }
        }
        return res;
    }
    public static int Method(int arr[],int n)
    {
        int res=0;

        for (int i = 0; i < n; i++) {
            res=res^arr[i];    // Implemetation Logic:- a^0=a ; a^a=0
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,4,5,6,6,5};
        int n=arr.length;
        System.out.println("Unique Element in the array is: "+Method(arr, n));
    }
    /*
     OUTPUT:-
     Unique Element in the array is: 4
     */
}
