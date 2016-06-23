package Classes;
import java.util.Scanner;

public class Menu {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int opt = 9;
		int opt2 = 9;
		
		while(opt!=0){
			menu();
			opt = input.nextInt();
			switch(opt){
				case 1:
					menuMatricular();
					opt2 = input.nextInt();
					switch(opt2){
						case 1:
						case 2:
						case 3:
							menuTitulo();
							opt2 = input.nextInt();
						case 4:
						case 0:
							break;
					}
				case 2:
					
				case 3:
					menuModalidade();
					opt2 = input.nextInt();
				case 4:
					menuMensalidade();
					opt2 = input.nextInt();
				case 0:
					break;
			}
				
		}
	}

	public static void menu(){
		System.out.println("Menu");
		System.out.println("1-Matricular");
		System.out.println("2-Desmatricular");
		System.out.println("3-Modalidade");
		System.out.println("4-Mensalidade");
		System.out.println("0-Sair");
	}
	public static void menuMatricular(){
		System.out.println("Matricula");
		System.out.println("1-Criar Socio");
		System.out.println("2-Pesquisar Socio");
		System.out.println("3-Criar Titulo");
		System.out.println("4-Pesquisar Titulo");
		System.out.println("0-Voltar Menu");
	}
	public static void menuTitulo(){
		System.out.println("Titulo");
		System.out.println("1-Individual");
		System.out.println("2-Familiar");
		System.out.println("0-Voltar Menu");
	}
	public static void menuModalidade(){
		System.out.println("Modalidade");
		System.out.println("1-Criar Modalidade");
		System.out.println("2-Pesquisar Modalidade");
		System.out.println("0-Voltar Menu");
	}
	public static void menuMensalidade(){
		System.out.println("Mensalidade");
		System.out.println("1-Calcular Mensalidade");
		System.out.println("2-Pagar Mensalidade");
		System.out.println("0-Voltar Menu");
	}
}
/*MENU
1-matricular
	1-1-criar socio
	1-2-pesquisar socio
	1-3-criar titulo
		1-3-1-individual
		1-3-2-familiar
	1-4-pesquisar titulo
2-desmatricular
3-modalidade
	criar modalidade
	pesquisar modalidade
4-mensalidade
	calcular mensalidade
	pagar mensalidade
0-sair
*/	
	