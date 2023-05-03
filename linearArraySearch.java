public class linearArraySearch {

    public static int Method(int arr[],int n,int x)
    {
        for (int i = 0; i < n; i++) {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean isElementPresent(int arr[],int n,int x)
    {
        if(Method(arr, n, x)!=-1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={12,9,11,14,7,13};
        int n=arr.length;

        System.out.println("Is "+11+" present in the array: "+isElementPresent(arr, n, 11));
        System.out.println("Is "+15+" present in the array: "+isElementPresent(arr, n, 15));
    }
    /*
     Is 11 present in the array: true
     Is 15 present in the array: false
     */
}
