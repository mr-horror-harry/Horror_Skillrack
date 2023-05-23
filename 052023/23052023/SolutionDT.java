import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        int ct, beg=1, val, f=0, dCt=0;
        
        while(n>0){
            ct=2*n-1;
            System.out.print("-".repeat(dCt++));
            if(f==0){
                f=1;
                val=beg;
                while(ct>0){
                    System.out.print(val++);
                    ct--;
                    if(ct>0){
                        System.out.print("*");
                        ct--;
                    }
                }
            }
            else{
                f=0;
                beg++;
                val=beg;
                while(ct>0){
                    System.out.print("*");
                    ct--;
                    if(ct>0){
                        System.out.print(val++);
                        ct--;
                    }
                }
            }
            System.out.println();
            n--;
        }

	}
}