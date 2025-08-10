package com.wipro.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(5);

        try {
            for (int i = 1; i <= 5; i++) {
                final int taskId = i;

                Callable<String> call = () -> {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println("Task " + taskId + " - Number: " + j);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return "Task " + taskId + " interrupted.";
                        }
                    }
                    return "Task " + taskId + " completed.";
                };

                Future<String> future = execute.submit(call);

                // Print result when task is done
                System.out.println(future.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            execute.shutdown();
        }
    }
}
