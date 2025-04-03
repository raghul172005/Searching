package Search1;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int tar=sc.nextInt();
        int result=linearSearch(arr, tar);
        if(result==-1){
            System.out.println("The given target element is not found in the array");
        }
        else{
            System.out.println("The target element "+tar+" is found in the position of "+(result+1));
        }
    }
    public static int linearSearch(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }

}
