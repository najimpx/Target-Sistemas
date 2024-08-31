package ex2;
import java.util.Scanner;

//ex2 para avaliação tecnica Target Sistemas
public class main {
	
	static void algoritmoFibonacci(int entrada) {
		//permite comecar do 1
		if(entrada == 0) {
			System.out.println("faz parte do Fibonacci");
			return;
		}
		int natual = 1;
		//guarda o valor passado
		int temp1 = 0;
		int temp2 = 0;
		while(natual < entrada) {
			temp1 = natual;
			natual = natual + temp2; 
			temp2 = temp1;
		}
		if(natual == entrada) {
			System.out.println("faz parte do Fibonacci");
		}
		else {
			System.out.println("não faz parte do Fibonacci");
		}
	}
	
	public static void main(String[] args){
		//entrada por terminal
		Scanner scan = new Scanner(System.in);
		int entrada = scan.nextInt();
		//realizar o fibonacci, se o algoritmo ultrapassar entrada encerra
		algoritmoFibonacci(entrada);
		scan.close();
		return;
	}
}
