import java.util.Scanner;

class Main{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        int dash=0, r=1, val=1;
		while(n>0){
		    System.out.print(("- ").repeat(dash++));
		    
		    StringBuilder sb = new StringBuilder("");
		    if(r%2==1){
		        for(int i=0; i<n; i++) sb.append((val++) + " * ");
		    }
		    else{
		        for(int i=0; i<n; i++)  sb.insert(0, (val++) + " * ");
		    }
		    System.out.println(sb.substring(0, sb.length()- 2));
		    r++;
		    n--;
		}
	}
}