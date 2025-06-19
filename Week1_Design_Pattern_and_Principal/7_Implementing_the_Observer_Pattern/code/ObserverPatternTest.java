public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket("AppleINC",151.6);
        Observer mobile = new MobileApp("Myphone");
        Observer web = new WebApp("MyBrowser");

        appleStock.register(mobile);
        appleStock.register(web);

        appleStock.setPrice(130.6);
        appleStock.unregister(web);
        appleStock.setPrice(140.5);
    }
}