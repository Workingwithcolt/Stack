public class Stack {
    int[] arr;
    int topOFstack;
    public Stack(int size){
        this.arr =new int[size];
        this.topOFstack = -1;
        System.out.println("The stack is created with the size of ::"+size);
    }
    public boolean isEmpty(){

        if(topOFstack == -1){
            return true;
        }else{//Time complexity = 0(1) = space complexity
            return false;
        }
    }
    public boolean isFull(){
        if(topOFstack == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }else{
            arr[topOFstack+1] =value;
            topOFstack++;
            System.out.println("The value is successfully inserted in the stack");
        }
    }
    public  int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty ");
            return -1;
        }else{
            int topStack = arr[topOFstack];
            topOFstack--;
            return topStack;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[topOFstack];
        }
    }
    public void deleteStack(){
        arr = null;
        System.out.println("The Stack is successfully deleted");
    }
}
