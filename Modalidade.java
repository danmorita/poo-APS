import java.util.Scanner;

public class Modalidade {

	static int maxId = 1;
	
	private int modalidadeId;
	private String nome;
	private double preco;
	private int frequenciaSemanal;
	
	public Modalidade() {
		
	}
	
	public Modalidade(String nome,double preco, int frequenciaSemanal){
		this.modalidadeId = Modalidade.getMaxId();
		this.nome = nome;
		this.preco = preco;
		this.frequenciaSemanal = frequenciaSemanal;
		
		Modalidade.setMaxId(Modalidade.getMaxId()+1);
	}
	
	
	private static void setMaxId(int max) {
		maxId = max;
		
	}


	


	public Modalidade criar(){
		// le uma nova modalidade e retorna o objeto instanciado
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o nome da modalidade\n");
		String nome = input.nextLine();
		System.out.println("Informe o valor  da modalidade\n");
		double preco = input.nextDouble();
		System.out.println("Informe a frequencia semanal  da modalidade\n");
		int frequenciaSemanal = input.nextInt();
		
		Modalidade criada = new Modalidade(nome,preco,frequenciaSemanal);
		return criada;
	}
	
	public static Modalidade pesquisarModalidade(int id, Modalidade[] modalidades){
		//pesquisa um determina Id em um vetor de objetos Modalidade
		Modalidade encontrada = new Modalidade();
	
		for(int i = 1 ; i < Modalidade.getMaxId();i++){
				if( modalidades[i].getModalidadeId() == id ){
					encontrada = modalidades[i];
					System.out.println("achou");
					return encontrada;
				}
		}
		
		return null;
	}


	public int getModalidadeId() {
		return modalidadeId;
	}


	public void setModalidadeId(int modalidadeId) {
		this.modalidadeId = modalidadeId;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getFrequenciaSemanal() {
		return frequenciaSemanal;
	}


	public void setFrequenciaSemanal(int frequenciaSemanal) {
		this.frequenciaSemanal = frequenciaSemanal;
	}


	public static int getMaxId() {
		// TODO Auto-generated method stub
		return maxId;
	}
}
