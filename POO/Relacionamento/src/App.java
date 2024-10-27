public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas", "123.456.789-00", 123);
        Conta conta1 = new Conta(cliente1, 100);

        Cliente cliente2 = new Cliente("Franze", "024.556.421-66", 1234);
        Conta conta2 = new Conta(cliente2, 200);

        Operacao o1 = new Operacao("D", 100);
        conta1.fazOperacao(o1);
        conta1.mostrarConta();

        Operacao o2 = new Operacao("R", 200);
        conta2.fazOperacao(o2);
        conta2.mostrarConta();

    }
}
