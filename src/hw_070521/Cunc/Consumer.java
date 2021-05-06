package hw_070521.Cunc;

public class Consumer extends Thread{
    Magazine magazine;


    Consumer(Magazine magazine) {
        this.magazine = magazine;
    }

    public void run() {
        for ( int i = 0; i < 10; i++){
            magazine.open();
        }
    }
}
