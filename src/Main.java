public class Main {
    public static void main(String[] args) {
        Cliente venilton  = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta cp = new ContaPoupanca(venilton);

        System.out.println();
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
