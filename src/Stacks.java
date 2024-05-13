//question 2
public class Stacks {
    int[] Stack = new int[3];
    int top = 0;
    public static void main(String[] args){
        Stacks nums = new Stacks();
        nums.push(1);
        nums.push(2);
        nums.push(3);

        //System.out.println(nums.pop());
        nums.show();
        //System.out.println(nums.peek());
        //System.out.println(nums.size());
        //System.out.println(nums.isEmpty());
        System.out.println(nums.isFull());

    }
    public void push(int data){
        if(isFull()){
            System.out.println("stack is full");
        }
        else {
            Stack[top] = data;
            top++;
        }

    }
    public void show(){
        for(int stakss:Stack){
            System.out.print(stakss);

        }
        System.out.println();
    }
    public int pop() {
        int data = 0;
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else {
            top--;
            data = Stack[top];
            Stack[top] = 0;
        }
        return data;

    }
    public int peek(){
        int data =0;
        top--;
        data = Stack[top];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public boolean isFull(){

        return top  == Stack.length;
    }
}
