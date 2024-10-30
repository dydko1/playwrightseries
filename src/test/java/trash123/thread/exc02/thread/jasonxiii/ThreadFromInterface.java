package trash123.thread.exc02.thread.jasonxiii;

public class ThreadFromInterface implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 50; ++i) {
				System.out.println("Iteracja #" + i + " z wątku z interfejsu");
				Thread.sleep(1000);
			}

			System.out.println("Koniec z wątku z interfejsu!");
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}