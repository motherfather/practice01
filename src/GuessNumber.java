
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		
		System.out.println( k );
	}
}
