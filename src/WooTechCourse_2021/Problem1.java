package WooTechCourse_2021;

public class Problem1 {
	//1
		public static void main(String[] args) {
			int[] arr = {1, 2, 3};
			solution(arr);

		}
		
		 public static int[] solution(int[] arr) {
		        int[] answer = {};
		        answer = new int[3];
		        int one = 0;
		        int two = 0;
		        int three = 0;
		        
		        for(int i=0;i<arr.length;i++) {
		        	
		        	if(arr[i]==1) {
		        		one++;
		        	}
		        	else if(arr[i]==2) {
		        		two++;
		        	}
		        	
		        	else if(arr[i]==3) {
		        		three++;
		        	}
		        	
		        }
		        
		        int max = Math.max(one, two);
		        max = Math.max(max, three);
		        
		        //System.out.println(max);
		       // System.out.println(one);
		        answer[0]=(max-one);
		        answer[1]=(max-two);
		        answer[2]=(max-three);
		        
		       
		        return answer;
		    }

	}
