package com.threadpoolexecutor;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorThread implements Runnable
	{
		private ThreadPoolExecutor executor;
		private int seconds ;
		private boolean run = true;

		public MonitorThread(ThreadPoolExecutor executor , int delay )
		{
			this.executor = executor;
			this.seconds  = delay;
		}
		public void shutdown(){

			this.run=false;

		}

		@Override
		public void run() {
			while(run)
			{
				System.out.println("[Monitor]  ["+this.executor.getPoolSize()+"/"+this.executor.getCorePoolSize()+"] "
						+ "Active: "+this.executor.getActiveCount()+" Completed: "+this.executor.getCompletedTaskCount()+
						" Task: "+this.executor.getTaskCount()+" isShutdown: "+this.executor.isShutdown()+
						" isTerminated: "+this.executor.isTerminated()+"");

				try {
					Thread.sleep(seconds*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}