// Pattern2 - 4
//1
//12
//123
//1234

import java.util.Scanner;
class Pattern2 {
    public static void main(String[] args) {
       
       for(int i =1;i<5;i++){
           for(int j=1;j<i+1;j++){
               System.out.print(j);
           }
           System.out.println();
       }
    }
}

