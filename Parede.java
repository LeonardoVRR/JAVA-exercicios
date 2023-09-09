import java.util.Scanner;

public class Parede {
    private double largura;
    private double altura;
    private String cor;
    private int rendimento;
    private int numero_de_demaos;
    private double largura_azulejo;
    private double altura_azulejo;

    Scanner sc = new Scanner(System.in);
    
    /* 
    public Parede(){
        this.largura = 0.0;
        this.altura = 0.0;
        this.cor = null;
    }
    */
    
    public Parede(){

        System.out.println("Insira a cor da parede: ");
        this.cor = sc.nextLine();
        System.out.println("Insira o valor da largura: ");
        this.largura = sc.nextDouble();
        System.out.println("Insira o valor da altura: ");
        this.altura = sc.nextDouble();
        System.out.println("Insira o rendimento da tinta: ");
        this.rendimento = sc.nextInt();
        System.out.println("Insira o numero de demãos: ");
        this.numero_de_demaos = sc.nextInt();
        System.out.println("Insira o valor da largura do azulejo: ");
        this.largura_azulejo = sc.nextInt();
        System.out.println("Insira o valor da altura do azulejo: ");
        this.altura_azulejo = sc.nextInt();
    }
    
    private int calculaAreaParede(){
        double area = this.largura * this.altura;
        double area_com_sobra = area + (0.1*area);
        return (int) area_com_sobra;
    }

    private int calculaPerimetro(){
        double perimetro = 2*(this.largura + this.altura);
        return (int) perimetro;
    }

    private int calculaQtdTinta(){
        int result_rendimento = this.rendimento/this.numero_de_demaos;
        int qtd_latas = this.calculaAreaParede()/result_rendimento;
        return qtd_latas;
    }

    private int calculaAreaAzulejo(){
        double calculaAreaAzulejo = this.largura_azulejo*this.altura_azulejo;
        double qtd_m2_azulejo_caixa = (calculaAreaAzulejo/100)*5;
        return (int) qtd_m2_azulejo_caixa;
    }

    private int calculaQtdAzulezo(){
        double qtd_azulejo = this.calculaAreaParede()/this.calculaAreaAzulejo();
        return (int) qtd_azulejo;
    }

    public void to_String2(){
        System.out.println("Cor da parede: "+this.cor+"\nAltura da parede: "+this.altura+"\nLargura da parede: "+this.largura+"\nArea total da parede: "+this.calculaAreaParede()+"\nPerimetro da parede: "+this.calculaPerimetro()+"\nTotal de tinta necessária: "+this.calculaQtdTinta()+ "\nArea total dos Azulezos por caixa: "+this.calculaAreaAzulejo()+"\nQuantidade total de caixas de azulezo necessária: "+this.calculaQtdAzulezo());
    }
}
