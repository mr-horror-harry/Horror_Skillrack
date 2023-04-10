import java.util.*;
class SolutionDC{

    public static void main(String[] args) {
        
        double n = new Scanner(System.in).nextDouble();
        
        System.out.printf("%.2f", n<=1000 ? (n*1.0)/10 : 100 + (n - 1000)*1.0/20);

	}
}