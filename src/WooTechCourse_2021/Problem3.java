package WooTechCourse_2021;

import java.util.StringTokenizer;

public class Problem3 {

	public static void main(String[] args) {
		
		String[] ings = {"x 25", "y 20", "z 1000"};
		String[] menu = {"AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"};
		String[] sell = {"BBBB 3", "TTT 2"};
		
		System.out.println(solution(ings,menu,sell));

	}
	
	public static int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        
        
        StringTokenizer st;
        int[] ingsInt = new int[ings.length];//재료가격
        int[] menuInt = new int[menu.length];//판매가격
        int[] sellInt = new int[sell.length];//판매개수
        
        String[] sellMenu = new String[sell.length];//판매된 메뉴이름
        String[] menuStr = new String[menu.length];//메뉴이름
        String[] ingsStr = new String[ings.length];//재료이름
        String[] menuIngsStr = new String[menu.length];//메뉴에들어간재료들
        
        int[] earnMoney = new int[menu.length];//메뉴순서와같음,벌은돈
        
        //재료, 가격 분리 
        for(int i=0;i<ings.length;i++) {
        	st = new StringTokenizer(ings[i]);
        	ingsStr[i] = st.nextToken();
        	ingsInt[i]=Integer.parseInt(st.nextToken());
        }
        
      
        
        //메뉴, 원재료, 판매가격 분리
        for(int i=0;i<menu.length;i++) {
        	
        	st = new StringTokenizer(menu[i]);
        	menuStr[i] = st.nextToken();
        	menuIngsStr[i]  = st.nextToken();
        	menuInt[i]=Integer.parseInt(st.nextToken());
        	
        }
        
        
        
       
        
        //메뉴 원재료가격 계산
        for(int i=0;i<menu.length;i++) {
        	
       
        	st = new StringTokenizer(menuIngsStr[i],"abcdefghijklmnopqrstuvwxyz",true);
        	int sum = 0;
        	
        	for(int j=0;j<menuIngsStr[i].length();j++) {
        		String str = st.nextToken();
        		//System.out.println(str);
        		for(int z=0;z<ingsStr.length;z++) {
        			if(ingsStr[z].equals(str)) {
        				sum+=ingsInt[z];
        				//System.out.println(ingsInt[z]);
        			}
        		}
        	}
        	earnMoney[i] = (menuInt[i]-sum);
        	//System.out.println(menuInt[i]+" "+sum);
        	
        	
        }
        
        for(int i=0;i<sell.length;i++) {
        	st = new StringTokenizer(sell[i]);
        	sellMenu[i] = st.nextToken();
        	sellInt[i]=Integer.parseInt(st.nextToken());

        }
        
        for(int i=0;i<sell.length;i++) {
        	for(int j=0;j<menu.length;j++) {
        		if(sellMenu[i].equals(menuStr[j])) {
        			answer+=(earnMoney[j]*sellInt[i]);
        			//System.out.println(earnMoney[j]+" "+ sellInt[i]+" "+menuStr[j]);
        		}
        	}
        }
     
        
        
        return answer;
    }

}

