package hw_090421.CallBack;

interface EventHandler {
    void execute();
}

public class CallBack {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(new Every10Second());

        while (true) {
            Thread.sleep(10 * 1000);
            timer.notification();
        }
    }
}

class Every10Second implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Прошло 10 секунд! ");
    }
}

class Timer {
    EventHandler eventHandler;

    Timer(EventHandler action) {
        this.eventHandler = action;
    }

    public void notification() {
        eventHandler.execute();
    }
}

