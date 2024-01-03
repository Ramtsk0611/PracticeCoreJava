package com.practice.example.learning.executiveService;

import java.util.concurrent.*;

public class ESPractice {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService
                = Executors.newFixedThreadPool(1);
        Future obj = executorService.submit(new Callable() {
            public Object call() {
                System.out.println(
                        "This is submit() "
                                + "method example");

                return "Returning Callable "
                         + "Task Result";
            }
        });
        System.out.println(obj.get());
        executorService.shutdown();

        executorService.execute(new Runnable() {
            public void run()
            {
                System.out.println(
                        "This is execute() "
                                + "method example");
            }
        });
        executorService.shutdown();
    }
}
