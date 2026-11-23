# PixBankCore

**Projeto de estudo em Java para modelagem de um sistema bancário.**

O PixBankCore está em desenvolvimento e tem como objetivo aplicar conceitos de Programação Orientada a Objetos na construção de uma aplicação bancária, evoluindo a partir da modelagem de contas e transações.

## Estado do projeto

<div align="center">

**Em desenvolvimento · Etapa inicial**

</div>

No estágio atual, o projeto possui a estrutura inicial da classe `ContaBancaria`. As operações bancárias ainda não estão implementadas.

## Tecnologias

- Java
- `BigDecimal` para representação de valores monetários

## Estrutura

```text
src/
├── Main.java
└── model/
    ├── ContaBancaria.java
    └── Transacao.java
```

| Componente | Responsabilidade atual |
|---|---|
| `Main` | Ponto de entrada da aplicação; ainda sem lógica implementada. |
| `ContaBancaria` | Estrutura inicial da conta, com titular, número e saldo inicial. |
| `Transacao` | Arquivo reservado para a futura modelagem de transações. |

## Modelo atual

A classe `ContaBancaria` recebe o nome do titular e o número da conta pelo construtor. O saldo é inicializado em zero usando `BigDecimal.ZERO`.

```java
ContaBancaria conta = new ContaBancaria("Maria", 1001);
```

## Executar

Com o JDK instalado, execute na raiz do projeto:

```bash
mkdir -p out
javac -d out src/Main.java src/model/*.java
java -cp out Main
```

O programa ainda não apresenta saída no terminal, pois o método `main` está vazio.

## Planejamento

- [ ] Definir os atributos e o comportamento de `Transacao`.
- [ ] Implementar operações de depósito e saque.
- [ ] Criar transferências entre contas.
- [ ] Desenvolver o fluxo de envio e recebimento via Pix.
- [ ] Registrar e consultar o histórico de transações.
- [ ] Aplicar regras de validação e testes.
- [ ] Implementar persistência de dados.

## Objetivo de desenvolvimento

Construir o projeto por etapas, mantendo as responsabilidades das classes claras e tratando valores financeiros com precisão. Os itens do planejamento representam trabalho futuro, não funcionalidades disponíveis nesta versão.

---

<sub>Projeto educacional em desenvolvimento.</sub>