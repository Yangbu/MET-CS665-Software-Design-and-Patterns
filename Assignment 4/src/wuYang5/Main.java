package wuYang5;

import java.util.ArrayList;

/**
 *Main.java
 */
public class Main {

	public static void main(String[] args) {
		Job job1 = new Job("1", "job1", 5, 46, 20, "command1");
		Job job2 = new Job("2", "job2", 10, 20, 46, "command2");
		Job job3 = new Job("3", "job3", 15, 10, 10, "command3");
		ArrayList<Job> jobs = new ArrayList<>();
		jobs.add(job1);
		jobs.add(job2);
		jobs.add(job3);
		Scheduler scheduler = new Scheduler(jobs);
		Thread thread = new Thread(scheduler);
		thread.start();
	}
}
