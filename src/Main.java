public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setCodigo(1);
        conta.setCpf("123.456.789-00");
        conta.setNomeCliente("Maria");

        conta.depositar(1000);
        conta.sacar(200);

        System.out.println("Código da conta: " + conta.getCodigo());
        System.out.println("CPF: " + conta.getCpf());
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}