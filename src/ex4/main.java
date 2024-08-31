package ex4;

//ex4 para avaliação tecnica Target Sistemas
public class main {
	public static void main(String[] args){
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;
		double total = SP+RJ+MG+ES+outros;
		
		double porcentagem = SP/total;
		System.out.println("Porcentagem do valor de faturamento da distribuidora SP : "+porcentagem+" %");
		porcentagem = RJ/total;
		System.out.println("Porcentagem do valor de faturamento da distribuidora RJ : "+porcentagem+" %");
		porcentagem = MG/total;
		System.out.println("Porcentagem do valor de faturamento da distribuidora MG : "+porcentagem+" %");
		porcentagem = ES/total;
		System.out.println("Porcentagem do valor de faturamento da distribuidora ES : "+porcentagem+" %");
		porcentagem = outros/total;
		System.out.println("Porcentagem do valor de faturamento de outras distribuidora : "+porcentagem+" %");

	}
}
