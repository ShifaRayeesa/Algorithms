import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public void sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int pivot=partition(arr,start,end);
            sort(arr,start,pivot-1);
            sort(arr,pivot+1,end);
        }
    }

    public int partition(int[] arr,int start,int end)
    {
        int pivot=arr[end],x=start-1,i,temp;

        for(i=start;i<end;i++)
        {
            i++;
            if(arr[i] < pivot)
            {
                temp=arr[i];
                arr[i]=arr[x];
                arr[x]=arr[i];
            }
        }
        temp=arr[x+1];
        arr[x+1]=arr[end];
        arr[end]=temp;
        return x+1;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={33,22,44,11,55,1};
        QuickSort sort=new QuickSort();
        sort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
