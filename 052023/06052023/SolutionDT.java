import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    String s = new Scanner(System.in).next();
	    
	    byte l=(byte)s.length();
	    byte ar[] = new byte[l];
	    byte p=0;
	    String x="";
	    
	    while(!s.equals(x)){
	        
	        x="";
	        for(byte i:ar){
	            x+=i;
	        }
	        System.out.println(x);
	        
	        try{
    	        if(ar[p]!=s.charAt(p)-'0'){
    	            ar[p]++;
    	        }
    	        else{
    	            ar[++p]++;
    	        }
	        }
	        catch(Exception e){
	            return;
	        }
	    }
	    
	}
}
