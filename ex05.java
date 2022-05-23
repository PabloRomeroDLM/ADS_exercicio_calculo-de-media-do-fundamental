package exercicio6;
import java.util.Scanner;
public class exerci4 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		// declaracao de variaveis
		
		int codigo;
		float  nota1, nota2, nota3, media;
		System.out.println("Digite o seu RA, caso nao haja mais alunos digite 0: ");
		codigo = read.nextInt();
		
		//condicao determinante para a continuacao ou encerramento do codigo
		
		if(codigo == 0) {
			System.out.println("Fim");
		}
		
		// condicao proveniente da resposta do usuario, printando os pedidos na tela
		
		else {
		System.out.println("Digite a sua primeira nota: ");
		nota1 = read.nextFloat();
		System.out.println("Digite a sua segunda nota: ");
		nota2 = read.nextFloat();
		System.out.println("Digite a sua terceira nota: ");
		nota3 = read.nextFloat();
		
		// calculo base para resultar a media ao usuario
		
		media = (nota1 + nota2 + nota3) / 3;
		
		// condições if mais calculo 
		// comentarios gerados respectivos a media tirada pelo usuario
		
		if(media >= 8) {
			System.out.println("Aprovado");
		}
		else if(media < 8 && media >6) {
			System.out.println("Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		}
		
		}

	}

}



