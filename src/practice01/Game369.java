package practice01;
public class Game369 {
	public static void main(String[] args) {
		
		for(int i = 1; i ){
			int num = 1;
			String s = String.valueOf(num);
			for(int i = 0; i < 2; i++){
				char c = s.charAt(i);
				
				int clap = 0;
				if(c == '3' || c == '6' || c == '9'){
					clap++;
				}
				
				System.out.println("c");
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