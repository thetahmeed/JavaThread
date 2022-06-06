public class B extends Thread{
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("j="+j);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println("Error "+e.getMessage());
            }
        }
    }
}
