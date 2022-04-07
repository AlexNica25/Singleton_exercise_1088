package example;

public class OnlineShopSingleton {

    private static OnlineShopSingleton instance;
    private String info = "infoo";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private OnlineShopSingleton() {}

    public static synchronized OnlineShopSingleton getInstance() {
        if(instance == null) {
            instance = new OnlineShopSingleton();
        }
        return instance;
    }

}
