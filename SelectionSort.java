import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={33,22,44,11,55,1};
        int low,i,j,temp;
        for(i=0;i<arr.length-1;i++)
        {
            low=i;
            for (j=i+1;j < arr.length ; j++) {
                if (arr[low] > arr[j]) {
                    low = j;
                }
            }
            temp = arr[low];
            arr[low] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}
