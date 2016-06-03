import java.util.Calendar;


public class Socio {
	
	private int socioId;
	private String cpf;
	private String nome;
	private Calendar dataNasc;
	private Matricula[] matriculas;
	
	public Socio(String cpf, String nome, Calendar dataNasc){
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.matriculas = new Matricula[10];
	}
	
	public static Socio criar(){
		//criar socio;
		return null;
	}
	
	public static  Socio pesquisarSocio(int id, Socio[] socios){
		
		return null;
	}
	
	public boolean matricular(int modalidadeId , Modalidade[] modalidades){
		
		return true;
	}
	
	public boolean desmatricular(Matricula matriculaId){
		return true;
	}
	
}
