public class A extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i="+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println("Error "+e.getMessage());
            }
        }
    }
}