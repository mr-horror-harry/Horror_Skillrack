import java.util.regex.*;
import java.util.*;

public class Hello {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int res=0;
        
        Pattern ptn = Pattern.compile("\\d+");      
                    // create regex pattern for consective digits
        Matcher mtc = ptn.matcher(sc.next());    
                    // compare input with pattern
        
        while(mtc.find())
            res+=Integer.parseInt(mtc.group());
        
        System.out.print(res);
	}
}