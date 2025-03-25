import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.Collections; 

public class JobScheduler{
    
    ArrayList<Job> jobs; 

    int arrivalTimeOfFirstJob;
    int averageWaitingTime;
    int maxWaitingTime;
    
    JobScheduler(ArrayList<Job> jobs){
        this.jobs = jobs; 

        // Sorting jobs based on arrival time
        Collections.sort(jobs, new Comparator<Job>() { 
            @Override 
            public int compare(Job o1, Job o2) { 
                return Integer.compare(o1.arrivalTime, o2.arrivalTime); 
            } 
        });         

        // Get the value of arrivalTimeOfFirstJob
        this.arrivalTimeOfFirstJob = jobs.get(0).arrivalTime; 

        this.maxWaitingTime = 0;
        this.averageWaitingTime = 0; 

        //Get end time of each job
        int time = arrivalTimeOfFirstJob;
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int waitingTime = time - currJob.arrivalTime - currJob.burstTime; 
            this.maxWaitingTime = Math.max(this.maxWaitingTime,waitingTime); 
            this.averageWaitingTime = (this.averageWaitingTime*i + waitingTime)/(i+1); 
        }
    }

    int getCompletionTime(int id){
        int time = 0; 
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int completionTime = time - this.arrivalTimeOfFirstJob; 
            if(currJob.getID() == id){
                return completionTime; 
            }             
        }
        return -1; 
    }

    int getTurnAroundTime(int id){
        int time = 0; 
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int turnAroundTime = time - currJob.arrivalTime; 
            if(currJob.getID() == id){
                return turnAroundTime; 
            }
        }
        return -1;
    }

    int getWaitingTime(int id){
        int time = 0; 
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int waitingTime = time - currJob.arrivalTime - currJob.burstTime; 
            if(currJob.getID() == id){
                return waitingTime; 
            }
        }
        return -1; 

    }

    int getAverageWaitingTime(){
        return this.averageWaitingTime;
    }

    int getMaxWaitingTime(){
        return this.maxWaitingTime; 
    }


}


// completeing time = endTimeofJOb - arivaltimeoffirstJob

// turnAroundTime = endTimeOfJob - arrivalTimeOfJob

// waiting time =  turnAroundTime - burstTime

// average waiting time of processes

// Max waiting time among all processes