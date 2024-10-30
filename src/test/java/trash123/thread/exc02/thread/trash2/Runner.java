package trash123.thread.exc02.thread.trash2;

public class Runner {
  	public static void main(String[] args) {
  		MyRun[] notRunners = new MyRun[10];
  
  		for(int i=0; i<10; i++) {
  			notRunners[i] = new MyRun(i);
  		}
  
  		for(int i=0; i<10; i++) {
  			notRunners[i].run();
  		}
  	}
  }