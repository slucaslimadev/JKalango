Claro! Aqui está o conteúdo do `README.md` em **formato Markdown**, pronto para ser copiado e colado:

````markdown
# 🐜 Projeto Personagens - SENAI

Este projeto foi desenvolvido como parte de uma atividade prática do curso do SENAI, com o objetivo de exercitar conceitos de **Programação Orientada a Objetos (POO)** em Java, como **herança**, **polimorfismo**, **classes abstratas** e **métodos sobrescritos**.

## 📄 Descrição

A aplicação simula três personagens — **Formiga**, **Abelinha** e **Kalango** — que possuem comportamentos semelhantes, mas com variações nos efeitos de suas ações. Todos herdam da classe abstrata `Personagem`, que define os métodos e atributos base.

Cada personagem pode:
- **Mover-se**, gastando energia.
- **Fazer som**, com uma onomatopeia única.
- **Comer**, recuperando energia.
- **Dormir**, recuperando 10 pontos de energia.

O sistema imprime no console o nome do personagem, suas ações e o estado atual de energia.

## 🧩 Estrutura de Classes

- `Personagem.java`  
  Classe abstrata com os métodos comuns: `mover()`, `fazerSom()`, `comer()` e `dormir()`.

- `Formiga.java`  
  Subclasse que define comportamento próprio para cada ação. Gasta pouca energia ao mover e recupera pouca energia ao comer.

- `Abelinha.java`  
  Subclasse que gasta mais energia ao se mover e faz o som característico **"Bzzzz!"**.

- `Kalango.java`  
  Subclasse mais "pesada", gasta bastante energia ao se mover, mas recupera mais ao comer.

- `App.java`  
  Classe principal com o método `main`, onde os três personagens são instanciados e interagem com o sistema.

## ▶️ Como Executar

1. Certifique-se de ter o **JDK** instalado (versão 8 ou superior).
2. Compile os arquivos `.java`:

```bash
javac *.java
````

3. Execute o programa:

```bash
java App
```

## 📌 Exemplo de Saída

```text
================== FORMIGA ==================
Nome Personagem: Formiga Bolada
A formiga está se movendo!
Energia: -1
Energia atual: 9
...
================== ABELINHA ==================
Nome Personagem: xXAbelinhaXx
A Abelinha está se movendo!
Energia: -2
Energia atual: 8
...
```

## 🎯 Conceitos Aplicados

* Herança e reutilização de código
* Sobrescrita de métodos (`@Override`)
* Encapsulamento e controle de estado (energia)
* Utilização de construtores

## 👨‍🏫 Autor

Atividade desenvolvida por \Lucas dos Santos Lima como parte das aulas de Java no SENAI.

