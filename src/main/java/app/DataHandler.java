package app;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;



public class DataHandler {
    DataRepository dataRepository = new DataRepository();
    String[] fruits = new DataRepository().getData();

    public void getOutput() {

        synchronized (this ) {
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);
            for (String fruit : fruits) {

                sb.append(String.format("(%d) %s ", count.get(), fruit));

            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}

