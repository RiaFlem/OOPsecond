package practice2;

public interface QueueBahaviour {
    void takeInQueue(Human human);//встать в очередь
    // void takeOrders();//сделать заказ
    void giveOrders(Human employer);//забрать заказ
    // void releaseFormQueue();//покинуть очередь
}
