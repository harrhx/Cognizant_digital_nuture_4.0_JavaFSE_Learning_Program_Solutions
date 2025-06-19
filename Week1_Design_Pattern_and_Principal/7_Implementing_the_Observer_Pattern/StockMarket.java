import java.util.ArrayList;
import java.util.List;


public class StockMarket implements Stock{
    private List<Observer> observers;
    private String StockName;
    private double StockPrice;


    public StockMarket(String stockName, double stockPrice){

        observers = new ArrayList<Observer>();
        this.StockName = stockName;
        this.StockPrice = stockPrice;
    }


    public void setPrice(double price){
        this.StockPrice = price;
        notifyobserver();
    }


    @Override
    public void register(Observer observer){
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer){
        observers.remove(observer);
    }


    @Override
    public void notifyobserver(){
        for (Observer observer : observers){
            observer.update(StockName,StockPrice);
        }
    }
}