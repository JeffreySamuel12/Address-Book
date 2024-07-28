import java.util.*;
public class Main {



        public static void main(String[] args) {
            int[]arr={64,25,12,22,11};
            int len = arr.length;
            System.out.print("UnSorted array is :");
            for(int i=0;i<len;i++)
                System.out.println(arr[i]+" ");

            for(int  i=0;i<len-1;i++){
                int minIndex=i;
                for(int j=i+1;j<len;j++){
                    if(arr[minIndex]>arr[j]);
                    minIndex=j;
                }
                int temp=minIndex;
                minIndex=arr[i];
                arr[i]=temp;
            }
            System.out.println();
            System.out.print("Sorted array is :");
            for(int i=0;i<len;i++)
                System.out.println(arr[i] + " ");
        }
    }


