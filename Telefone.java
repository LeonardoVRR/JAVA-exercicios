import java.util.Scanner;

public class Telefone {
    private String numero;
    private int ddd;
    private int ddi;
    private String tipo;

    Scanner sc = new Scanner(System.in);

    public Telefone(){
        System.out.println("insira o ddi do numero de telefone: ");
        this.ddi = sc.nextInt();
        System.out.println("insira o ddd do numero de telefone: ");
        this.ddd = sc.nextInt();
        sc.nextLine();
        System.out.println("insira o numero de telefone: ");
        this.numero = sc.nextLine();
    }

    public boolean verificaLigacaoNacional(){
        if (this.ddi == 55) return true;
        else return false;
    }

    public void to_String(){

        if (verificaLigacaoNacional()) this.tipo =  "Ligação Normal";
        else this.tipo =  "Ligação Internacional";

        System.out.println("(+"+this.ddi+")"+" "+this.ddd+" "+this.numero+"\nTipo da ligação: "+this.tipo);
    }
}
