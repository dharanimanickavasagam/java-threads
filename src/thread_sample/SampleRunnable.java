package thread_sample;

class Runner1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class SampleRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner1());
		t1.start();

		Thread t2 = new Thread(new Runner1());
		t2.start();
	}
}
