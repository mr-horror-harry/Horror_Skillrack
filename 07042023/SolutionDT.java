import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int m=sc.nextInt(), n=sc.nextInt();
	    int mt[][] = new int[m][n];
	    int ar[] = new int[n];
	    
	    for(int i=0; i<m; i++)
	        for(int j=0; j<n; j++)
	            mt[i][j]=sc.nextInt();
	           
	   byte ff=0; 
	   for(int j=0; j<n; j++){
	       byte f=0;
	       for(int i=0; i<m; i++){
	           if( mt[0][j]%2 != mt[i][j]%2 ){
	               f=1;
	               break;
	           }
	       }
	       
	       if(f==0){
	           ff=1;
	           ar[j]=1; 
	       }
	   }
	   if(ff==0){
	       System.out.print(-1);
	       return;
	   }
	   
	   for(int i=0; i<m; i++){
    	   	 for(int j=0; j<n; j++){
    	      	 if(ar[j]==1){
    	           	 System.out.print(mt[i][j]+" ");
    	       }
    	   }
    	   System.out.println();
	   }
	    
	}
}
