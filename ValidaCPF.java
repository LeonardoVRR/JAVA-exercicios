import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ValidaCPF {
    private String numero;
    private int digitoVerificador;
    private String digitoVerificadorStr;
    private String cpfCompleto;
    private String numeroCPF_Str;

    private List<Integer> primeiros_9_dígitosCPF = new ArrayList<>();
    private List<Integer> primeiros_9_dígitosCPF_multiplicado = new ArrayList<>();
    private List<Integer> primeiros_9_dígitosCPF_multiplicado2 = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public ValidaCPF(){
        System.out.println("Insira os numeros do CPF: ");
        this.numero = sc.nextLine();
        System.out.println("insira os digitos verificadores do CPF: ");
        this.digitoVerificador = sc.nextInt();

        this.calculoPrimeiroDigitoVerificador();
        this.calculoSegundoDigitoVerificador();

        this.digitoVerificadorStr = String.format("%02d", digitoVerificador);
        this.cpfCompleto = this.numero+digitoVerificadorStr;
    }

    public void calculoPrimeiroDigitoVerificador(){
        String[] values = this.numero.split("");

        for (String value : values) {
            int numeroCPF = Integer.parseInt(value.trim());
            primeiros_9_dígitosCPF.add(numeroCPF);
        }

        int multiplicador = 1;
        for (int i = primeiros_9_dígitosCPF.size() - 1; i >= 0 ; i--) {
            int result = primeiros_9_dígitosCPF.get(i) * (multiplicador+1);
            primeiros_9_dígitosCPF_multiplicado.add(result);
        }

        int soma_lista_primeiros_9_dígitosCPF_multiplicado = 0;
        for (int i = 0; i < primeiros_9_dígitosCPF_multiplicado.size(); i++){
            soma_lista_primeiros_9_dígitosCPF_multiplicado += primeiros_9_dígitosCPF_multiplicado.get(i);
        }

        float divisao = (float)soma_lista_primeiros_9_dígitosCPF_multiplicado / 11;

        int resto_divisao = (int) ((divisao % 1)*10);

        int primeiro_digitoVerificador = 0;

        if (resto_divisao >= 2) {
            primeiro_digitoVerificador = 11 - resto_divisao;
            primeiros_9_dígitosCPF.add(primeiro_digitoVerificador);
            System.out.println("Lista Original no calculo do Primeiro Digito Verificador: "+primeiros_9_dígitosCPF);
            System.out.println("Lista Original multiplicada no Primeiro Digito Verificador: "+primeiros_9_dígitosCPF_multiplicado);
            System.out.println("Soma da lista de multiplicados1: "+soma_lista_primeiros_9_dígitosCPF_multiplicado);
            System.out.println("Resto da divisão no Primeiro Digito Verificador: "+resto_divisao);
        }
        else {
            primeiro_digitoVerificador = 0;
            primeiros_9_dígitosCPF.add(primeiro_digitoVerificador);
            System.out.println("Lista Original no calculo do Primeiro Digito Verificador: "+primeiros_9_dígitosCPF);
            System.out.println("Lista Original multiplicada no Primeiro Digito Verificador: "+primeiros_9_dígitosCPF_multiplicado);
            System.out.println("Soma da lista de multiplicados1: "+soma_lista_primeiros_9_dígitosCPF_multiplicado);
            System.out.println("Resto da divisão no Primeiro Digito Verificador: "+resto_divisao);
        }
    }

    public void calculoSegundoDigitoVerificador(){

        int multiplicador = 1;
        for (int i = primeiros_9_dígitosCPF.size() - 1; i >= 0 ; i--) {
            int result = primeiros_9_dígitosCPF.get(i) * (multiplicador+1);
            primeiros_9_dígitosCPF_multiplicado2.add(result);
        }

        int soma_lista_primeiros_9_dígitosCPF_multiplicado2 = 0;
        for (int i = 0; i < primeiros_9_dígitosCPF_multiplicado2.size(); i++){
            soma_lista_primeiros_9_dígitosCPF_multiplicado2 += primeiros_9_dígitosCPF_multiplicado2.get(i);
        }

        float divisao = (float)soma_lista_primeiros_9_dígitosCPF_multiplicado2 / 11;

        int resto_divisao = (int) ((divisao % 1)*10);

        int primeiro_digitoVerificador = 0;

        if (resto_divisao >= 2) {
            primeiro_digitoVerificador = 11 - resto_divisao;
            primeiros_9_dígitosCPF.add(primeiro_digitoVerificador);
            System.out.println("\nLista Original no calculo do Segundo Digito Verificador: "+primeiros_9_dígitosCPF);
            System.out.println("Lista Original multiplicada no Segundo Digito Verificador: "+primeiros_9_dígitosCPF_multiplicado2);
            System.out.println("Soma da lista de multiplicados1: "+soma_lista_primeiros_9_dígitosCPF_multiplicado2);
            System.out.println("Resto da divisão no Segundo Digito Verificador: "+resto_divisao);
        }
        else {
            primeiro_digitoVerificador = 0;
            primeiros_9_dígitosCPF.add(primeiro_digitoVerificador);
            System.out.println("\nLista Original no calculo do Segundo Digito Verificador: "+primeiros_9_dígitosCPF);
            System.out.println("Lista Original multiplicada no Segundo Digito Verificador: "+primeiros_9_dígitosCPF_multiplicado2);
            System.out.println("Soma da lista de multiplicados2: "+soma_lista_primeiros_9_dígitosCPF_multiplicado2);
            System.out.println("Resto da divisão no Segundo Digito Verificador: "+resto_divisao);
        }
    }

    public boolean validadorCPF(){
        this.numeroCPF_Str = "";
        
        for (int i = 0; i < primeiros_9_dígitosCPF.size(); i++){
            this.numeroCPF_Str += primeiros_9_dígitosCPF.get(i);
        }

        if (this.cpfCompleto.equals(numeroCPF_Str)) return true;
        else return false;
    }

    public void to_String4(){
        
        if (validadorCPF()) System.out.println("\nO CPF inserido: "+this.cpfCompleto+" é igual ao CPF gerado: "+this.numeroCPF_Str);
        else System.out.println("\nO CPF inserido: "+this.cpfCompleto+" não é igual ao CPF gerado "+this.numeroCPF_Str);
    }
}