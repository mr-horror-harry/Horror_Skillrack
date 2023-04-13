import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n=new Scanner(System.in).nextInt();
	    
	    int ct=1, val=1;
	    while(n>0){
	        System.out.print("*".repeat(n-1));
	        
	        for(int i=0; i<ct; i++) System.out.print(val++);
	        System.out.println();
	        ct++;
	        n--;
	    }
	}
}