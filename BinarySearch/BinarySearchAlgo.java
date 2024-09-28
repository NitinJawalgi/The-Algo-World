package BinarySearch;

public class BinarySearchAlgo
{
        public static void main(String[] args) {
           
            int[] arr = {1, 2, 3, 4, 5,7,9,12,};
            int target = 7;
            int result = binarySearch(arr, target);
            System.out.println("Element is present at index " + result);
        }

        static int binarySearch(int arr[], int target)
        {
            int start=0;
            int end=arr.length-1;
            int mid;

            while(start<end)
{           mid = start+(end-start)/2;
            if(arr[mid]==target){
            return mid;
            }
            else if(target>arr[mid])
            {
            start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
            return -1;
        
        }
}