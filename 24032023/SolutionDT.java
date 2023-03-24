import java.util.*;
class SolutionDT {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        
        int h=0, m=0;
        while(n-->0){
            String ar[] = sc.next().split(":");
            h += Integer.parseInt(ar[0]);
            m += Integer.parseInt(ar[1]);
        }
        System.out.print(h + m/60 +" "+ m%60);
	}
}