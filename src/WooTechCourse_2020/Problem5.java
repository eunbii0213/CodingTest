package WooTechCourse_2020;

import java.util.StringTokenizer;

public class Problem5 {

	public static void main(String[] args) {
		
		System.out.println(solution(33));
			
	}
	
	public static int solution(int number) {
		
		int result=0;
		String[] arr = new String[number];
		
		int count=0;
		//int clap=0;
		StringTokenizer st;
		
		//char배열로 바꿈 (1~number숫자 다 넣음)
		for(int i=1;i<number+1;i++) {
			arr[count]= Integer.toString(i);
			count++;
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			st = new StringTokenizer(arr[i],"369",true);
			int cnt = st.countTokens();
			String[] str = new String[cnt];
			
			for(int j=0;j<cnt;j++) {
				
				if(j==cnt-1) {
					str[j]=st.nextToken();
					
					int loo = j;
					while(loo>=0) {
						//0일때도 포함시켜야 배열 첫번째도 검사
						if(str[loo].contains("3")) {
							result++;
						}
						
						else if(str[loo].contains("6")) {
							result++;
						}
						
						else if(str[loo].contains("9")) {
							result++;
						}
					loo--;
					
					}//while문 끝 
				}
				else{
					str[j]=st.nextToken();
				}
				
				
			}//for문 끝 
			
		}//바깥 for문 
	
		return result;
	}
	
	

}



