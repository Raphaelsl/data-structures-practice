# 📚 Guia Detalhado: Operações de Linked List

Este guia explica **o que cada operação faz** e **como implementá-las** na prática. Use como referência durante o desenvolvimento.

---

## 🔗 O que é uma Linked List?

Uma **Linked List** é uma estrutura de dados onde cada elemento (chamado de **nó**) contém:
- Um **valor** (os dados armazenados)
- Uma **referência** para o próximo nó (o "ponteiro")

Diferente de arrays, os elementos não ficam em posições contíguas na memória. Cada nó "aponta" para o próximo.

```
[3] -> [7] -> [12] -> null
```

---

## 📋 Operações Importantes

### 1️⃣ `append(T value)` - Adicionar no final

**O que faz:** Insere um novo elemento no **final** da lista.

**Como funciona:**
1. Crie um novo nó com o valor
2. Se a lista estiver vazia, o novo nó vira o `head` (primeiro elemento)
3. Se não, percorra até o último nó e faça ele apontar para o novo nó

**Exemplo:**
```java
Lista inicial: [3] -> [7] -> null
Após append(12): [3] -> [7] -> [12] -> null
```

**Complexidade:** O(n) - precisa percorrer até o fim

---

### 2️⃣ `prepend(T value)` - Adicionar no início

**O que faz:** Insere um novo elemento no **início** da lista.

**Como funciona:**
1. Crie um novo nó com o valor
2. Faça o novo nó apontar para o `head` atual
3. Atualize o `head` para ser o novo nó

**Exemplo:**
```java
Lista inicial: [7] -> [12] -> null
Após prepend(3): [3] -> [7] -> [12] -> null
```

**Complexidade:** O(1) - não precisa percorrer

---

### 3️⃣ `insertAt(int index, T value)` - Inserir em posição específica

**O que faz:** Insere um elemento em uma **posição específica** (índice).

**Como funciona:**
1. Se `index == 0`, use `prepend()`
2. Percorra até o nó na posição `index - 1`
3. Crie o novo nó
4. Faça o novo nó apontar para o próximo do nó anterior
5. Faça o nó anterior apontar para o novo nó

**Exemplo:**
```java
Lista inicial: [3] -> [12] -> null
Após insertAt(1, 7): [3] -> [7] -> [12] -> null
```

**Atenção:** Lance `IndexOutOfBoundsException` se o índice for inválido.

**Complexidade:** O(n) - pode precisar percorrer até o índice

---

### 4️⃣ `remove(T value)` - Remover primeira ocorrência

**O que faz:** Remove a **primeira ocorrência** de um valor na lista.

**Como funciona:**
1. Se o `head` tem o valor, atualize `head` para `head.next`
2. Caso contrário, percorra a lista até encontrar um nó cujo **próximo** tem o valor
3. "Pule" esse nó fazendo: `current.next = current.next.next`

**Exemplo:**
```java
Lista inicial: [3] -> [7] -> [12] -> null
Após remove(7): [3] -> [12] -> null
```

**Atenção:** Se o valor não existir, não faça nada (ou retorne `false`).

**Complexidade:** O(n) - pode precisar percorrer toda a lista

---

### 5️⃣ `reverse()` - Inverter a lista

**O que faz:** Inverte a ordem dos elementos da lista.

**Como funciona (iterativo):**
1. Use três ponteiros: `prev` (null), `current` (head), `next`
2. Percorra a lista:
    - Salve o próximo nó em `next`
    - Inverta a direção: `current.next = prev`
    - Avance os ponteiros: `prev = current`, `current = next`
3. Atualize `head = prev` no final

**Exemplo:**
```java
Lista inicial: [3] -> [7] -> [12] -> null
Após reverse(): [12] -> [7] -> [3] -> null
```

**Complexidade:** O(n) - percorre uma vez

---

### 6️⃣ `find(T value)` - Buscar elemento

**O que faz:** Procura um valor na lista e retorna:
- O **índice** onde está (0, 1, 2...)
- Ou `-1` se não encontrar
- Ou `boolean` (true/false)

**Como funciona:**
1. Percorra a lista mantendo um contador de posição
2. Compare cada valor
3. Retorne o índice quando encontrar

