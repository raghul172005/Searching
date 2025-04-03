package Search1;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element size");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element to search");
        int tar=sc.nextInt();
        int result=binarySearch(arr,tar);
        if(result==-1){
            System.out.println("The target element "+tar+" not found in the array");
        }
        else {
            System.out.println("The target element "+tar+" is found in the array in the location of "+(result+1));
        }
    }
    public static int binarySearch(int[] arr,int tar){
        Arrays.sort(arr);
        int start=0,end=arr.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if (arr[mid]==tar){
                return mid;
            } else if (arr[mid]<tar) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
