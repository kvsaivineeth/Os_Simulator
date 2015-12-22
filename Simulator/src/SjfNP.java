//import java.util.Scanner;
public class SjfNP {
	public int[] burstTime;
	public int[] waitingTime;
	public int[] arrivaltime;
	public double averageWaitingTime;
	public int ni;
	public double  ave=0;
	public SjfNP(int[] burst_Time,int[] arrival_time)
	{	
		burstTime = new int[burst_Time.length];
	    arrivaltime = new int[arrival_time.length];
	    waitingTime = new int[burst_Time.length];
	    System.out.println("Get the input values of arrivaltime");
		for(int i=0;i<burst_Time.length;i++)
		{
			burstTime[i]=burst_Time[i];
		}
		System.out.println("Get the input values of arrivaltime");
		for(int j=0 ;j<burst_Time.length;j++)
		{
			arrivaltime[j]=arrival_time[j];
		}

	}
	/*public void setValues()
	{
		System.out.println("Get the input values of bursttime");
		//set the valuses for burstTime
		for(int i=0;i<ni;i++)
		{
			Scanner in=new Scanner(System.in);
			burstTime[i]=in.nextInt();
		}
		System.out.println("Get the input values of arrivaltime");
		for(int j=0 ;j<ni;j++)
		{
			Scanner in=new Scanner(System.in);
			arrivaltime[j]=in.nextInt();
		}

	}*/

	public double averageWaitingTimeCalc()
	{     
		int sum=0,b=0;
		double a=0.0;
		waitingTime[0]=0;
		for(int i=1;i<burstTime.length;i++)
		{
			bubble_srt(burstTime);
			waitingTime[i]=burstTime[i-1];
			sum=sum+waitingTime[i];
			b=sum-arrivaltime[i];
			a=a+b;
		}	
		ave=a/burstTime.length;
		System.out.println("Calculating Average Waiting Time    "+ave);
		return ave;
	}
	public void bubble_srt(int[] burstTime) 
	{
		int k,x=0;
		for(int j=0;j<burstTime.length;j++)
		{
			if(arrivaltime[j]!=0)
			{
				x=1;
				break;
			}
			else
			{
				x=0;
			}
		}
		for (int m = ni; m >= x; m--) 
		{
			for (int i = x; i < burstTime.length - 1; i++) 
			{
				k = i + 1;
				if (burstTime[i] > burstTime[k]) 
				{
					int temp,t;
					temp = burstTime[i];
					t=arrivaltime[i];
					burstTime[i] = burstTime[k];
					arrivaltime[i]=arrivaltime[k];
					burstTime[k] = temp;
					arrivaltime[k]=t;
				}
			}
		}
	}


	
}

