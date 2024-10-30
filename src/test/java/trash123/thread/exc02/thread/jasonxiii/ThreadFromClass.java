package trash123.thread.exc02.thread.jasonxiii;

public class ThreadFromClass extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 50; ++i) {
				System.out.println("Iteracja #" + i + " z wątku z klasy");
				Thread.sleep(1000);
			}

			System.out.println("Koniec z wątku z klasy!");
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}