import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("kayo", 189320);

        System.out.println("nome de usuario: " + conta1.nome);
        System.out.println("numero da conta: " + conta1.numeroConta);
        System.out.println("saldo atual: " + BigDecimal.ZERO);

    }
}; 
