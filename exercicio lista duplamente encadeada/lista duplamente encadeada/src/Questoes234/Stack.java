package Questoes234;

public class Stack {
    private Node head;
    private Node tail;
    private int size;

    public Stack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        char data = this.tail.data;
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        this.size--;
        return data;
    }
}
