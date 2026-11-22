import java.math.BigDecimal;

public class ContaBancaria {
    String nome;
    int numeroConta;
    BigDecimal saldoInicial;
    public ContaBancaria (String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoInicial = BigDecimal.ZERO;
    }
};