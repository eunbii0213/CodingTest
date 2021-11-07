package WooTechCourse_2020;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pobi = new int[2];
		int[] crong = new int[2];
		
		System.out.println(solution(pobi,crong));

	}
	
	public static int solution(int[] pobi, int[] crong) {
		
		
		if(pobi[1]-pobi[0]!=1) {
			return -1;
		}
		
		else if(crong[1]-crong[0]!=1) {
			return -1;
		}
		
		else {
		
			int pobiMax;
			int crongMax;
		

			int zero = pobi[0]/100;
			int one = pobi[0]%100/10;
			int two = pobi[0]%100%10/1;
			
			int zeroR = pobi[1]/100;
			int oneR = pobi[1]%100/10;
			int twoR = pobi[1]%100%10/1;
			
			int leftPlus = zero+one+two;
			int rightPlus = zeroR+oneR+twoR;
			
			int leftMulti=0;
			int rightMulti=0;
			
			if(zero==0) {
				leftMulti=one*two;
			}
			
			else if(zero!=0) {
				leftMulti= zero*one*two;
			}
			
			if(zeroR==0) {
				rightMulti=oneR*twoR;
			}
			
			else if(zeroR!=0) {
				rightMulti= zeroR*oneR*twoR;
			}
			
			pobiMax= Math.max( leftPlus, rightPlus);
			pobiMax= Math.max( leftMulti, pobiMax);
			pobiMax= Math.max( rightMulti, pobiMax);
			System.out.println(pobi[0]+","+pobi[1]);
		
		//크롱
		
	
			int Czero = crong[0]/100;
			int Cone = crong[0]%100/10;
			int Ctwo = crong[0]%100%10/1;
			
			int CzeroR = crong[1]/100;
			int ConeR = crong[1]%100/10;
			int CtwoR = crong[1]%100%10/1;
			
			int CleftPlus = Czero+Cone+Ctwo;
			int CrightPlus = CzeroR+ConeR+CtwoR;
			
			int CleftMulti=0;
			int CrightMulti=0;
			
			if(Czero==0) {
				CleftMulti=Cone*Ctwo;
			}
			
			else if(Czero!=0) {
				CleftMulti= Czero*Cone*Ctwo;
			}
			
			if(CzeroR==0) {
				CrightMulti=ConeR*CtwoR;
			}
			
			else if(CzeroR!=0) {
				CrightMulti= CzeroR*ConeR*CtwoR;
			}
			
			
			crongMax= Math.max( CleftPlus, CrightPlus);
			crongMax= Math.max( CleftMulti, crongMax);
			crongMax= Math.max( CrightMulti, crongMax);
			
			System.out.println(pobiMax);
			System.out.println(crongMax);
			
			if(crongMax>pobiMax) {
				
				return 2;
			}
			
			else if(crongMax<pobiMax) {
				return 1;
			}
			
			
			else {
				return 0;
			}
		
		}
	}

}