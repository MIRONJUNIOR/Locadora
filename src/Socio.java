import java.util.Scanner;
public class Socio {  // classe Socio
    private String nome;  //atributos
    private int codigo;
    private String endereco;
    private int telefone;
    private String cpf;
    private String Email;
    private String dataAdesao;
    private int RG;
    
public void setnome(String nome){  // construtores gets e sets
    this.nome=nome;
}
public String getnome(){
    return this.nome;
}
public void setcodigo(int codigo){
    this.codigo=codigo;
}
public int getcodigo(){
    return this.codigo;
}
public void setendereço(String endereco){
    this.endereco=endereco;
}
public String getendereco(){
    return this.endereco;
}
public void settelefone(int telefone){
    this.telefone=telefone;
}
public int gettelefone(){
    return this.telefone;
}
public void setcpf(String cpf){
    this.cpf=cpf;
}
public String getcpf(){
    return this.cpf;
}
public void setEmail(String Email){
    this.Email=Email;
}
public String getEmail(){
    return this.Email;
}
public void setRG(int RG){
    this.RG=RG;
}
public int getRG(){
    return this.RG;
}
public String getDataAdesao() {
	return dataAdesao;
}
public void setDataAdesao(String dataAdesao) {
	this.dataAdesao = dataAdesao;
}
public void CadastrarSocio(){    // metodo cadastrar Socio
    Scanner ent=new Scanner(System.in);
    System.out.println("Cadastrar Socio");
    System.out.println("Nome:");
    nome=ent.next();
    System.out.println("Codigo:");
    codigo=ent.nextInt();
    System.out.println("Endereço:");
    endereco=ent.next();
    System.out.println("Telefone:");
    telefone=ent.nextInt();
    System.out.println("CPF:");
    cpf=ent.next();
    System.out.println("Data de Adesão: ");
    dataAdesao=ent.next();
    System.out.println("Email:");
    Email=ent.next();
    System.out.println("RG");
    RG=ent.nextInt();
    System.out.println("Cliente cadastrado com sucesso! Digite S e tecle Enter para voltar ao menu!");
    ent.next();
    }
public void excluirSocio(){  //metodo excluir Socio
nome=" ";
codigo=0;
endereco=" ";
telefone=0;
cpf=" ";
Email=" ";
dataAdesao="";
RG=0;
}

}