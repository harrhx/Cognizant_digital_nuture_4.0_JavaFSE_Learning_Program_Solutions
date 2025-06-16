public interface Stock {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyobserver();
}