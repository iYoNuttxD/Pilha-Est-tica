package Pilha;

public class Pilha {

    private int top = -1;
    private int[] data;

    public Pilha(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == - 1;
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("Pilha cheia");
        } else {
            this.data[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return -1;
        } else {
            return this.data[top--];
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= top; i++) {
                this.data[i] = 0;
            }
            top = -1;
        }
    }

    public void printPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

    }
}
