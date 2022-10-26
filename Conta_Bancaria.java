import java.sql.SQLOutput;

public class Conta_Bancaria {
    private int numero;
    private double saldo;
    private static int contador = 0;

    public void imprimir(){
        System.out.println("..........................");
        System.out.println(" o numero da conta é: " + this.getNumero());
        System.out.println(" comm o saldo de: " + this.getSaldo());
        System.out.println(" quantos obejto tem? " + contador);
    }

    public Conta_Bancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        contador++;
    }

    public void creditar(double VALOR_ENTRADA){
        this.saldo = saldo + VALOR_ENTRADA;
        System.out.println(" Creditamos com sucesso! ");
    }
    public void debitar(double VALOR_ENTRADA){
        if (this.saldo >= VALOR_ENTRADA){
            this.saldo = saldo - VALOR_ENTRADA;
            System.out.println(" debitamos com sucesso! ");
        }else {
            System.out.println(" saldo insuficiente, não podemos debitar! ");
        }

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
