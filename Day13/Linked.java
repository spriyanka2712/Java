package Day13;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null; 
    }
}

class LinkedList{
    Node head;
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        } 
        temp.next = newNode;
    }

    public void inserAtPosition(int position, int data){
        if(position == 0){
            insertAtStart(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0; i < position; i++){
            if(temp == null){
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtStart(){
        if(head == null){
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd(){
        Node temp = head;
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position){
        Node temp = head;
        if(head == null){
            return;
        }
        if(position == 0){
            head = head.next;
        }
        for(int i = 0; i < position-1; i++){
            if(temp.next == null){
                return;
            }
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("null");
    }
}

public class Linked {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtStart(5);
        list.insertAtEnd(10);
        list.insertAtStart(1);
        list.display();
        list.deleteAtStart();
        list.display();
        list.deleteAtEnd();
        list.display();
    }
}
