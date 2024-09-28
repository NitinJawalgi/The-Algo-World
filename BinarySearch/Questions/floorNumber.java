package BinarySearch.Questions;

public class floorNumber {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,12,2,23,34};
        int target = 7;
        int result = floor(arr,target);
        System.out.println(result);
    }
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end; //condition becomes false (E target S)
        //E is the greatest number smaller then target
    }
}