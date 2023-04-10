// Todays DC Soln using Interface logic

import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	    Soln soln = new Soln( new Scanner(System.in).next());
	    soln.stringParse();
	    
	    int res = soln.res;
	    
	    System.out.print(res==0 ? -1 : res>0 ? "FIRSTHALF" : "SECONDHALF");
	    return;
	}
}

interface SolnInterface{
    public void stringParse();
    public void simple(); 
}

class Soln implements SolnInterface{
    int res=0;
    String s;
    
    Soln(String str){
        s=str;
    }
    
    public void stringParse(){
        for(char c : s.toCharArray()){
            res += c>='a' && c<='m' ? 1 : -1;
        }
    }
    public void simple(){
        
    }
}
