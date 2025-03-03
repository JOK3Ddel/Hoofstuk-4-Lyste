import java.util.ArrayList;

public class UnordenedList<T> {
    private Node<T> head;

    public UnordenedList() {
        head = null;
    }

    public void add(T item) {
        Node<T> temp = new Node<T>(item);
        temp.setNext(this.head);
        this.head = temp;
    }

    public boolean search(T item) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(item)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void remove(T item) {
        Node<T> current = this.head;
        Node<T> previous = null;

        while (current != null && (!current.getData().equals(item))) {
            previous = current;
            current = current.getNext();
        }
        if (current != null) {
            if (previous == null) {
                this.head = current.getNext();
            } else {
                previous.setNext(current.getNext());
            }
        }
    }

    public void displayList() {
        // Variables
        ArrayList<String> nodeData = new ArrayList<>();
        Node<T> current = this.head;

        while (current != null) {
            // to String current item
            nodeData.add(current.toString());

            // Get next item
            current = current.getNext();
        }
        // Output
        System.out.println(nodeData);

    }
}
