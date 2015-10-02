package wuYang5;

import java.util.ArrayList;
import java.util.List;

import wuYang5.Job.statusEnum;

/**
 *Scheduler.java
 */
public class Scheduler implements Runnable{

	private List<Server> servers = new ArrayList<Server>();
	private List<Job> jobs = new ArrayList<Job>();
	//in order to be easy to test, here we set integer
	private int nowTime = 0;
	public Scheduler(List<Job> jobs){
		//set servers
		addServer();
		this.jobs = jobs;
	}
	
	/*
	 * 0-23 represents a day
	 * check the start time of job
	 */
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				nowTime++;
				if (nowTime % 24 == 0){
					nowTime = 0;
				}
				System.out.println(nowTime);
				for (Job job : jobs) {
					if (isTimeToWork(job.getStartTime(), job)){//time to run
						runJobOnServer(job);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/*TODO
	 * Determining which server in the group has sufficient capacity to 
	 * run the job, based on the server current resource usage, and the
	 *  job CPU, memory requirement
	 */
	public void runJobOnServer(Job job){
		for (Server server : servers) {
			if (job.getStatus() != statusEnum.running) {
				if (server.getCpuUsage() < job.getCPURequirement()){
					System.out.println("Server " + server.getName() + " cpu is not enough.");
				}else if (server.getMemoryUsage() < job.getMemoryRequirement()){//enough resource
					System.out.println("Server " + server.getName() + " memory is not enough.");
				}else{
					System.out.println("**************************************");
					System.out.println("Server " + server.getName() + " is capable to run the job!");
					//login
					server.addJob(job);
					server.login(job);
					//run
					runJob(job, server);
					//update UI the job status
					updateJobStatus(job);
					return;
				}
			}
		}
	}
	/*
	 * run the job on the server
	 */
	public void runJob(Job job, Server server){
		//set status
		job.setStatus(statusEnum.running);
		job.getData();
		System.out.println("Job " + job.getName() + " is running " + job.getCommand() + " on the server "
				+ server.getName());
	}
	/*
	 * check if it is time to work
	 */
	public boolean isTimeToWork(int startTime, Job job){
		if (nowTime == startTime) {
			System.out.println("It's time for " + job.getName() + " to work.");
			return true;
		}
		return false;
	}
	/*
	 * add servers to scheduler
	 */
	public void addServer(){
		Server Linux = new LinuxServer(30, 50, "Linux");
		Server Aix = new AixServer(50,30, "Aix");
		Server Solaris = new SolarisServer(45, 45, "Solaris");
		Server Windows = new WindowsServer(20, 10, "Windows");
		servers.add(Windows);
		servers.add(Solaris);
		servers.add(Aix);
		servers.add(Linux);
	}
	
	/*
	 * check job status
	 */
	public statusEnum checkJobStatus(Job job){
		return job.getStatus();
	}
	/*
	 * update UI the job status
	 */
	public void updateJobStatus(Job job){
		 System.out.println("UI: job status of " + job.getName() + " is: " + checkJobStatus(job).toString());
	}
}
