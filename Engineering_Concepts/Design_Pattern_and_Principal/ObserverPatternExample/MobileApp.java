public class MobileApp implements Observer{
    private String name;

    public MobileApp(String name){
        this.name = name;
    }
    @Override
    public void update(String stockName,Double stockPrice){
        System.out.println(name + " MobileApp updated stockName:"+stockName+" stockPrice:"+stockPrice);
    }
}