public class arraySum {
    public static int Method(int arr[],int n)
    {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={12,9,11,14,7,13};
        int n=arr.length;

        System.out.println("The Sum of the array elements are: "+Method(arr, n));
    }
    /*
     OUTPUT:-
     The Sum of the array elements are: 66
     */
}
