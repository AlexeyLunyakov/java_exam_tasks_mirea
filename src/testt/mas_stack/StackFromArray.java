package testt.mas_stack;

public class StackFromArray<E> {
    private final E[] arr;
    private int top;
    private final int capacity;

    StackFromArray(int size)
    {
        arr = (E[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(E x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public void pop() {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());
        top--;
    }

    public E peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
        return null;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main (String[] args) {
        StackFromArray<Integer> stack = new StackFromArray<Integer>(3);

        stack.push(1);      // вставляем 1 в stack
        stack.push(2);      // вставляем 2 в stack

        stack.pop();        // удаление верхнего элемента (2)
        stack.pop();        // удаление верхнего элемента (1)

        stack.push(3);      // вставляем 3 в stack

        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        stack.pop();        // удаление верхнего элемента (3)

        // проверяем, пуст ли stack
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
