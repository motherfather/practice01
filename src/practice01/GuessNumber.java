package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int guessNumber = r.nextInt(100) + 1;
		Scanner scanner = new Scanner( System.in );
		
		int min = 1;
		int max = 100;
		System.out.println("수를 결정하였습니다. 맞춰보세요." + '\n' + min + "-" + max);
		int i = 1;
		while(true){
			System.out.print(i + ">>");
			int num = scanner.nextInt();
			
			if(num == guessNumber){
				System.out.println("맞았습니다." + '\n' + "다시하시겠습니까(y/n)");
				String answer = scanner.next();
				if(answer.equals("y")){
					guessNumber = r.nextInt(100) + 1;
					min = 1;
					max = 100;
					System.out.println("수를 결정하였습니다. 맞춰보세요." + '\n' + min + "-" + max);
					i = 1;
					continue;
				}else{
					break;
				}
			}else{
				if(num > guessNumber){
					System.out.println("더 낮게");
					if(max > num){
						max = num;
					}
					System.out.println(min + "-" + max);
				}else{
					System.out.println("더 높게");
					if(min < num){
						min = num;
					}
					System.out.println(min + "-" + max);
				}
				
			}
			i++;
		}
		
		scanner.close();
	}
}
