import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={33,22,44,11,55,1};
        int temp,current,k;
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            current=arr[i];
            while (j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
