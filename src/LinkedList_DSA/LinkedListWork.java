package LinkedList_DSA;

public class LinkedListWork {
    Node head;
    public void insert(int data)
    {
        //every time we insert we have to create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        //Checking if it is our first object
        if( head == null){
            head = node;
        }
        else {

            //If not first obj then we will create a node and make it as head
            Node n = head;
            //we will stop whenever we get next value as null
            while (n.next != null){
                //if it is not null we will jump to next node
                n = n.next;
            }
            //once we get null in our next we have to change the value from null to new nod ethat we created
            n.next = node;
        }
    }
    //method to print the linkedlist data
    public void show()
    {

            Node node = head;
            while(node.next != null){
                System.out.println(node.data);
                //Everytime we print it we just shift to next node
                node = node.next;
            }
            //for last element we need to print it outside the loop because it will not get printed in the loop itself

        System.out.println(node.data);
    }
}
