package wuYang5;

import java.util.ArrayList;

/**
 *Server.java
 */
public abstract class Server {

	//CPU
	protected int cpu = 0;
	//Memory
	protected int memory = 0;
	//name
	private String name = null;
	//save jobs running on the server
	protected ArrayList<Job> jobList = new ArrayList<Job>();
	
	public Server(int cpu, int memory, String name){
		this.cpu = cpu;
		this.memory = memory;
		this.name = name;
	}
	//add job
	public void addJob(Job job){
		if (job != null) {
			jobList.add(job);
		}
		
	}
	//login ( pseudo code )
	public void login(Job job){
		System.out.println("Number " + job.getId() + " " + job.getName() + " has logined in"
				+ " the server " + this.name);
	}
	public String getName(){
		return name;
	}
	//get job status
	public abstract void getJobStatus();
	//get current cpu  usage
	public abstract int getCpuUsage();
	//get current memory usage
	public abstract int getMemoryUsage();
}
