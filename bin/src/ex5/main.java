package ex5;
import java.util.Scanner;

//ex5 para avaliação tecnica Target Sistemas
public class main {
	static void inverte(String entrada) {
		char[] charinverte = entrada.toCharArray();
		char[] invertido = new char[charinverte.length];
		int j = 0;
		for(int i = charinverte.length-1; i >= 0; i--) {
			invertido[j] = charinverte[i];
			j++;
		}
		String entradainvertida = new String(invertido);
		System.out.println(entradainvertida);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String entrada = scan.next();
		inverte(entrada);
	}
}
