package WooTechCourse_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem4 {
	//4
		public static void main(String[] args) {
			
			System.out.println(solution("aaabbaaa"));

		}
		
		 public static int[] solution(String s) {
		        
			 
			 	int[] answer = {};
			 	
		        int endIndex=0;
		        
		        ArrayList<String> list = new ArrayList<String>();
		        StringTokenizer st = new StringTokenizer(s,"abcdefghijklmnopqrstuvwxyz",true);
		        
		        //String[] list = new String[s.length()];
		        
		        for(int i=0;i<s.length();i++) {

		        	list.add(st.nextToken());
		        	//System.out.println(list.size()+" "+s.length());
		        }
		        
		       

		        for(int i=(((s.length())-1));i>0;i--) {
		        	if(list.get(0).equals(list.get(i))) {
		        		endIndex = i;
		        		
		        	}
		        	
		        	else {
		        		
		        		break;
		        	}
		        }
		        
		      
		       
		        String[] temp = new String[endIndex];
		        
		        for(int i=0;i<endIndex;i++) {
		        	list.add(list.remove(0));
		        }
		        
		        
		        
		        String temp2="";
		        int totalCount=0;
		        int count=1;
		        for(int i=0;i<(s.length());i++) {
		        	
		        	if(i!=s.length()-1) {
		        		if(list.get(i).equals(list.get(i+1))) {
		        			count++;
		        			
		        		}
		        		
		        		else {
		        			temp2+=count+",";
		        			if(count!=1) {
		        				
		        			}
		        			count=1;
		        			totalCount++;
		        			
		        		}
		        	}
		        	
		        	else {
		        		temp2+=1;
		        		totalCount++;
		        		
		        	}
		        	
		        		
		      
		        		
		        }
		        
		       
		        answer = new int[totalCount];
		        st = new StringTokenizer(temp2,",");
		        
		        for(int i=0;i<totalCount;i++) {
		        	answer[i]=Integer.parseInt(st.nextToken());
		        	System.out.println(answer[i]);
		        }
		       
		        Arrays.sort(answer);
		        
		        return answer;
		    }

	}

