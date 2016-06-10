package Classes;
import java.util.Calendar;
import java.util.Scanner;


public class Socio{
	
	private int socioId;
	private String cpf;
	private String nome;
	public int getSocioId() {
		return socioId;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public static Matricula[] getMatriculas() {
		return matriculas;
	}

	private Calendar dataNasc;
	private static Matricula[] matriculas;
	
	public Socio(String cpf, String nome, Calendar dataNasc){
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.matriculas = new Matricula[10];
	}
	
	public static Socio criar(Endereco[] enderecos){
		//criar socio;
		Scanner input = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		Socio criado;
		Endereco endereco;
		Modalidade modalidade;
		System.out.println("Informe o nome:\n");
		String nome = input.nextLine();
		System.out.println("Informe o CPF:\n");
		String cpf = input.nextLine();
		System.out.println("Informe a data de nascimento:\n");
		
		System.out.println("Dia: ");		
		int dia = input.nextInt();
		System.out.println("Mes: ");
		int mes = input.nextInt();
		System.out.println("Ano: ");
		int ano = input.nextInt();
		calendario.set(ano, mes, dia);
		System.out.println("\n**********Endereco*********\n");
		endereco = Endereco.criar();
		//System.out.println("\n**********Matricula**********\n");
		//matriculas = new Matricula(modalidade.criar(),calendario.getInstance());
		criado = new Socio(nome, cpf,calendario);
		return criado;
	}
	
	public static  Socio pesquisarSocio(int id, Socio[] socios){
				
		return null;
	}
	
	public boolean matricular(int modalidadeId , Modalidade[] modalidades){
		Modalidade modalidade;
		for( int i=0; i<modalidades.length;i++){
			if(modalidades[i]==null)
				break;
			
			if(modalidades[i].getModalidadeId() == modalidadeId){
				modalidade = modalidades[i];
				//GAMBI
				Calendar calendario = Calendar.getInstance();
				calendario.set(2014, 02, 22);
				
				Matricula matricula = new Matricula(modalidade,calendario);
				
				//adiciona a matricula no vetor de matriculas
				for(int c=0 ; c < matriculas.length;c++){
					if(matriculas[c] == null){
						matriculas[c] = matricula;
					}
				}
				return true;
				
			}
		}
		
		return false;
	}
	
	public boolean desmatricular(int matriculaId){
		for(int i=0 ; i< matriculas.length ;i++){
			if(matriculas[i] == null)
				break;
			
			if(matriculas[i].getMatriculaId() == matriculaId){
				//exclui a matricula do vetor
				Calendar calendario = Calendar.getInstance();
				calendario.set(2014, 02, 22);
				matriculas[i].setDataTermino(calendario);
				matriculas[i] = null;
				//reposiciona as matriculas no vetor
				for(int j =i+1 ; j<matriculas.length;j++){
					if(matriculas[j]==null)
						break;
					
					matriculas[j-1] = matriculas[j];
				}
				
				return true;
			}
		}
		
		return false;
	}
	
}
