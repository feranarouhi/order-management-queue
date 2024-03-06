import java.util.LinkedList;

public class QueueImpl implements QueueInterface {
    //data structure - queue - LinkedList(Singly)
    private LinkedList<Customer> orderQueue;

    //default constructor to initialize the linkedList
    public QueueImpl() {
        this.orderQueue = new LinkedList<>();
    }

    public void enqueue(Customer customer) {
        orderQueue.addLast(customer);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("There is no order");
            return;
        }
        System.out.println("Successfully delivered order to: " + orderQueue.removeFirst().getEmail());
    }

    public int size() {
        return orderQueue.size();
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("There is no order");
            return;
        }
        orderQueue.getFirst().displayInfo();
    }
    //order is available or not
    public boolean isEmpty() {
        return orderQueue.isEmpty();
    }
}

