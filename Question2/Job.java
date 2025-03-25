public class Job{

    static private int idCount = 1; 

    private int id; 
    int arrivalTime;
    int burstTime;

    Job(int arrivalTime,int burstTime){
        this.id = idCount++; 
        this.arrivalTime = arrivalTime; 
        this.burstTime = burstTime; 
    }

    public int getID(){
        return this.id; 
    }
}