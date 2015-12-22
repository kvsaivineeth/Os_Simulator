//package processshed;

public class PFcfs {
	private int[] burstTime;
	private int[] waitingTime;
	private double averageWaitingTime;
	private int n;
	public PFcfs(int[] burst)
	{
		burstTime=new int[burst.length];
		waitingTime=new int[burst.length];
		for(int i=0;i<burst.length;i++){
			burstTime[i]=burst[i];
		}
		this.n = burst.length;  
	}
	public double printWaitingTime()
	{
		//Print Waiting Time
		//System.out.println("Print the Waiting Time");
		double s=0.0;
		for(int i=0;i<this.n;i++)
			s+=waitingTime[i];
		averageWaitingTime=(double)s/(double)this.n;
		return averageWaitingTime;
	}
	public double averageWaitingTimeCalc()
	{
		//implement FCFS
		
		waitingTime[0]=0;
		
		for(int i=1;i<this.n;i++){
			waitingTime[i]=burstTime[i-1]+waitingTime[i-1];
		}
		
		return this.printWaitingTime();
	}
}
