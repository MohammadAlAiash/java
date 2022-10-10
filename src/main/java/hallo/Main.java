package hallo;

public class Main {
    public static void main(String[] args) {

        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
        list.removeLast();
        list.addFirst(40);
        System.out.println(list.contains(10));




    }
}
