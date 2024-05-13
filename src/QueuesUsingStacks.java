//question 3 cont
class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;
    public QueueUsingStacks(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }
    public void enqueue(int item) {
        if (!stack1.isFull()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(item);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        } else {
            System.out.println("Queue Overflow");
        }
    }
    public int dequeue() {
        if (!isEmpty()) {
            return stack1.pop();
        } else {
            System.out.println("Queue empty");
            return -1;
        }
    }
    public int peek() {
        if (!isEmpty()) {
            return stack1.peek();
        } else {
            System.out.println("Queue empty");
            return -1;
        }
    }
    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}


class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int item) {
        if (!isFull()) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}



