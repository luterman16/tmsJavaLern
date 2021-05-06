package hw_070521.Cunc;

public class Producer extends Thread {
    Magazine magazine;

    Producer(Magazine magazine) {
        this.magazine = magazine;
    }

    public void run() {
            for (int i=0; i < 10; i++){
                magazine.addClient();
            }
    }
}
