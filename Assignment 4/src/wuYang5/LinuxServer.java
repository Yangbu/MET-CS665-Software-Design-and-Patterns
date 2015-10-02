package wuYang5;
/**
 *LinuxServer.java
 */
public class LinuxServer extends Server{
	
	public LinuxServer(int cpu, int memory, String name) {
		super(cpu, memory, name);
	}

	@Override
	public void getJobStatus() {
		System.out.println("Linux server gets the job status.");
	}

	@Override
	//To simplify the situation , algorithm just return the CPU
	public int getCpuUsage() {
		System.out.println("Linux server has provided its current cpu usage.");
		return cpu;
	}

	@Override
	//To simplify the situation , algorithm just return the MEMORY
	public int getMemoryUsage() {
		System.out.println("Linux server has provided its current memory usage.");
		return memory;
	}
	
	
}
