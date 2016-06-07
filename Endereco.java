import java.util.Scanner;

  public class Endereco{
	  static int maxId = 1;
      Scanner scan = new Scanner(System.in);
      //atributos
      private double enderecoId = 0;
      private String rua;
      private int numero=0;
      private String cep;
      private String cidade;
      private String estado;
      //construtor
      
      public Endereco(String rua, int numero, String cep, String cidade, String estado){
          this.enderecoId = Endereco.getMaxId();
    	  this.rua = rua;
    	  this.numero = numero;
          this.cep = cep;
          this.cidade = cidade;
          this.estado = estado;
          
          Endereco.setMaxId(Endereco.getMaxId()+1);
      }
      public Endereco() {
		// TODO Auto-generated constructor stub
	}
	//metodos
      
      public Endereco criar(){
          System.out.println("Informe o nome da rua:\n");
          this.rua = scan.nextLine();
          System.out.println("Informe o numero da casa:\n");
          this.numero = scan.nextInt();
          System.out.println("Informe o CEP:\n");
          this.cep = scan.nextLine();
          System.out.println("Informe a Cidade :\n");
          this.cidade = scan.nextLine();
          System.out.println("Informe a sigla do Estado\n");
          this.estado = scan.nextLine();
          
          Endereco criado = new Endereco(rua, numero, cep, cidade, estado);
          
          return criado;
      }
      public Endereco pesquisarEndereco(int id, Endereco[] enderecos){
    	  Endereco encontrado = new Endereco();
    	  
    	  for(int i=1; i<Endereco.getMaxId();i++){
    		  if(enderecos[i].getEnderecoId()==id){
    			  encontrado = enderecos[i];
    			  System.out.println("Encontrado");
    			  return encontrado;
    		  }
    	  }
          return this;
      }
      public double getEnderecoId(){
    	  return this.enderecoId;
      }
      public void setEnderecoId(double enderecoId){
    	  this.enderecoId = enderecoId;
      }
      public static int getMaxId(){
    	  return maxId;
      }
      private static void setMaxId(int max){
    	  maxId = max;
      }
      public String getRua(){
    	  return rua;
      }
      public void setRua(String rua){
    	  this.rua = rua;
      }
      public int getNumero(){
    	  return numero;
      }
      public void setNumero(int numero){
    	  this.numero = numero;
      }
      public String getCep(){
    	  return cep;
      }
      public void setCep(String cep){
    	  this.cep = cep;
      }
      public String getCidade(){
    	  return cidade;
      }
      public void setCidade(String cidade){
    	  this.cidade = cidade;
      }
      public String getEstado(){
    	  return estado;
      }
      public void setEstado(String estado){
    	  this.estado = estado;
      }
      public String toString(){
    	  return "";
      }
  }
  
