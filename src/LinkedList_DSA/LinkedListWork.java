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

    public void insertAtStart (int data){
        //every time we insert we have to create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;
        //What was the value for head will be the value of this node as we are inserting the node at the starting
        node.next = head;
        //head changed to the node
        head = node;
    }

    //This method will be used to insert the data to any position ( we will be naming pos as index)
    public void insertAt(int index , int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        //Special condition if the index is 0
        if(index == 0){
            insertAtStart(data);
        }
        else {


            //Starting with head because we need to traverse from the beginning
            Node n = head;
            //index-1 because we are referring to next node
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            //we need to now chnage the address of the current node with new node
            node.next = n.next;
            // updating the address of the node to point it to next node
            n.next = node;
        }


    }
    //Delete the element at a specific position/index
    public void deleteAt(int index){
       if(index == 0){
           head = head.next;
       }
       else{
           Node n = head;
           //temporary node n1
           Node n1 = null;
           for(int i = 0;i<index-1;i++){

               n=n.next;
           }
           //n1 is the next element of the node
           n1 = n.next;
           //n.next need to replaced by n1.next (only address is getting changed here in this case
           n.next = n1.next;
           //nullifying our temporary node
           n1 = null;
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
