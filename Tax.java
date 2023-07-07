// Tax Program - 1

import java.util.Scanner;

class Tax {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int mS = sc.nextInt();
		
		int ys = mS * 12;
		
		if(ys>=100000 && ys<=250000){
		    System.out.println("No tax");
		}
		else if(ys>=250001 && ys<=500000){
		    ys = ys -250000;
		    int tax = ys*10/100;
		    System.out.println(tax);
		}
		else if(ys>=500001 && ys<=1000000){
		    ys = ys - 500000;
		    int tax = 250000*10/100 + ys*20/100;
		    System.out.println(tax);
		}else if(ys>=1000001){
		    ys = ys-1000000;
		    int tax = 250000*10/100 + 250000*20/100 + ys*30/100;
		    System.out.println(tax);
		}
    }
}
