import java.util.*;


public class MissingNum
{
    public static void main(String[] args)
    {
        int[] arr = {0,1};
       
       System.out.println(missingNumber(arr));
    }

     public static List<Integer> disapparedNum(int[] arr)
     {
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/894781906/
        
        int i = 0;
        while( i < arr.length)
        {
            int correct = arr[i] -1 ;
            if( arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();

        for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j] != j+1){
             ans.add(j+1);
            }
        }
        return ans;

        
    }

    public static int missingNumber(int[] arr) {
        // https://leetcode.com/problems/missing-number/description
        int i = 0 ;

        while( i < arr.length)
        {
            int correct = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for( int j = 0 ; j < arr.length ; j++)
        {
           if( arr[j] != j)
           {
               return j;
           }
        }

        return arr.length;
    }

    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}