package WooTechCourse_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		
		int[] sol = solution(money);
		
		for(int i=0;i<9;i++) {
			if(i!=8){
				System.out.print(sol[i]+",");
			}
			
			else {
				System.out.print(sol[i]);
			}
		}
			

	}
	
	public static int[] solution(int money) {
		
		
		int[] answer = new int[9];
		
		
		answer[0] = money/50000;
		answer[1] = (money%50000)/10000;
		answer[2] = ((money%50000)%10000)/5000;
		answer[3] = (((money%50000)%10000)%5000)/1000;
		answer[4] = ((money%50000)%10000%5000%1000)/500;
		answer[5] = (((((money%50000)%10000)%5000)%1000)%500)/100;
		answer[6] = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50;
		answer[7] = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10;
		answer[8] = ((((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10)/1;
		
		
		return answer;
	}

}
