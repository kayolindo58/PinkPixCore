# PixBankCore

Um projeto em **Java** para desenvolver, por etapas, a lógica central de um sistema bancário. O foco está na aplicação de conceitos de **Programação Orientada a Objetos**, encapsulamento e manipulação segura de valores monetários.

**Status:** em desenvolvimento

## Sobre o projeto

O PixBankCore começou com a modelagem de uma conta bancária e está evoluindo para incluir operações financeiras e gerenciamento de transações. A proposta é construir cada parte com regras explícitas, código organizado e validações consistentes.

## Funcionalidades

| Funcionalidade | Situação |
|---|---|
| Criação de conta com titular e número | Implementada |
| Consulta de titular, número e saldo | Implementada |
| Alteração do titular | Implementada |
| Depósito com validação de valor positivo | Implementado |
| Saque com validação de valor e saldo disponível | Implementado |
| Transferência entre contas com validação básica | Implementada |
| Histórico de transações | Planejado |
| Operações Pix | Planejado |

## Tecnologias e conceitos

- **Java** — linguagem do projeto.
- **`BigDecimal`** — representação e operações com valores monetários.
- **Encapsulamento** — atributos privados e acesso por métodos públicos.
- **Validação de regras de negócio** — verificações de valores e saldo antes das movimentações.

## Estrutura

```text
PinkPixCore/
├── README.md
└── PixBankCore/
    └── src/
        ├── Main.java
        └── model/
            ├── ContaBancaria.java
            └── Transacao.java
```

| Arquivo | Responsabilidade |
|---|---|
| `Main.java` | Ponto de entrada e demonstração básica da criação e consulta de uma conta. |
| `ContaBancaria.java` | Dados da conta, saldo e operações de depósito, saque e transferência. |
| `Transacao.java` | Estrutura reservada para a futura implementação do registro de transações. |

## Executar

Pré-requisito: **JDK** instalado e comandos `java` e `javac` disponíveis no terminal.

A partir da raiz do repositório, entre na pasta do projeto:

```bash
cd PixBankCore
```

Compile as classes:

```bash
mkdir out
javac -d out src/Main.java src/model/ContaBancaria.java
```

Execute:

```bash
java -cp out Main
```

O programa principal demonstra a criação de uma conta, a consulta de seus dados e a alteração do titular. Depósito, saque e transferência estão implementados na classe `ContaBancaria`, mas ainda não fazem parte do fluxo demonstrado pelo `Main`.

## Pontos a evoluir

- [ ] Integrar depósito, saque e transferência ao fluxo principal.
- [ ] Implementar o modelo `Transacao` e o histórico de movimentações.
- [ ] Reforçar as validações da transferência, incluindo a identificação inequívoca das contas.
- [ ] Criar testes para operações válidas e cenários de erro.
- [ ] Desenvolver as operações Pix.

## Observação sobre o estágio atual

A transferência possui validações básicas de valor e saldo e impede a transferência para a mesma instância de conta. A identificação de contas distintas com o mesmo número ainda precisa ser tratada. O projeto não possui persistência de dados nem histórico de transações nesta etapa.

---

<sub>Projeto educacional independente · Java</sub>