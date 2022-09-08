public class Demo {
    public static void main(String[] args) {
        new Thread(() -> {
            Singleton singleton = Singleton.getInstance("foo");
            System.out.println(singleton.getValue());
        }).start();

        new Thread(() -> {
            Singleton singleton = Singleton.getInstance("bar");
            System.out.println(singleton.getValue());
        }).start();
    }
}
