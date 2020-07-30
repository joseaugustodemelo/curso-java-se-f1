package aula3;

public class Exer26 {

	public static void main(String[] args) {
		for (int count = 0; count < 10; count++) {
			if (count == 5) {
				continue;
			}
			System.out.println("->processando " + count);
		}
		System.out.println("terminando o programa...");
	}

}
