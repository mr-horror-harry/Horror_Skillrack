//Note: This solution didnot pass all test cases on the day of dt
//However it works under no space cases.


import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int pi=n-1, eds=0, mds=1 + (n-4)*2;
        
        System.out.println("|".repeat(pi--) + "* ".repeat(n));
        for(int i=0; i<n-2; i++){
            
            if(mds<0) mds=0;
            System.out.println("|".repeat(pi--)+"* "+"-".repeat(eds)+" * " + 
            "-".repeat(mds)+" * "+ "-".repeat(eds)+" *");
            
            eds++;
            mds-=2;
        }
        
        System.out.println("* ".repeat(2*n-1));
        mds=0;
        
        for(int i=0; i<n-2; i++){
            eds--;
            mds += (i==0) ? 0 : (i==1) ? 1 : 2;
            
            System.out.println("|".repeat(++pi)+ "* " + "-".repeat(eds)+" * "+ "-".repeat(mds) +" * "+"-".repeat(eds)+" * ");    
        }
        System.out.println("|".repeat(++pi) + "* ".repeat(n));
	}
}