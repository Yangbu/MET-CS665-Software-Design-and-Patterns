package wuYang5;

/**
 *Job.java
 */
public class Job implements Data{
	//Job status
	public enum statusEnum {
		running, complete, failed
	};
	private statusEnum status = statusEnum.complete;
	private String id = null;
	private String name = null;
	//in order to be easy to test, here we set integer, not the actual time
	private int startTime = 0;
	private int CPURequirement = 0;
	private int MemoryRequirement = 0;
	private String command = null;
	//Job constructor
	public Job(String id, String name, int startTime, int CPURequirement,
			int MemoryRequirement, String command){
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.CPURequirement = CPURequirement;
		this.MemoryRequirement = MemoryRequirement;
		this.command = command;
	}
	// get job attributes
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getCPURequirement() {
		return CPURequirement;
	}

	public int getMemoryRequirement() {
		return MemoryRequirement;
	}
	
	public String getCommand(){
		return command;
	}
	public statusEnum getStatus(){
		return status;
	}
	public void setStatus(statusEnum status){
		this.status = status;
	}

	/*
	 * get data from database
	 */
	@Override
	public void getData() {
		System.out.println("the job has got the right data from databse.");
	}
}
