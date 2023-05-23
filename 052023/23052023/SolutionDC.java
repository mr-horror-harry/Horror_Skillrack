import java.util.*;

class Converter{
    
    StringBuilder sb;
    
    String binaryRep(int x){
        sb = new StringBuilder("");   
        while(x>0){
            sb.insert(0, x%2);
            x/=2;
        }
        return sb.toString();
    }
    
    String octalRep(int x){
        sb = new StringBuilder("");
        while(x>0){
            sb.insert(0, x%8);
            x/=8;
        }
        return sb.toString();
    }
    
}

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(), n=sc.nextInt();
        
        Converter cvr = new Converter();
        while(n>0){
            System.out.print(cvr.binaryRep(x++) + " ");
            n--;
            
            if(n>0) System.out.print(cvr.octalRep(x++) + " ");
            n--;
        }
	}
}