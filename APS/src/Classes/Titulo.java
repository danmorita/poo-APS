package Classes;
import java.util.Scanner;


public class Titulo{
	
	static int maxId = 1;
    private int tituloId = 0;
    private Socio titular;
    private Mensalidade[] mensalidades;

    
    public Titulo(Socio titular){
        this.tituloId = Titulo.getMaxId();
        this.titular = titular;
        this.mensalidades = new Mensalidade[10];
        Titulo.setMaxId(Titulo.getMaxId()+1);
    }
    
   
	
    public Titulo() {
		// TODO Auto-generated constructor stub
	}



	public static  Titulo criar(Endereco[] enderecos){
    	Scanner input = new Scanner(System.in);
    	int opcao;
    	Titulo criado;
    	
    	System.out.println("Titular do Titulo");
    	Socio titular = Socio.criar(enderecos);
    	
    	do{
    		System.out.println("Qual o tipo do Titulo:\n 0 - Individual \n 1 - Familiar");
    		opcao = input.nextInt();
        	if(opcao == 0){
        		// titulo individual
        		criado = new Titulo(titular);
        		
        	}else if(opcao == 1){
        		// titulo familiar
        		Socio dependentes[] = new Socio[10]; 
        		int contador = 0;
        		
        		System.out.println("Cadastro de dependentes");
        		int op = 1;
        		
        		//looping abaixo modificado...
        		do{
            		if(op==1){
            			dependentes[contador]= Socio.criar(enderecos);
            			contador++;
            			System.out.println("Deseja adicionar um Novo Dependente:\n 0 - NAO \n 1 - SIM");
                		op = input.nextInt();
            		}else if(op==0){
            			break;
            		}else{
            			System.out.println("Opcao Invalida , tente novamente");
            			op = input.nextInt();
            		}
            		
        		}while(op != 0);
        		
        		
        	}else{
        		System.out.println("Opcao Invalida , tente novamente!\n");
        	}
    	}while(opcao != 0 && opcao !=1);
    	//}while((opcao != 0)&&(opcao !=1)); nao sei se o de cima funciona...
    	return null;
    			
      
    }
    public Titulo pesquisarTitulo(int id, Titulo[] titulos){
    	Titulo encontrado = new Titulo();
    	for(int i=0; i<Titulo.getMaxId(); i++){
    		if(id==titulos[i].getTituloId()){
    			encontrado = titulos[i];
    			System.out.println("Encontrado");
    			return encontrado;
    		}else{
    			System.out.println("Pesquisa nao encontrada!\n");
    		}
    	}
       return null;
    }
    public Mensalidade calcularMensalidade(){
    
       return null;
    }
    public boolean pagarMensalidade(int mes){
    
        return false;
    }
    
    private static void setMaxId(int max) {
		maxId = max;
		
	}

	private static int getMaxId() {
		return maxId;
	}
	public int getTituloId(){
		return tituloId;
	}

}
