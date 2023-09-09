import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dtNacimento;
    private String telefone;
    private String email;
    private int dia;
    private int mes;
    private int ano;

    Scanner sc = new Scanner(System.in);

    public Pessoa(){
        System.out.println("Insira o seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Insira o seu sobrenome: ");
        this.sobrenome = sc.nextLine();
        System.out.println("Insira o seu nomero de telefone: ");
        this.telefone = sc.nextLine();
        System.out.println("Insira o seu email: ");
        this.email = sc.nextLine();
    }

    public Integer calculaIdade(){
        System.out.println("Insira o dia de nascimento: ");
        this.dia = sc.nextInt();
        System.out.println("Insira o mês de nascimento: ");
        this.mes = sc.nextInt();
        System.out.println("Insira o ano de nascimento: ");
        this.ano = sc.nextInt();

        int anoAtual = 2023;
        int calculaIdade = anoAtual - this.ano;

        return calculaIdade;
    }

    public String geraUsuario(){
        this.dtNacimento = Integer.toString(this.dia)+"/"+Integer.toString(this.mes)+"/"+Integer.toString(this.ano);

        String nomeCompleto = this.nome +" "+ this.sobrenome;

        return nomeCompleto+" "+this.dtNacimento;
    }

    public String geraSenha(){
        return this.nome+this.ano;
    }

    public boolean validaEleitor(){
        if (calculaIdade() < 16) return false;
        else return true;
    }

    public void to_String(){
        String statusEleitor;

        if (this.validaEleitor()) statusEleitor = "Já pode votar";
        else statusEleitor = "Não pode votar";

        System.out.println("Usuário: "+geraUsuario()+"\nSenha: "+geraSenha()+"\nIdade: "+calculaIdade()+"\nTelefone: "+this.telefone+"\nEmail: "+this.email+"\nStatus do Eleitor: "+statusEleitor);
    } 

}