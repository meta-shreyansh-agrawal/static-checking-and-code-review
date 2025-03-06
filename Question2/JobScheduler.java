import java.util.ArrayList; 

public class JobScheduler{
    
    ArrayList<Job> jobs; 

    int arrivalTimeOfFirstJob;
    int averageWaitingTime;
    int maxWaitingTime; 
    
    JobScheduler(ArrayList<Job> jobs){
        this.jobs = jobs; 

        // Sorting jobs based on arrival time
        jobs.sort((a,b)->a.arrivalTime.compareTo(b.arrivalTime)); 
        
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

    int getCompletionTime(Job job){
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int completionTime = time - this.arrivalTimeOfFirstJob; 
            if(currJob == job){
                return completionTime; 
            }             
        }
        return -1; 
    }

    int getTurnAroundTime(Job job){
         for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int turnAroundTime = time - currJob.arrivalTime; 
            if(currJob == job){
                return turnAroundTime; 
            }
        }
        return -1;
    }

    int getWaitingTime(Job job){
        for(int i =0;i<jobs.size();i++){
            Job currJob = jobs.get(i);
            if(time<currJob.arrivalTime){
                time = currJob.arrivalTime; 
            }
            time += currJob.burstTime;
            int waitingTime = time - currJob.arrivalTime - currJob.burstTime; 
            if(currJob == job){
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




//TODO: getter,setter