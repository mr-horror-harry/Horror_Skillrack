import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        
        short val=1;
        char c='a';
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                //Alphabets
                for(int j=0; j<n; j++){
                    System.out.print("*" + ((char) ((c++ - 'a')%26 + 'a')));
                }
                System.out.println("*");
            }
            else{
                //Numbers
                for(int j=0; j<n; j++){
                    System.out.print("-" + val++);
                }
                System.out.println("-");
            }
            
        }
	}
}