import java.util.ArrayList; 
import java.util.Scanner; 
public class Assignment{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<Job>();
        System.out.print("Enter no. of Jobs: "); 
        int jobCount = Util.inputNaturalNumber(sc); 
        for(int i = 0;i<jobCount;i++){
            System.out.print("Enter arrival time of Job "+(i+1)+": "); 
            int arrivalTime = Util.inputWholeNumber(sc); 
            System.out.print("Enter burst time of Job "+(i+1)+": "); 
            int burstTime = Util.inputNaturalNumber(sc);
            Job newJob = new Job(arrivalTime,burstTime); 
            jobs.add(newJob);
        }
        JobScheduler scheduler = new JobScheduler(jobs); 
        int choice = 1; 
        int no = 0; 
        while(true){
            System.out.println("Enter choice\n1)Get Completion Time\n2)Get Turn Around Time\n3)Get waiting time\n4)Average Waiting Time\n5)Max Waiting Time\n0)Exit");
            choice = Util.inputNumberInRange(sc,0,5); 
            switch(choice){
                case 1:
                    no = printJobsGetNo(scheduler,sc);  
                    System.out.println("Completion time is: "+scheduler.getCompletionTime(no-1));
                    break; 
                case 2:
                    no = printJobsGetNo(scheduler,sc);  
                    System.out.println("Turn Around time is: "+scheduler.getTurnAroundTime(no-1));
                    break; 
                case 3:
                    no = printJobsGetNo(scheduler,sc);  
                    System.out.println("Waiting time is: "+scheduler.getWaitingTime(no-1));
                    break; 
                case 4:
                    System.out.println("Average waiting time is: "+scheduler.getAverageWaitingTime()); 
                    break; 
                case 5:
                    System.out.println("Max waiting time is: "+scheduler.getMaxWaitingTime()); 
                    break; 
                case 0:
                    sc.close(); 
                    return;
                default: 
                    System.out.println("Enter valid no."); 
            }
        }
    }
    public static int printJobsGetNo(JobScheduler scheduler,Scanner sc){
            for(int i = 0;i<scheduler.jobs.size();i++){
                Job j = scheduler.jobs.get(i);
                System.out.println("Job no."+(i+1));
                System.out.println("Arrival Time: "+j.arrivalTime);
                System.out.println("Burst Time: "+j.burstTime);
            }
            System.out.print("Enter Job no to get time: ");
            int no = Util.inputNumberInRange(sc,1,scheduler.jobs.size());
            return no; 
        }

}