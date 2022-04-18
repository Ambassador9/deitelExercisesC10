package dsa;

public class Stack {
    private int numberOfElements;
    private int[] elements = new int[5];

    public boolean isEmpty() {
        if(numberOfElements == 0) return true;
        return false;
    }

    public void push(int element) {
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public int pop() {
        numberOfElements--;
        return elements[numberOfElements];
    }

    public int peek() {
        return elements[numberOfElements - 1];
    }
}

