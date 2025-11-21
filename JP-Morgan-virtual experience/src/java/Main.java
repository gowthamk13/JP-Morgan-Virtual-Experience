
public class Main {
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock("JPM", 150.0);
        PriceFeed feed = new PriceFeed();
        DashboardManager ui = new DashboardManager();

        for(int i=0;i<10;i++){
            double newPrice = feed.generatePrice(stock.getPrice());
            stock.setPrice(newPrice);
            ui.display(stock);
            Thread.sleep(500);
        }
    }
}
