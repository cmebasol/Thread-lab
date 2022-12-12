import java.util.ArrayList;
import java.util.Queue;

public class CarQueue {

	ArrayList <Integer> list=new ArrayList();
	
	public CarQueue () {
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(1);
	}
	
	public  void addToQueue() {
		
		class CarThread implements Runnable{

			@Override
			public void run() {
				try {
					for (int i = 0; i < 5; i++) {
						list.add(3);
						list.add(2);
						list.add(1);
						list.add(0);
						list.add(3);
						list.add(2);
						list.add(1);
						list.add(0);
					}
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
		CarThread myThread  = new CarThread();
		Thread newThread = new Thread(myThread);
		newThread.start();
		
		
	}
	public int deleteQueue() {
		return list.remove(0);
		
	}
	
}