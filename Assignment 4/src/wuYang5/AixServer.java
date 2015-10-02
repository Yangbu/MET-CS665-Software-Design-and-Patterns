package wuYang5;
/**
 *AixServer.java
 */
public class AixServer extends Server{

	public AixServer(int cpu, int memory, String name) {
		super(cpu, memory, name);
	}

	@Override
	public void getJobStatus() {
		System.out.println("Aix");
	}

	@Override
	//To simplify the situation , algorithm just return the CPU
	public int getCpuUsage() {
		System.out.println("Aix server has provided its current cpu usage.");
		return cpu;
	}

	@Override
	//To simplify the situation , algorithm just return the MEMORY
	public int getMemoryUsage() {
		System.out.println("Aix server has provided its current memory usage.");
		return memory;
	}

}
