# Lista 04 - Sistema de Gerenciamento de Feira de Livros Usados

Este projeto em Java implementa um sistema simples para gerenciar uma feira de livros usados. A aplicação permite que o usuário cadastre livros com informações como título, autor e ano de publicação, organizando os livros por autor de forma ordenada.


## 👨‍🎓 Aluno

**Nome:** Adryan Ryan Santos  
**R.A:** 007194

## 👨‍🏫 Professor

**Alysson Naves**

## 📁 Pacote

`Lista_04_Alysson`

## 📌 Funcionalidades

- Inserção de livros por autor
- Ordenação automática dos livros utilizando `TreeSet`
- Organização dos autores e seus livros com `TreeMap`
- Impressão dos dados cadastrados na estrutura

## 🛠️ Tecnologias Utilizadas

- Java (versão padrão)
- Estruturas de dados: `TreeMap`, `TreeSet`, `Scanner`

## 📄 Estrutura do Projeto

### Classe `Livro`

Representa um livro com:
- `titulo`: título do livro
- `autor`: autor do livro
- `ano`: ano de publicação

A classe implementa a interface `Comparable` para garantir a ordenação baseada em uma chave gerada a partir dos atributos do livro.

### Classe `appFeira`

Classe principal que:
- Lê os dados do usuário
- Cria objetos `Livro`
- Armazena os livros em um `TreeMap<String, TreeSet<Livro>>`, onde a chave é o autor e o valor é um conjunto de livros ordenados
- Exibe todos os registros inseridos
