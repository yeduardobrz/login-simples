# 🔐 Sistema de Login Simples com Bloqueio de Tentativas

## 📌 Visão Geral

Este projeto implementa um **sistema de login simples em Java**, executado no terminal, que valida credenciais de acesso e **bloqueia o usuário após 3 tentativas incorretas**.

O objetivo principal é praticar conceitos fundamentais da linguagem Java, como:

* Entrada de dados com `Scanner`
* Estruturas condicionais (`if / else`)
* Laços de repetição (`while`)
* Comparação correta de `String` com `.equals()`
* Controle de fluxo com variáveis booleanas

---

## 🧠 Regras de Funcionamento

* O sistema possui um **login fixo** e uma **senha fixa**.
* O usuário tem **no máximo 3 tentativas** para acertar as credenciais.
* Se o login e a senha estiverem corretos:

  * o acesso é liberado imediatamente.
* Caso contrário:

  * uma tentativa é consumida.
* Ao atingir 3 tentativas incorretas:

  * o acesso é bloqueado.

---

## 🔄 Fluxo de Execução

### 1️⃣ Inicialização das Variáveis

```java
String loginCorreto = "admin";
String senhaCorreta = "admin";
int tentativas = 0;
boolean acessoLiberado = false;
```

* `loginCorreto` e `senhaCorreta`: credenciais válidas do sistema
* `tentativas`: contador de erros
* `acessoLiberado`: controla a saída do laço de repetição

---

### 2️⃣ Laço de Repetição (`while`)

```java
while (tentativas < 3 && !acessoLiberado)
```

O sistema continua solicitando login e senha **enquanto**:

* o número de tentativas for menor que 3
* o acesso ainda não tiver sido liberado

Essa condição garante que o programa possa encerrar antes do limite caso o usuário acerte as credenciais.

---

### 3️⃣ Validação das Credenciais

```java
if (loginCorreto.equals(login) && senhaCorreta.equals(senha))
```

As `String` são comparadas utilizando `.equals()`, que verifica o conteúdo dos textos, e não a referência de memória.

---

### 4️⃣ Controle de Tentativas

* Em caso de erro:

  * o contador de tentativas é incrementado
  * o usuário é informado sobre quantas tentativas restam

* Em caso de sucesso:

  * o acesso é liberado
  * o laço é encerrado

---

### 5️⃣ Bloqueio de Acesso

```java
if (!acessoLiberado)
```

Caso o laço termine sem sucesso na autenticação, o sistema informa que o acesso foi bloqueado por excesso de tentativas.

---

## ⚠️ Observações Importantes

* O sistema **não possui validação de entrada** (ex: campos vazios).
* As credenciais são fixas e estão diretamente no código-fonte.
* O projeto é didático e não deve ser usado em ambiente real de produção.

---

## 🚀 Possíveis Melhorias

* Permitir cadastro de usuário e senha
* Armazenar credenciais em arquivo ou banco de dados
* Ocultar a digitação da senha
* Separar a lógica em métodos
* Criar uma versão orientada a objetos

---

## ✅ Conclusão

Este projeto é um **exercício fundamental** para quem está evoluindo em Java e deseja consolidar:

* lógica de programação
* controle de fluxo
* boas práticas iniciais

Ideal para portfólio inicial e repositórios de estudo ☕📚
