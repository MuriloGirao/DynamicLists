public class Main {
    public static void main(String[] args) {
    LinkedList<Integer> mylist = new LinkedList<>();
    mylist.add(12345);
    mylist.add(12345);
    mylist.add(23456);
    mylist.add(54321);
    mylist.removedupe();
    mylist.printList();
    }
}