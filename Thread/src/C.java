public class C extends Thread{
    public void run() {
        for (int k = 0; k < 5; k++) {
            System.out.println("k="+k);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println("Error "+e.getMessage());
            }
        }
    }
}