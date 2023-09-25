import java.util.Scanner;
public class Hello {
    
    static String countZero(int res, int m){
        int x = (int)Math.log10(res) - (int)Math.log10(m);
        String s="";
        while(x-->0)
            s+="0";
        return s;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt(), res=0;
        
        for(int i=m; i<=n; i++)
            res+=i;
        
        int l=(int) Math.log10(res)+1;
        
        System.out.print("+"+"-".repeat(l)+"+\n");
        while(m<=n){
            System.out.println("|"+ countZero(res, m) + m +"|");
            m++;
        }
        System.out.print("+"+"-".repeat(l)+"+\n" + 
                            "|"+ res + "|\n" + "+"+
                                "-".repeat(l)+"+");
	}
}