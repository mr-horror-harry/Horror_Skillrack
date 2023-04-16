import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n=sc.nextByte(); sc.nextLine();
        
        String res="";
        byte cCt=0;
        
        while(n>0){
            String ar[] = calcCons(sc.nextLine());
            
            byte tmp=Byte.parseByte(ar[1]);
            if(tmp>cCt){
                cCt=tmp;
                res=ar[0];
            }
            n--;
        }
        System.out.println(res);
        
	}
	
	static String[] calcCons(String s){
	    String res[]=new String[2];
	    
	    byte ct=0;
	    
	    for(byte i=0; i<s.length(); i++){
	        char c=Character.toLowerCase(s.charAt(i));
	        
	        if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) ct++;
	    }
	    res[0]=s;
	    res[1]=Byte.toString(ct);
	    
	    return res;
	}
	
}