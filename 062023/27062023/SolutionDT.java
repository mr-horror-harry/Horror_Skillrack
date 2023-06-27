import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char x = sc.next().charAt(0), y=sc.next().charAt(0);
        
        int min = s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==x){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(j)==y){
                        if(j-i-1 < min){
                            min = j-i-1;
                        }
                        break;
                    }
                }
            }
        }
        
        System.out.print(min);

	}
}