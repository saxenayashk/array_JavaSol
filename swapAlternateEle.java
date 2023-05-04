public class swapAlternateEle {
    public static void Method(int arr[],int n)
    {
        for (int i = 0; i < n-1; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
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
        int arr[]={1,2,5,7,9};
        System.out.println("Array before swapping Alternate Elements.");
        print(arr, arr.length);
        Method(arr, arr.length);
        System.out.println("Array after swapping Alternate Elements.");
        print(arr, arr.length);

    }
    /*
     OUTPUT:-
     Array before swapping Alternate Elements.
     1 2 5 7 9 
     Array after swapping Alternate Elements.
     2 1 7 5 9 
     */
}
