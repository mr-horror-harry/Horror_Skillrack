import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String ...args){
        String s="";
        try{
            s = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        }
        catch(IOException e){
            System.out.print("You got Error");
        }
        
        for(byte i=0; i<s.length()-2; i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                System.out.print("invalid");
                return;
            }
        }
        System.out.print("valid");
        return;
    }
}