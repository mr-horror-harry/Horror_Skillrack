import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String Args[]) throws IOException{

		List <String> li = new ArrayList<>();
		try{
			li = new ArrayList <String> ( Arrays.asList( new BufferedReader(new InputStreamReader(System.in)).readLine().trim().split("\\ ") ) );
		}
		catch(IOException e){
		}

		int ct=0;
		for(String s : li){
			byte f=0;
			for(char c : s.toCharArray()){
				if( !(c>='a' && c<='z') ){
					f=1;
					break;
				}
			}
			ct += f==0 ? 1 : 0;
		}
		System.out.print(ct);
		return;
		
	}
}