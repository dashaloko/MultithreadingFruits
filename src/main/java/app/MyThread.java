package app;

class MyThread extends Thread {



    DataHandler  dataHandler = new DataHandler();

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    public void run() {
        dataHandler.getOutput();
    }
}


