import java.util.*;

// https://leetcode.com/problems/first-missing-positive/description/

public class FirstPositiveNum
{
    public static void main(String[] args)
    {
        //  int[] arr = {1,2,0};
        //  int[] arr = {3,4,-1,1};
         int[] arr = {0,1,2,3,5};
         System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {

      int i = 0 ;

      while( i < arr.length) 
      {
        int correct = arr[i] -1;
        if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct])
        {
            swap(arr, i, correct);
        }
        else{
            i++ ; 
        }
      }   

      for( int j = 0 ; j < arr.length ; j++)
      {
        if(arr[j] != j+1)
        {
            return j+1;
        }
      }

      return arr.length +1;
    }

    static void swap(int[] arr, int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}