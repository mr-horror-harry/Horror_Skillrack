import java.util.*;
import java.io.*;
public class Hello {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ar[] = new String[n];
        int mLen = 0;
        for(int i=0; i<n; i++){
            ar[i]=sc.next();
            int len = ar[i].length();
            
            mLen = len>mLen ? len : mLen;
        }
        
        int pos=0;
        while(pos<mLen){
            
            String res="1000000000000001";
            int min=9;
            for(int i=0; i<n; i++){
                try{
                    if(ar[i].charAt(pos)-'0' < min){
                        res = ar[i];
                        min = ar[i].charAt(pos)-'0';
                    }
                    else if(ar[i].charAt(pos)-'0' == min){
                        if(Long.parseLong(ar[i]) < Long.parseLong(res)){
                            res = ar[i];
                        }   
                    }
                }
                catch(StringIndexOutOfBoundsException e){
                    
                }
            }
            System.out.print(res+" ");
            pos++;
        }
	}
}