**Exemplo:**
```java
Lista: [3] -> [7] -> [12] -> null
find(7) retorna: 1
find(99) retorna: -1
```

**Complexidade:** O(n) - pode precisar percorrer tudo

---

### 7️⃣ `hasCycle()` - Detectar ciclo (Floyd's Algorithm)

**O que faz:** Verifica se a lista tem um **ciclo** (um nó aponta de volta para um nó anterior, criando um loop infinito).

**Como funciona (Tortoise and Hare):**
1. Use dois ponteiros: `slow` (tartaruga) e `fast` (lebre)
2. `slow` avança **1 nó** por vez
3. `fast` avança **2 nós** por vez
4. Se houver ciclo, eventualmente `slow == fast`
5. Se `fast` chegar em `null`, não há ciclo

**Exemplo de ciclo:**
```
[3] -> [7] -> [12]
        ^       |
        |-------+
```

**Complexidade:** O(n) - no máximo 2 passadas

---

## 🧪 Métodos auxiliares importantes

### `size()` - Contar elementos
Percorra a lista contando os nós até chegar em `null`.

### `toList()` - Converter para ArrayList
Útil para testes: percorra e adicione cada valor em uma `ArrayList<T>`.

### `isEmpty()` - Verificar se está vazia
Retorne `head == null`.

---

## ⚠️ Cuidados importantes

1. **Sempre verifique se `head` é null** antes de acessar
2. **Cuidado com ciclos infinitos** ao percorrer
3. **Não perca a referência do head** ao manipular
4. **Lance exceções apropriadas** para índices inválidos
5. **Considere listas vazias** em todos os testes

---

## 🎯 Checklist de implementação

- [ ] Classe `Node<T>` com `value` e `next`
- [ ] `append()` funcionando em lista vazia e não vazia
- [ ] `prepend()` atualizando o head corretamente
- [ ] `insertAt()` com validação de índice
- [ ] `remove()` tratando remoção do head e de outros nós
- [ ] `reverse()` sem perder nós
- [ ] `find()` retornando índice correto
- [ ] `hasCycle()` usando Floyd's algorithm
- [ ] Testes JUnit para cada operação
- [ ] Testes de casos extremos (lista vazia, 1 elemento)

---

## 📊 Resumo de Complexidades

| Operação | Complexidade de Tempo | Complexidade de Espaço |
|----------|----------------------|------------------------|
| `append()` | O(n) | O(1) |
| `prepend()` | O(1) | O(1) |
| `insertAt()` | O(n) | O(1) |
| `remove()` | O(n) | O(1) |
| `reverse()` | O(n) | O(1) |
| `find()` | O(n) | O(1) |
| `hasCycle()` | O(n) | O(1) |

---

## 🚀 Próximos passos

Depois de implementar e testar todas as operações:
1. Resolva os 3 exercícios do LeetCode
2. Compare suas soluções com as oficiais
3. Documente seu aprendizado no README
4. Abra o Pull Request

**Dica:** Desenhe no papel antes de codificar. Visualizar os ponteiros ajuda muito!

---

## 📝 Estrutura de código sugerida

```java
public class SinglyLinkedList<T> {
    
    private static class Node<T> {
        T value;
        Node<T> next;
        
        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
    
    private Node<T> head;
    private int size;
    
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // Implemente aqui:
    // - append(T value)
    // - prepend(T value)
    // - insertAt(int index, T value)
    // - remove(T value)
    // - reverse()
    // - find(T value)
    // - hasCycle()
    // - size()
    // - isEmpty()
    // - toList()
}
```

---

## 💡 Exemplo de teste JUnit

```java
@Test
public void testAppendInEmptyList() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.append(10);
    
    assertEquals(1, list.size());
    assertEquals(List.of(10), list.toList());
}

@Test
public void testPrepend() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.append(20);
    list.prepend(10);
    
    assertEquals(2, list.size());
    assertEquals(List.of(10, 20), list.toList());
}

@Test
public void testInsertAt() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.append(10);
    list.append(30);
    list.insertAt(1, 20);
    
    assertEquals(List.of(10, 20, 30), list.toList());
}
```

---

**Boa sorte na implementação! 🚀**