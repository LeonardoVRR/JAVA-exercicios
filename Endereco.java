import java.util.Scanner;

public class Endereco {
    private String lograDouro;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;

    Scanner sc = new Scanner(System.in);

    public Endereco(){

        System.out.println("Insira o nome da Rua: ");
        this.lograDouro = sc.nextLine();
        System.out.println("Insira o numero do estabelecimento: ");
        this.numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o numero do complemento: ");
        this.complemento = sc.nextLine();
        System.out.println("Insira o nome da Cidade: ");
        this.cidade = sc.nextLine();
        System.out.println("Insira o nome do Estado: ");
        this.estado = sc.nextLine();
        System.out.println("Insira o numero do CEP: ");
        this.cep = sc.nextLine();
        System.out.println("Insira o nome do Pais: ");
        this.pais = sc.nextLine();

    }

    public String estadopPorExtenso(){
        return this.estado;
    }

    public void to_String3(){
        System.out.println("\nNome da Rua: "+this.lograDouro+"\nNumero do estabelecimento: "+this.numero+"\ncomplemento: "+this.complemento+"\nNome da Cidade: "+this.cidade+"\nNome do Estado: "+this.estado+"\nNumero do CEP: "+this.cep+"\nNome do Pais: "+this.pais);
    }
}
