import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args)
    {
        int temp,swap=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of elements to be sorted");
        int count=sc.nextInt();
        int[] arr=new int[count];
        System.out.println("Enter elements to be sorted");
        for (int i=0; i < count ; i++ )
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<count-1;i++,swap=0)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            if(swap<1) break;
            System.out.println(Arrays.toString(arr));
        }
    }
}
