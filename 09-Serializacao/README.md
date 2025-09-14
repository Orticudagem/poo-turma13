# 09-Serialização

Projeto Maven criado automaticamente com Java 21 e JUnit 5.

## Para compilar é necessário adicionar a biblioteca GSON

- adicionar o código a seguir no arquivo pom.xml:

  <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.12.1</version>
  </dependency>

## Como compilar e rodar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="aagustini.poo.App"
```

## Como rodar testes

```bash
mvn test
```

