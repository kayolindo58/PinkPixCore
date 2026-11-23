# PixBankCore

Núcleo de um sistema bancário desenvolvido em **Java**, criado para praticar Programação Orientada a Objetos e construir, gradualmente, uma simulação de operações financeiras — incluindo transferências e Pix.

> **Status:** em desenvolvimento. O projeto está na etapa de estruturação das classes fundamentais. As operações bancárias ainda não foram implementadas.

## Objetivo

O PixBankCore tem como objetivo evoluir de uma estrutura básica de conta bancária para uma aplicação capaz de representar contas, registrar transações e aplicar regras de movimentação financeira.

O desenvolvimento será incremental: cada funcionalidade será construída sobre os conceitos de Java e POO, priorizando organização, validação de dados e consistência dos valores monetários.

## Tecnologias

- **Java** — linguagem principal.
- **BigDecimal** (`java.math`) — tipo escolhido para representar valores monetários.
- **Visual Studio Code** — ambiente de desenvolvimento utilizado.

## Estrutura atual

```text
PixBankCore/
├── .vscode/
│   └── settings.json
├── src/
│   ├── Main.java
│   └── model/
│       ├── ContaBancaria.java
│       └── Transacao.java
└── out/
```

- `Main.java`: ponto de entrada da aplicação. O método `main` ainda não contém lógica.
- `model/ContaBancaria.java`: classe que representa a estrutura inicial de uma conta.
- `model/Transacao.java`: arquivo reservado para a futura implementação do modelo de transação.
- `out/`: diretório destinado aos arquivos compilados.

## Implementação existente

### ContaBancaria

A classe `ContaBancaria` possui atualmente:

| Atributo | Tipo | Finalidade |
|---|---|---|
| `nome` | `String` | Armazenar o nome do titular |
| `numeroConta` | `int` | Identificar o número da conta |
| `saldoInicial` | `BigDecimal` | Representar o saldo inicial |

O construtor recebe o nome do titular e o número da conta. O saldo é inicializado com `BigDecimal.ZERO`.

Exemplo de instanciação:

```java
ContaBancaria conta = new ContaBancaria("Maria", 1001);
```

**Importante:** essa é a implementação disponível no estágio atual. Ainda não existem métodos de depósito, saque, transferência, consulta de saldo ou validação de operações.

## Como executar

É necessário ter o **JDK** instalado e o comando `javac` disponível no terminal.

Na raiz da pasta `PixBankCore`, compile os arquivos:

```bash
javac -d out src/Main.java src/model/*.java
```

Depois, execute a aplicação:

```bash
java -cp out Main
```

Também é possível abrir a pasta do projeto no Visual Studio Code e executar `Main.java`.

Como o método `main` está vazio atualmente, a execução termina sem exibir resultados no terminal.

## Próximas etapas

O roadmap registra funcionalidades planejadas, não recursos já disponíveis.

- [ ] Implementar a classe `Transacao`.
- [ ] Definir operações de depósito e saque.
- [ ] Implementar transferências entre contas.
- [ ] Desenvolver envio e recebimento via Pix.
- [ ] Criar histórico e extrato de transações.
- [ ] Adicionar validações, como valor inválido e saldo insuficiente.
- [ ] Construir um menu interativo no `Main`.
- [ ] Implementar testes automatizados.
- [ ] Estudar uma forma de persistir os dados.

## Decisões técnicas

- **Valores monetários com `BigDecimal`:** evita os problemas de precisão binária comuns ao utilizar tipos de ponto flutuante, como `float` e `double`.
- **Evolução por etapas:** as funcionalidades serão adicionadas gradualmente, mantendo o foco no aprendizado e na compreensão das regras de negócio.

## Licença

Ainda não definida.