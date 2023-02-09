

import java.util.*;

public class DuplicateNum
{
    public static void main(String[] args)
    {
          int arr[] = {4,3,2,7,8,2,3,1};
          System.out.println(Arrays.toString(findDuplicates(arr)));
    }

    public int findDuplicate(int[] arr) {
        // https://leetcode.com/problems/find-the-duplicate-number/description
        int i = 0;
        while( i < arr.length)
        {
            if( arr[i] != i+1 )
            {
                int correct = arr[i] -1 ;
                if( arr[i] != arr[correct])
                {
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

     public List<Integer> findDuplicates(int[] arr) {
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

        List<Integer> ans = new ArrayList<Integer>();
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

        for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j] != j+1){
             ans.add(arr[j]);
            }
        }
        return ans;
        
    }

    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}