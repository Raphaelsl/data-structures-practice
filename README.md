# Semana 3 – Estrutura de Dados: Linked Lists (Java)

Bem-vindo(a) à **Semana 3 do planejamento de estudos de Estruturas de Dados**!  
O foco desta semana é desenvolver um entendimento profundo de **Linked Lists**, implementando tudo na prática em **Java**, criando testes e resolvendo exercícios no **LeetCode** relacionados ao tema.

---

# 📌 Objetivo da Semana

Nesta semana você irá:

- Entender **o conceito de Linked List** e porque ela difere de arrays.
- Criar sua própria implementação em Java de uma **Singly Linked List**.
- Implementar as operações mais importantes:
  - `append`
  - `prepend`
  - `insertAt(index)`
  - `remove(value)`
  - `reverse()`
  - `find(value)`
  - `hasCycle()` (algoritmo Floyd – "Tortoise and Hare")
- Escrever testes JUnit para validar o comportamento.
- Resolver 3 exercícios fáceis no LeetCode que reforçam o aprendizado.
- Abrir um Pull Request no GitHub com tudo implementado.

O objetivo é consolidar seu conhecimento sobre manipulação de ponteiros, navegação sequencial, construção de nós encadeados e detecção de ciclos.

---

# 📚 Por que estudar Linked Lists?

Linked Lists são fundamentais para entender:

- Como estruturas encadeadas funcionam na memória.
- Como manipular referências/ponteiros em Java.
- A diferença entre **acesso por índice** vs **navegação sequencial**.
- A base para estruturas complexas como:
  - Stacks
  - Queues
  - HashMap (listas para resolução de colisão)
  - Árvores

Além disso, entrevistadores **adoram** Linked Lists porque elas testam lógica, ponteiros e segurança no código.

---

# 🗓 Plano Diário (Semana 3)

A semana foi organizada para você evoluir gradualmente, escrevendo código limpo e testável.

## **📅 Dia 1 — Estrutura base + append/prepend**
- Criar pacote `linkedlists/`
- Implementar:
  - Classe interna `Node<T>`
  - `append(T value)`
  - `prepend(T value)`
  - `toList()` para facilitar testes
  - `size()`
- Criar primeiros testes JUnit:
  - Inserção em lista vazia e não vazia
  - Verificar `size()`
  - Resultado da conversão para lista

---

## **📅 Dia 2 — insertAt e remove**
- Implementar:
  - `insertAt(int index, T value)`
  - `remove(T value)` → remover primeira ocorrência
- Testes:
  - Inserção no início, meio e fim
  - Remoção de elementos existentes e inexistentes
  - Testar exceções (`IndexOutOfBoundsException`)

---

## **📅 Dia 3 — reverse e find**
- Implementar:
  - `reverse()` (iterativo)
  - `find(T value)` retornando posição ou boolean
- Testes:
  - Reverter lista vazia, com 1 elemento e com vários
  - Encontrar/no encontrar valores

---

## **📅 Dia 4 — hasCycle (Floyd — Tortoise & Hare)**
- Implementar:
  - `hasCycle()` usando ponteiros rápidos/lentos
- Testes:
  - Criar manualmente um ciclo dentro do teste
  - Validar detecção correta

---

## **📅 Dia 5 — Finalização + README + PR**
- Revisar código
- Garantir cobertura mínima de testes
- Criar README dentro da pasta da semana
- Criar branch e abrir Pull Request no GitHub
- Adicionar no PR:
  - Link para os exercícios do LeetCode resolvidos
  - Descrição clara do que foi implementado

---

# 🧪 O que você deve entregar ao final da semana

- [ ] Implementação completa da `SinglyLinkedList<T>`
- [ ] Testes JUnit cobrindo:
  - Casos básicos
  - Casos de borda
  - Reverse
  - Ciclo
- [ ] README da pasta explicando:
  - Operações implementadas
  - Complexidade de cada uma
- [ ] 3 exercícios do LeetCode resolvidos
- [ ] Um Pull Request com tudo organizado e funcionando

---

# 🧠 Exercícios recomendados do LeetCode

Para reforçar exatamente o que você está estudando na semana, resolva estes 3 problemas fáceis:

---

### ✅ **1. Reverse Linked List (Fácil)**  
🔗 https://leetcode.com/problems/reverse-linked-list/  
Problema essencial para praticar manipulação de ponteiros.

---

### ✅ **2. Merge Two Sorted Lists (Fácil)**  
🔗 https://leetcode.com/problems/merge-two-sorted-lists/  
Aprenda a navegar duas listas simultaneamente sem criar ciclos acidentais.

---

### ✅ **3. Linked List Cycle (Fácil)**  
🔗 https://leetcode.com/problems/linked-list-cycle/  
Perfeito para praticar o algoritmo de Floyd (hasCycle).

---

# 🧩 Como organizar suas soluções

Crie uma pasta dedicada:

src/main/java/com/example/datastructures/leetcode/

E coloque um arquivo para cada exercício, exemplo:

Leet206_ReverseLinkedList.java Leet21_MergeTwoSortedLists.java Leet141_LinkedListCycle.java

Com testes em:

src/test/java/.../leetcode/

---

# 📈 Como isso se conecta ao desenvolvimento profissional?

A Semana 3 estabelece a base para:
- Semana 4: Stacks & Queues  
- Semana 5: Hash Tables  
- Futuras estruturas como Trees e Graphs  

Além disso, Linked Lists são cobradas em empresas como:
- Meta  
- Google  
- Amazon  
- Microsoft  
- Mercado Livre (para posições de dev / estagiário)

Saber Linked Lists **muito bem** fará o restante do seu progresso ser mais natural.

---

# 🚀 Boa prática da semana

> **Faça commits pequenos e frequentes.**  
> Cada nova operação → 1 commit.  
> Cada novo teste → 1 commit.  
> Isso ajuda na revisão e na sua organização mental.

---
