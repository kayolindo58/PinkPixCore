# PixBankCore

Núcleo de um sistema bancário em **Java**, com foco em simular operações de conta e transações (incluindo Pix). O projeto está em fase inicial e vai crescer aos poucos.

> 🚧 **Status:** em desenvolvimento. Hoje existe apenas o modelo de conta; as demais funcionalidades estão no [roadmap](#roadmap).

## Tecnologias

- Java (JDK 17 ou superior recomendado)
- `java.math.BigDecimal` para valores monetários (evita erros de ponto flutuante)
- VS Code com Extension Pack for Java (configuração em `.vscode/`)

## Estrutura do projeto

```
PixBankCore/
├── .vscode/
│   └── settings.json
├── src/
│   ├── Main.java                  # Ponto de entrada da aplicação
│   └── model/
│       ├── ContaBancaria.java     # Entidade de conta bancária
│       └── Transacao.java         # Entidade de transação (a implementar)
└── out/                           # Arquivos compilados (gerado)
```

## Funcionalidades atuais

### `ContaBancaria`

Representa uma conta com:

| Campo          | Tipo         | Descrição                          |
|----------------|--------------|------------------------------------|
| `nome`         | `String`     | Nome do titular                    |
| `numeroConta`  | `int`        | Número da conta                    |
| `saldoInicial` | `BigDecimal` | Saldo da conta, começa em `0`      |

Exemplo de criação:

```java
ContaBancaria conta = new ContaBancaria("Maria", 1001);
```

## Como executar

Na raiz do projeto (`PixBankCore/`):

```bash
# Compilar
javac -d out src/Main.java src/model/*.java

# Executar
java -cp out Main
```

Ou abra a pasta no VS Code e execute `Main.java` pelo botão **Run**.

> Por enquanto o `main` está vazio, então a execução não imprime nada.

## Roadmap

- [ ] Implementar a classe `Transacao` (tipo, valor, data/hora, origem e destino)
- [ ] Depósito e saque
- [ ] Transferência entre contas
- [ ] Pix (chaves, envio e recebimento)
- [ ] Histórico/extrato de transações
- [ ] Validações (saldo insuficiente, valores inválidos)
- [ ] Menu interativo no `Main`
- [ ] Testes unitários
- [ ] Persistência de dados

## Como contribuir / adicionar funções

1. Mantenha as entidades em `src/model/`.
2. Use `BigDecimal` para qualquer valor monetário.
3. Atualize este README (seções *Funcionalidades atuais* e *Roadmap*) a cada nova função.

## Licença

A definir.
