public class MinMaxArray {
    public static void Method(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        System.out.println("Maximum Value in the array is: "+max);
        System.out.println("Minimum Value in the array is: "+min);
    }
    public static void main(String[] args) {
        int arr[]={12,9,11,14,7,13};
        int n=arr.length;

        Method(arr, n);
    }
    /*
     OUTPUT:-
     Maximum Value in the array is: 14
     Minimum Value in the array is: 7
     */
}
