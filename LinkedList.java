import java.util.HashSet;
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(head==null){
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList(){
        Node<T> current = head;
        while (current!=null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void remove(T data){
        if(head==null){
            return;
        }
        if (head.data.equals(data)){
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)){
            current=current.next;
        }
        if (current.next != null){
            current.next=current.next.next;
        }
    }
    public boolean contains(T data){
        Node<T> current = head;
        while (current != null){
            if (current.data.equals(data)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void removedupe(){
        if (head == null || head.next == null) {
            return; // No duplicates to remove from an empty list or a list with a single element.
        }

        HashSet<Integer> seen = new HashSet<>();
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            int currentData = (int) current.data;
            if (seen.contains(currentData)) {
                // Duplicate found, remove the node.
                previous.next = current.next;
            } else {
                seen.add(currentData);
                previous = current;
            }
            current = current.next;
        }
    }
    }


