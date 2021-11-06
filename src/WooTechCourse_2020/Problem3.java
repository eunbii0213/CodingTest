package WooTechCourse_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		solution(word);

	}
	
	public static String solution(String word) {
		
		String result="";
		char[] large = new char[26];
		char[] reverseLarge = new char[26];
		
		char[] small = new char[26];
		char[] reverseSmall = new char[26];
		
		int count=0;
		for(int i=65;i<91;i++) {
			large[count]= (char)i;
			count++;
		}
		
		count=0;
		for(int i=90;i>64;i--) {
			reverseLarge[count]=(char)i;
			count++;
		}
		
		count=0;
		for(int i=97;i<123;i++) {
			small[count]= (char)i;
			count++;
		}
		
		
		count=0;
		for(int i=122;i>96;i--) {
			reverseSmall[count]=(char)i;
			count++;
		}
		
		char[] temp = new char[word.length()];
		temp = word.toCharArray();
		
		boolean flag;
		
		for(int i=0;i<word.length();i++) {
			
			flag = false;
			
			char now = (char)temp[i];
			//System.out.println("now = " + now);
			
			for(int j=0;j<26;j++) {
				
				if(large[j]==now) {
					result+=reverseLarge[j];
					//System.out.println("r");
					flag= true;
				}
				
				
				else if(small[j]==now) {
					//System.out.println("r2");
					result+=reverseSmall[j];
					flag=true;
				}
					
			}//for문 끝
			
			if(!flag) {
				result+=" ";
			}
			
		}//바깥쪽 for문 끝
		
		System.out.println(result);
		
		
		
		
		return result;
	}

}

