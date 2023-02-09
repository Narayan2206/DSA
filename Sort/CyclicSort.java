import java.util.*;

public class CyclicSort
{
    public static void main(String[] args)
    {
         int[] arr = { 4, 0, 2, 1, 6, 8, 7};
            cyclicSort2(arr);

         System.out.println(Arrays.toString(arr));

         for(int i = 0 ; i < arr.length ; i++ )  //* Search for missing number in the sorted array
         {
            if(arr[i] != i)
            {
                System.out.println(i);
            }
         }
    }

    static void cyclicSort1(int[] arr) //* For range [1,n]
    {
        int i = 0;
        while( i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i ,correct);
            }
            else{
                i++;
            }
        }
    }

    static void cyclicSort2(int[] arr) //* For range [0,n]
    {
        int i = 0;
        while( i < arr.length)
        {
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i ,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}