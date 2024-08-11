package Pilha;

public class Main {
    public static void main(String[] args) {
        // Criação de uma pilha com capacidade para 5 elementos
        Pilha pilha = new Pilha(5);

        // Teste: Verificar se a pilha está vazia
        System.out.println("Teste 1 - A pilha está vazia? " + pilha.isEmpty()); // Deve ser true

        // Teste: Adicionar elementos à pilha
        System.out.println("Teste 2 - Adicionando 10");
        pilha.push(10);
        System.out.println("Teste 3 - Adicionando 20");
        pilha.push(20);
        System.out.println("Teste 4 - Adicionando 30");
        pilha.push(30);
        System.out.println("Teste 5 - Adicionando 40");
        pilha.push(40);
        System.out.println("Teste 6 - Adicionando 50");
        pilha.push(50);

        // Teste: Tentar adicionar um elemento quando a pilha está cheia
        System.out.println("Teste 7 - Tentando adicionar 60");
        pilha.push(60); // Deve imprimir "Pilha cheia"

        // Teste: Verificar o estado atual da pilha
        System.out.print("Teste 8 - Estado atual da pilha: ");
        pilha.printPilha(); // Output: Pilha: 10 20 30 40 50

        // Teste: Remover elementos da pilha
        System.out.println("Teste 9 - Removendo elemento: " + pilha.pop()); // Deve ser 50
        System.out.println("Teste 10 - Removendo elemento: " + pilha.pop()); // Deve ser 40

        // Teste: Verificar o estado atual da pilha
        System.out.print("Teste 11 - Estado atual da pilha: ");
        pilha.printPilha(); // Output: Pilha: 10 20 30

        // Teste: Limpar a pilha
        System.out.println("Teste 12 - Limpando a pilha");
        pilha.clear();
        System.out.print("Teste 13 - Estado atual da pilha após limpar: ");
        pilha.printPilha(); // Deve imprimir "Pilha vazia"

        // Teste: Verificar se a pilha está vazia após limpar
        System.out.println("Teste 14 - A pilha está vazia após limpar? " + pilha.isEmpty()); // Deve ser true

        // Teste: Tentar remover elemento de uma pilha vazia
        System.out.println("Teste 15 - Removendo elemento de uma pilha vazia: " + pilha.pop()); // Deve imprimir "Pilha vazia" e retornar -1

        // Teste: Adicionar elementos novamente após limpar
        System.out.println("Teste 16 - Adicionando 100");
        pilha.push(100);
        System.out.println("Teste 17 - Adicionando 200");
        pilha.push(200);

        // Teste: Verificar o estado atual da pilha
        System.out.print("Teste 18 - Estado atual da pilha: ");
        pilha.printPilha(); // Output: Pilha: 100 200

        // Teste: Verificar se a pilha está cheia
        System.out.println("Teste 19 - A pilha está cheia? " + pilha.isFull()); // Deve ser false

        // Teste: Adicionar mais elementos até a pilha ficar cheia
        System.out.println("Teste 20 - Adicionando 300");
        pilha.push(300);
        System.out.println("Teste 21 - Adicionando 400");
        pilha.push(400);
        System.out.println("Teste 22 - Adicionando 500");
        pilha.push(500);
        System.out.print("Teste 23 - Estado atual da pilha: ");
        pilha.printPilha(); // Output: Pilha: 100 200 300 400 500

        // Teste: Verificar se a pilha está cheia após adicionar todos os elementos
        System.out.println("Teste 24 - A pilha está cheia agora? " + pilha.isFull()); // Deve ser true
    }
}
