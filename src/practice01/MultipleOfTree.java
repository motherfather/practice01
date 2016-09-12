package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("수를 입력하시오 : ");
		String num = scanner.nextLine();
		char ch = num.charAt(0);
		if(!Character.isDigit(ch)){
			System.out.println("숫자가 아닙니다.");
		}
		else{
			if(ch % 3 == 0){
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		scanner.close();
	}
}
