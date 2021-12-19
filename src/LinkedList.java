public class LinkedList {
    public Node head = null;
    public Node tail = null;
    int size = 0;

    public Node createSinglyLinkedList(int value) {
        Node newnode = new Node();
        newnode.value = value;
        head = newnode;
        newnode.next = null;
        tail = newnode;
        size++;
        return head;
    }

    public Node push(int value) {
        //we have to check wether the linked list is exist or not
        if (head != null) {
            //we have to push the element at the first
            //first we make the new node
            //then we assign the head.next to the newnode.next
            //then we make it to the head
            Node newnode = new Node();
            newnode.value = value;
            newnode.next = head;
            head = newnode;
            size++;
        }
        else{
            createSinglyLinkedList(value);
        }
        return  head;
    }
    public Node pop(){
        //firstly we have to remove the last element in pop i.e first element
        //for that we have to simply do
        //make the new head that points to the second node
        head = head.next;
        size--;
        return head;
    }
    public int peek(){
        int value = head.value;
        return value;
    }
    public void delete(){
        head = null;
        System.out.println("Linked list is successfully deleted!!!!");
    }
}