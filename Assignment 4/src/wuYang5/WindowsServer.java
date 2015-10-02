package wuYang5;
/**
 *WindowsServer.java
 */
public class WindowsServer extends Server{

	public WindowsServer(int cpu, int memory, String name) {
		super(cpu, memory, name);
	}

	@Override
	public void getJobStatus() {
		System.out.println("Windows");
	}

	@Override
	//To simplify the situation , algorithm just return the CPU
	public int getCpuUsage() {
		System.out.println("Windows server has provided its current cpu usage.");
		return cpu;
	}

	@Override
	//To simplify the situation , algorithm just return the MEMORY
	public int getMemoryUsage() {
		System.out.println("Windows server has provided its current memory usage.");
		return memory;
	}
	
}
