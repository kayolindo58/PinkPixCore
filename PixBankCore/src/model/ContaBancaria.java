import java.math.BigDecimal;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private BigDecimal saldo;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = BigDecimal.ZERO;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(BigDecimal valor) {
        if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(valor);
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(BigDecimal valor) {
        if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0 && this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    public void transferir(BigDecimal valor, ContaBancaria destinatario){

    }

};