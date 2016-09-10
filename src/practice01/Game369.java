package practice01;
public class Game369 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 99; i++){
			String s = String.valueOf(i);
			int clap = 0;
			
			for(int j = 0; j < s.length(); j++){
				char c = s.charAt(j);
				
				if(c == '3' || c == '6' || c == '9'){
					clap++;
				}
			}
				if(clap > 0){
					System.out.print(s);
					while(clap > 0){
						System.out.print("짝");
						clap--;
					}
					System.out.println();
				}
		}
	}
}
//			int number = 36942;
//			String s = String.valueOf(number);
//		
//			System.out.println(s.length());
//			char c = s.charAt(2);
//			System.out.println(c);
//		
//			int clapcount = 0;
//			if(c == '3' || c == '6' || c == '9'){
//			clapcount++;