import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int ar[] = new int[1001];
	    
	    Scanner sc = new Scanner(System.in);
	    int m=sc.nextInt(), n=sc.nextInt();
	    
	    int ct=1;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            int x=sc.nextInt();
	            if(ar[x]==ct-1){
	                ar[x]++;
	            }
	        }
	        
	        for(int j=0; j<1001; j++){
	            if(ar[j]!=ct) ar[j]=0;
	            //System.out.print(ar[j]);
	        }
	        ct++;
	        //System.out.println();
	    }
	    
	    ct=0;
	    for(int i=0; i<1001; i++){
	        if(ar[i]!=0) ct++;
	    }
	    System.out.print(ct);
	    
	}
}
