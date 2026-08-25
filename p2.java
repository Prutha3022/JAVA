
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = p1.binarySearch(arr, target);
        if (result == -1) 
        {
            System.out.println("Element not present");
        } 
        else 
        {
            System.out.println("Element found at index " + result);
        }
    }
}