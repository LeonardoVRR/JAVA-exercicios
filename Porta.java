import java.util.Scanner;

public class Porta {
    private double largura;
    private double altura;
    private String cor;
    private int rendimento;
    private int numero_de_demaos;

    Scanner sc = new Scanner(System.in);
    
    /* 
    public Porta(){
        this.largura = 0.0;
        this.altura = 0.0;
        this.cor = null;
    }
    */
    
    public Porta(){

        System.out.println("Insira a cor da porta: ");
        this.cor = sc.nextLine();
        System.out.println("Insira o valor da largura: ");
        this.largura = sc.nextDouble();
        System.out.println("Insira o valor da altura: ");
        this.altura = sc.nextDouble();
        System.out.println("Insira o rendimento da tinta: ");
        this.rendimento = sc.nextInt();
        System.out.println("Insira o numero de demãos: ");
        this.numero_de_demaos = sc.nextInt();
    }
    
    private int calculaArea(){
        double area = this.largura * this.altura;
        return (int) area;
    }

    private int calculaPerimetro(){
        double perimetro = 2*(this.largura + this.altura);
        return (int) perimetro;
    }

    private int calculaQtdVerniz(){
        int result_rendimento = this.rendimento/this.numero_de_demaos;
        int qtd_latas = this.calculaArea()/result_rendimento;
        return qtd_latas;
    }

    public void to_String(){
        System.out.println("Cor da porta: "+this.cor+"\nAltura da porta: "+this.altura+"\nLargura da porta: "+this.largura+"\nÁrea total da porta: "+this.calculaArea()+"\nPerimetro da porta: "+this.calculaPerimetro()+"\nTotal de tinta necessária: "+this.calculaQtdVerniz());
    }
}