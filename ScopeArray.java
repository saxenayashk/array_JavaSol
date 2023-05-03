public class ScopeArray {

    public static void updateFun(int arr[],int n)
    {
        System.out.println("Inside the function");

        arr[2]=120;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Going back to the main function");

    }
    public static void main(String[] args) {
        int arr[]={12,9,11,14,7,13};
        int n=arr.length;

        updateFun(arr, n);
        System.out.println("Printing in main function");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    /*
     OUTPUT:-
     Inside the function
     12 9 120 14 7 13 
     Going back to the main function
     Printing in main function
     12 9 120 14 7 13 
     */
}
