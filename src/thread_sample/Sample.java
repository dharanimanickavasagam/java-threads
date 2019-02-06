package thread_sample;

class Runner extends Thread {

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

public class Sample {
	public static void main(String[] args) {
		Runner run = new Runner();
		run.start();
		
		Runner run1 = new Runner();
		run1.start();
	}
}
