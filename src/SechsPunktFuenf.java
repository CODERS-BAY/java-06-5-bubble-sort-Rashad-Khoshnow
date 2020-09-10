import java.util.Scanner;

public class SechsPunktFuenf {
    public static void main(String[] args) {
        int arr[] = new int[10], max, min ;
        double tmp;

        for(int i=0 ; i<arr.length ; i++)
        {
            tmp = 100*Math.random() ;
            tmp = Math.floor(tmp) ;
            arr[i] = (int)tmp ;
        }

        System.out.println("unsortiert");
        for(int i=0 ; i<arr.length ; i++)
            System.out.print(arr[i]);


        int temp ;
        for(int i=1 ; i < arr.length ; i++ )
            for(int j = arr.length - 1 ; j >= i ; j--)
                if ( arr[j-1] > arr[j] )
                {
                    temp      = arr[j-1] ;
                    arr[j-1] = arr[j];
                    arr[j]   = temp;
                }

        System.out.println("sortiert");
        for(int i=0 ; i<arr.length ; i++)
            System.out.println(arr[i]);

    }

}