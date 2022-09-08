public class Singleton {
    private String value;
    private static volatile Singleton instance;

    private Singleton(String value){
        this.value = value;
    };

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }
}
