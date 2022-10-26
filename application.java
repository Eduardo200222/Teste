public class application {
    public static void main(String[] args) {
        Conta_Bancaria c1 = new Conta_Bancaria(5000,1000);
        c1.creditar(500);
        c1.debitar(1500);
        c1.debitar(2);
        c1.imprimir();
    }
}
