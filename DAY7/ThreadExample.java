class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadExample t3 = new ThreadExample();
        t1.start();
        try {
            t1.join(); // Wait for t1 to finish before t2 starts
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        try {
            t2.join(); // Wait for t1 to finish before t2 starts
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
    }
}
