package BinarySearch;

public class OrderAgnosticBsearch {
    public static  void main(String[] args)
    {
        //int  arr[] = {45,35,25,15,5,-5,-15};
        //descending array!
        int arr[]  = {5,15,25,35,45,55,65};
        //what if we dont know the in which order the array is sorted 
        // in this case the order agnostic binary search is used
        int target= 35;
        int result=agnosticSearch(arr,target);
        System.out.println(result);
    }

    static int agnosticSearch(int arr[], int target)
    {
        int start=0;
        int end = arr.length-1;
        int mid;

        boolean isAsc=arr[start]<arr[end];

        while(start<end)
        {
             mid= start+(end-start)/2;
             if(arr[mid]==target)
             return mid;

             else if(isAsc)
             {
                if(target<arr[mid])
                end=mid-1; 
                else 
                end=mid-1;
             }
             else 
             {
                if(target>arr[mid])
                end=mid-1;
                else
                start=mid+1;
             }
        }
        return -1;

    }
}
