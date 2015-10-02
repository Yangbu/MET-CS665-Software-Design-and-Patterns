package wuYang5;
/**
 *SolarisServer.java
 */
public class SolarisServer extends Server{

	public SolarisServer(int cpu, int memory, String name) {
		super(cpu, memory, name);
	}

	@Override
	public void getJobStatus() {
		System.out.println("Solaris");
	}

	@Override
	//To simplify the situation , algorithm just return the CPU
	public int getCpuUsage() {
		System.out.println("Solaris server has provided its current cpu usage.");
		return cpu;
	}

	@Override
	//To simplify the situation , algorithm just return the MEMORY
	public int getMemoryUsage() {
		System.out.println("Solaris server has provided its current memory usage.");
		return memory;
	}


}
