import java.util.Scanner;
public class Principal {  //classe principal
    public static void main(String[] args) {   //metodo principal
    Scanner ent = new Scanner(System.in);
    int opcao,i=0,d=0,e=0,ed=0,x=0,ex=0;  //variaveis
    Socio socio[] = new Socio[1000];  //vetor
    Filme filme[]= new Filme[2000];
    //Emprestimo emprestimo = new Emprestimo();
    do{
        System.out.println("PROGRAMA LOCADORA"); //menu principal
        System.out.println("Digite o número da opção:");
        System.out.println("1. Cadastro de Socio");
        System.out.println("2. Cadastro de DVD");
        System.out.println("0. Sair do programa");
        opcao = ent.nextInt();
        switch(opcao){
            case 1:
             socio[i] = new Socio();    
            socio[i].CadastrarSocio();
            i++;    
            break;
            case 2:
           filme[d] = new Filme();
            filme[d].CadastrarFilme();
                break;       
        }   
    }
    	while(opcao != 0);
   
    }
}

        
 
    


