package example;

public class Main {
    public static void main(String[] args) {
        OnlineShopSingleton onlineShopSingleton = OnlineShopSingleton.getInstance();
        OnlineShopSingleton onlineShopSingleton2 = OnlineShopSingleton.getInstance();

        onlineShopSingleton2.setInfo("New info");
        System.out.println(onlineShopSingleton.getInfo());
        System.out.println(onlineShopSingleton2.getInfo());
    }
}
