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
        		int op;
        		
        		do{
        			System.out.println("Deseja adicionar um Novo Dependente:\n 0 - NAO \n 1 - SIM");
            		op = input.nextInt();
        			
            		if(op==1){
            			dependentes[contador]= Socio.criar(enderecos);
            			contador++;
            		}else if(op==0){
            			criado = new TituloFamiliar(titular,dependentes,contador);
            		}else{
            			System.out.println("Opcao Invalida , tente novamente");
            			
            		}
        		}while(op != 1 && op != 0);
        		
        		
        	}else{
        		System.out.println("Opcao Invalida , tente novamente");
        	}
    	}while(opcao != 0 && opcao !=1);
    	
    	return null;
    			
      
    }
    public Titulo pesquisarTitulo(int id, Titulo[] titulos){
    
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

}
