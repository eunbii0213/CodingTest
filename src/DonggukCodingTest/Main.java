package DonggukCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		

		String result = Integer.toString(x);
		
		BigInteger bigNumber = new BigInteger(result);
		BigInteger bigNumber2 = new BigInteger("4");
		
		bigNumber = bigNumber.pow(y);
		bigNumber = bigNumber.remainder(bigNumber2);
		
		
		String str = bigNumber.toString();
		int strToInt = Integer.parseInt(str);
		
		if(strToInt==0) {
			System.out.println("우산");
		}else if(strToInt==1) {
			System.out.println("동그라미");
		}else if(strToInt==2) {
			System.out.println("세모");
		}else if(strToInt==3) {
			System.out.println("별");
		}
		
		

	}

}
