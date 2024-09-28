

//import java.util.*;

public class linearSearch{
    public static void main(String[] args)
    {
            int arr[] = {1,34,56,7,334,44,55};
            int target = 334;
            int index=Search(arr, target);
            System.out.println(index);
    }


    static int Search(int arr[], int target)
    {
        if(arr.length==0)
        return -1;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            return i;
        }
        return Integer.MAX_VALUE;
    }
}
