package adv;

import com.sun.tools.javac.Main;

public class ThreadsExm extends Thread {
    public static void main(String[] args) {
        ThreadsExm thread = new ThreadsExm();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
