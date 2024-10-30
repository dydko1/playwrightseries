package trash123.thread.exc02.thread.jasonxiii;

public class Launcher {
	public Launcher() {
		ThreadFromInterface tfi = new ThreadFromInterface();
		ThreadFromClass tfc = new ThreadFromClass();
		Thread threadForInterface = new Thread(tfi);

		System.out.println("--------------");
		tfc.start();
		System.out.println("1111111111111");
		threadForInterface.start();
		System.out.println("33333333333333333333");
	}
}