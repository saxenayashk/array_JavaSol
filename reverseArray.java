public class reverseArray {

    public static void Reverse(int arr[],int n)
    {
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }
    public static void print(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={12,9,11,14,7,13};
        int n=arr.length;

        System.out.println("Array before getting reversed");
        print(arr, n);
        Reverse(arr, n);
        System.out.println("Array after getting reversed");
        print(arr, n);
    }
    /*
     OUTPUT:-
     Array before getting reversed
     12 9 11 14 7 13 
     Array after getting reversed
     13 7 14 11 9 12 
     */
}
