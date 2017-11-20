import java.util.Scanner;

	public class Filme {  // classe Socio
	    private String nomeFilme;  //atributos
	    private int codigoFilme;
	    
	public String getNomeFilme() {
			return nomeFilme;
		}
		public void setNomeFilme(String nomeFilme) {
			this.nomeFilme = nomeFilme;
		}
		public int getCodigoFilme() {
			return codigoFilme;
		}
		public void setCodigoFilme(int codigoFilme) {
			this.codigoFilme = codigoFilme;
		}
		
	public void CadastrarFilme(){    // metodo cadastrar filme 
	    Scanner ent = new Scanner(System.in);
	    System.out.println("Cadastrar Filme");
	    System.out.println("Nome do Filmeme:");
	    nomeFilme=ent.next();
	    System.out.println("Codigo do Filme: ");
	    codigoFilme=ent.nextInt();
	    System.out.println("Filme cadastrado com sucesso! Digite S para voltar ao menu!");
	    ent.next();
	    }

	}
	
	
	
	

