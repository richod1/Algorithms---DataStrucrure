package dataStructures.list;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DoublyList {
    Node head;

    public void append(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node current=head;
        while(current.next !=null){
            current=current.next;
        }
        Node newNode=new Node(data);
        current.next=newNode;
        newNode.prev=current;
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + "<->");
            current=current.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args){
        DoublyList list=new DoublyList();
        list.append(30);
        list.append(50);
        list.append(90);
        list.display();

    }
    
}
