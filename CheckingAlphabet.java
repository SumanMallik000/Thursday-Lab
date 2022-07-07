package basicprogram;

public class CheckingAlphabet {

	public static void main(String[] args) {
		char c='f';
		if((c>='A' && c<='Z') || (c>='a' && c<='z'))
			System.out.println(c+" is an Alphabet");
		else
			System.out.println(c+" is not an Alphabet");

	}

}
