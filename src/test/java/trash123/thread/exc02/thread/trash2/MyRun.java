package trash123.thread.exc02.thread.trash2;

public class MyRun {
  
  	private int id;
  
  	public MyRun(int id) {
  		this.id = id;
  	}
  
  	public void run() {
  		while(true) {
  			System.out.println("NieWatek "+id);
  			try {
  				//usypiamy wątek na 100 milisekund
  				Thread.sleep(100);
  			} catch (InterruptedException e) {
  				e.printStackTrace();
  			}
  		}
  	}
  }