package switchDemo;

public class bb {

	public static void main(String[] args) {
	
		char grade = 'D';
		switch (grade) {
		case 'A':
		System.out.println("mükemmel : geçtiniz");
		break;
		case 'B':
		System.out.println("iyi : geçtiniz");
		break;
		case'C':
		System.out.println("orta : geçtiniz");
		break;
		case'D':
		System.out.println("maalesef geçemediniz");
		break;
		default:
			System.out.println("hatalı not girisi");
		}


	}

}
