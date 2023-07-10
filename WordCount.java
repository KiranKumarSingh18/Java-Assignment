// Word Count - 8
// approach 1
class WordCount{
	public static void main (String[] args){
		String s = "   welcome    to    java  world        ";
		
// 		if(s.charAt(0)!=' '){
// 		    System.out.println("yes"+s.length());
// 		}
		int count =0;
		int i=0,j=0;
		while(j<s.length() ){
				// System.out.println("outer");
		    if(s.charAt(i) != ' '){
		      //  System.out.println("if");
		        while(  j<s.length()){
    				// System.out.println("inner");
    				if(s.charAt(j)==' ' ){
    		            i =j;
		        i=i+1;
		        j=j+1;
		        count++;
    		            break;
    		        }else if(s.charAt(i)!=' ' && j==s.length()-1){
    		            count++;
    		        }
    		        else{
    		            j++;
    		        }
		        
		        }
		    }
		    else{
		        i =j;
		        i=i+1;
		        j=j+1;
		    }
		}
		System.out.println(count);

        // String[] ss = s.trim().split(" ");
        
        // System.out.println(ss.length);
	}
}


// approach 2

import java.util.*;
class WordCount
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int s1=s.length();
        for(int i=0;i<s1-1;i++)
        {
            if(i ==0 && s.charAt(i)!=' ')
            {
             count++;  
            }
            if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
            {
                count=count+1;
               
               
            }
        }

   
        System.out.println(count);
    }
}
				
