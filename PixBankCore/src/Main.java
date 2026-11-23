public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("kayo", 13278912);

        System.out.println("Titular: " + conta1.getNome());
        System.out.println("Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        conta1.setNome("kayo julian");

        System.out.println("Nome novo: " + conta1.getNome());

    }
};
