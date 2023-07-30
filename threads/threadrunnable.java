/* Implementing thread pool  using runnable interface. */

import java.util.concurrent.*;
class MyThread implements Runnable{
	int num;
	MyThread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+" Start Thread:" +num);
		dailyTask();
		System.out.println(Thread.currentThread()+" End Thread:" +num);
	}

	void dailyTask(){
		try{
			Thread.sleep(15000);
		}catch(InterruptedException ie){
		}
	}
}

class ThreadPoolDemo{
	public static void main(String[] args){
		ExecutorService ser = Executors.newFixedThreadPool(5);

		for(int i=1;i<=6;i++){
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}

