public class Main {
    public static void main(String[] args) {//Time complexity is o(1)
//                                           //Space complexity is 0(n)
//        Stack newStack =new Stack(4);
//        newStack.deleteStack();
//        try{
//            newStack.push(3);
//            newStack.push(2);
//            newStack.push(1);
//            newStack.push(23);
//            int results = newStack.pop();
//            System.out.println(results);
//            System.out.println(newStack.peek());
//        }catch(NullPointerException e){
//            System.out.println("Sorry !!");
        //create a linked list by creating the single node
        //for push we have to make the newnode first then assign the newnode.next = head
        //make the head = newnode
        //
        //for pop
        //we have to make the head = head.next
        LinkedList s = new LinkedList();
        s.createSinglyLinkedList(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
        }
    }
