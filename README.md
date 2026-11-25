# PixBankCore

Projeto de estudo em **Java** voltado à construção de um núcleo bancário, com foco em **Programação Orientada a Objetos**, encapsulamento e regras básicas de movimentação financeira.

<p align="center">
  <strong>Em desenvolvimento</strong>
</p>

## Visão geral

O PixBankCore está sendo desenvolvido de forma incremental. A implementação atual concentra-se na entidade de conta bancária, no controle de saldo e nas primeiras operações financeiras.

## Funcionalidades

| Recurso | Estado |
|---|---|
| Cadastro de conta por titular e número | Implementado |
| Consulta de titular, número e saldo | Implementado |
| Alteração do nome do titular | Implementado |
| Depósito com validação de valor positivo | Implementado |
| Saque com validação de valor e saldo disponível | Implementado |
| Transferência entre contas | Em desenvolvimento |
| Registro e histórico de transações | Planejado |
| Operações Pix | Planejado |

## Tecnologias

- **Java**
- **BigDecimal** para representação e operações com valores monetários

## Organização do projeto

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

### Componentes principais

- **Main:** demonstra a criação de uma conta, a leitura de seus dados e a alteração do nome do titular.
- **ContaBancaria:** mantém os dados da conta, inicializa o saldo em zero e implementa os métodos de consulta, alteração do titular, depósito e saque.
- **Transacao:** arquivo reservado para a futura implementação do modelo de transações.

## Executar localmente

É necessário ter o **JDK** instalado. No terminal, a partir da raiz do repositório, acesse a pasta do projeto:

```bash
cd PixBankCore
```

Compile os arquivos:

```bash
mkdir -p out
javac -d out src/Main.java src/model/*.java
```

Execute a aplicação:

```bash
java -cp out Main
```

Atualmente, a execução demonstra a criação de uma conta e a alteração do nome do titular. Os métodos de depósito e saque já existem na classe, mas ainda não são chamados pelo fluxo principal.

## Próximas etapas

- [ ] Implementar a transferência entre contas.
- [ ] Definir e implementar a estrutura de `Transacao`.
- [ ] Integrar as operações ao fluxo principal da aplicação.
- [ ] Desenvolver o histórico de movimentações.
- [ ] Implementar as operações Pix.
- [ ] Ampliar as validações e criar testes.

## Objetivo técnico

Consolidar conceitos de encapsulamento e responsabilidade de classes, evoluindo para operações bancárias consistentes e rastreáveis. O escopo será ampliado conforme cada etapa for implementada.

---

<sub>Projeto educacional independente · Em desenvolvimento</sub>