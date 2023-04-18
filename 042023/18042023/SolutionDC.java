import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        
        String s = new Scanner(System.in).next().toLowerCase();
        
        System.out.println(s.indexOf('a')!=-1 && s.indexOf('e')!=-1 && s.indexOf('i')!=-1 && s.indexOf('o')!=-1 && s.indexOf('u')!=-1 ? "yes" : "no");
        
	}
}