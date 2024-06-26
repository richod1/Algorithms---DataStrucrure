package dataStructures.list;

class Node{
    int data;
    Node next;
    

    Node(int data){
        this.data=data;
        this.next=null;
}
    }


    public class SinglyList{
        static Node head;
        public void append(int data){
            if(head==null){
                head=new Node(data);
                return;
            }
            Node current=head;
            while(current.next != null){
                current=current.next;
            }
            current.next=new Node(data);
        }


        public static void display(){
            Node current=head;
            while(current != null){
                System.out.print(current.data + "->");
                current=current.next;
            }
            System.out.println("null");

        }

        public static void main(String[] args){
            SinglyList list= new SinglyList();
            list.append(20);
            list.append(40);
            SinglyList.display();
        }
    }

