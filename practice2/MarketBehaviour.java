package practice2;
// import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);//входит в магазин
    // void releaseFromMarket(List<Actor> actors);//выходит из магазина
    void update();//обновление
}
