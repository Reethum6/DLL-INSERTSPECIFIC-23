class Dll {
    node head;
    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public void Insertspecific(int data,int position){
        node newNode = new node(data);  
        if (head ==null&&position==0){
            head=newNode;
            return;
        }
        if(position==0){
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return;
        }
        node temp=head;
        int index=0;
        while(temp!=null&&index<position-1){
            temp=temp.next;
            index++;
        }
        if(temp!=null){
            newNode.next=temp.next;
            if(temp.next!=null){
                temp.next.prev=newNode;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
        else{
            System.out.println("p");
        }
    }
    public void printAllNodes() {
        node temp = head;    
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        }
        System.out.println(); 
    }
}
public class Main {
    public static void main(String[] args) {
        Dll list = new Dll();
        list.Insertspecific(100,0);
        list.Insertspecific(200,1);
        list.Insertspecific(300,2);
        System.out.println(" ");
        list.printAllNodes();
        list.Insertspecific(250,2);
        System.out.println("after inserting 250:");
        list.printAllNodes();
    }
}