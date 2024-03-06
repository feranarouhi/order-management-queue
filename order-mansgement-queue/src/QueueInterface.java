public interface QueueInterface {

    void enqueue(Customer customer);

    //delete element from the front
    void dequeue();

    //return total number of elements
    int size();

    //get first element
    void peek();

    //queue is empty or not
    boolean isEmpty();

}
