package hw_090421.CallBack;

interface EventHandler {
    void execute() throws InterruptedException;
}

public class CallBack {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(new Every10Second());
        timer.notification();

    }
}

class Every10Second implements EventHandler {
    @Override
    public void execute() throws InterruptedException {
                while (true) {
            Thread.sleep(10 * 1000);
            System.out.println("Прошло 10 секунд! ");

        }
    }
}

class Timer {
    EventHandler eventHandler;

    Timer(EventHandler action) {
        this.eventHandler = action;
    }

    public void notification() throws InterruptedException {
        eventHandler.execute();
    }
}

