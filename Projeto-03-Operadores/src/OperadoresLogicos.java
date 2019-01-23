
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int idade = 17;
		char sexo = 'F';
		boolean result;
		
		/*
		 * A linha abaixo calcula .....
		 */
		result = !((idade >= 18) || (sexo == 'M'));
		System.out.println(result);
	}
}
