import java.util.List;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String Args[]) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> li = new ArrayList<Integer>();
		int n, max=0;

		try{
			n = Integer.parseInt(read.readLine().trim());
			for(String s : read.readLine().trim().split(" ")){
				int val = Integer.parseInt(s);
				li.add(val);
				if(val > max) max=val;
			}
		}catch(IOException e){
			System.out.print("Error in i/p");
		}

		for(int i:li) System.out.print(max-i +" ");
	}
}