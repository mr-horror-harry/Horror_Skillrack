// Main class extends the Solution class -- Position

import java.util.*;

class Position{
    static byte capsPos(char c){
        return (byte) (c - 'A' + 1);
    }
    static byte smallPos(char c){
        return (byte) (c - 'a' + 1);
    }
}

public class Hello extends Position{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        char c;
        
        StringBuilder sb = new StringBuilder("");
        
        while(n-->0){
            c = sc.next().charAt(0);
            if(c>='a' && c<='z')
                sb.insert(0, smallPos(c) + " ");
            else
                sb.insert(0, capsPos(c) + " ");
        }
        System.out.print(sb);
	}
}