public class WebApp implements Observer{
    private String name;
    public WebApp(String name){
        this.name = name;
    }

    public void update(String stockName,Double stockPrice){
        System.out.println(name + " WebApp updated stockName:"+stockName+" stockPrice:"+stockPrice);
    }
}