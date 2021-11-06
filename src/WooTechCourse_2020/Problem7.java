package WooTechCourse_2020;

import java.io.IOException;
import java.util.ArrayList;

public class Problem7 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println(solution("browoanoommnaon"));
		//System.out.println("done");

	}
	
	public static String solution(String cryptogram) {
		
		String result="";
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		char[] charArr = cryptogram.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			list.add(charArr[i]);
		}
		
		boolean flag= false;
		
			
			for(int i=0;i<list.size();i++) {
				
				if(flag) {
					//i=0;
					flag=false;
				}
				

					//list.size가 2개밖에 안되면 두개 검사해버려 걍 
					if(i!=(((list.size())-1))) {
						if(list.get(i).equals(list.get(i+1))) {
							list.remove(i);
							list.remove(i);
							//System.out.println(i);
							
							i=-1;
							continue;
							
						}
					}
				
			}
			

		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
				result+=list.get(i);
			}
		}

		return result;
	}

}
