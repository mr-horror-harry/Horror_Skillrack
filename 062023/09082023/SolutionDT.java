import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int r = new Scanner(System.in).nextInt();
	    int mt[][] = new int[r][r];
	    int i=-1, j=-1, ct, val=1, f=1, n=r;
	    
	    while(n>0){
	        if(f==1){
	            ct=n;
	            while(ct-->0){
	                i++; j++;
	                                        //System.out.println(i+" "+j+" "+val);
	                mt[i][j]=val++;
	                
	            }
	                                       //System.out.println();
	            f=2;
	            n--;
	            continue;
	        }
	        if(f==2){
	            ct=n;
	            while(ct-->0){
	                j--;
	                                        //System.out.println(i+ " " +j+" "+val);
	                mt[i][j]=val++;
	                
	            }
	                                        //System.out.println();
	            f=3;
	            n--;
	            continue;
	        }
	        if(f==3){
	            ct=n;
	            while(ct-->0){
	                i--;
	                                        //System.out.println(i+" "+j+" "+val);
	                mt[i][j]=val++;
	            }
	                                        //System.out.println();
	            f=1;
	            n--;
	            continue;
	        }
	    }
	    
	    
	    for(i=0; i<r; i++){
	        for(j=0; j<=i; j++){
	            System.out.print(mt[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
