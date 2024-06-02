package practice2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBahaviour {
    public List<Actor> actors = new ArrayList<>();
    private Queue<Human> employerQueue = new LinkedList<>();

    @Override
    public void takeInQueue(Human employer) {
        employerQueue.add(employer);
        System.out.println(employer.getName() + " встал в очередь");
    }

    private void takeOrders() {
        for (Actor actor : actors) {
            if (actor.isTakeOrder) {
                System.out.println(actor.getName() + " взял заказ");
                releaseFromMarket(actors);
                releaseFormQueue();
                break;
            }
        }
    }

    @Override
    public void giveOrders(Human employer) {
        if (employer.isMakeOrder) {
            takeOrders();
        }
    }

    private void releaseFormQueue() {
        employerQueue.poll();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
        System.err.println(actor.getName() + " добавлен в магазин");
    }

    private void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);//удалится тот, кто первым пришел
    }

    @Override
    public void update() {
        System.out.println("Текущее состояние магазина: " + actors);
        System.out.println("Текущее состояние очереди: " + employerQueue);
    }
}
