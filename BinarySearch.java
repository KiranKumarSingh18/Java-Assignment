// Binary search - 6
import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
       int n =5;
       int[] arr = {1,2,3,4,5};
       
       int key = 1;
       
       int s =0;
       int e = arr.length -1;
       
       int mid = (e+s)/2;
       int count=0;
       while(s<=e){
           if(arr[mid] > key){
               e = mid-1;
           }
           else if(arr[mid]<key){
               s=mid+1;
           }
           else if(arr[mid] ==key){
               System.out.println(mid);
		count = 1;
               break;
           }
           
           mid = (s+e)/2;
       }
	if(count ==0)
	System.out.println("element not found");
       
    }
}