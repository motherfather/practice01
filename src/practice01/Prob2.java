package practice01;

public class Prob2 {

	public static void main(String[] args) {
		for(int ii = 1; ii <= 10; ii++){
			for(int i = 0, j = ii; i < 10; i++){
				System.out.print(j + " ");
				j++;
			}
			System.out.println("");
		}
	}

}
