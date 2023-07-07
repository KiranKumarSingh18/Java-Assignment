//Linear Search - 5

import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int key = sc.nextInt();
       
       int[] arr = new int[n];
       for(int i =0;i<n;i++){
           arr[i] = sc.nextInt();
           if(arr[i] == key){
               System.out.println(i);
           }
       }
    }
}
