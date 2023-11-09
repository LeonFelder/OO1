package objetos.ejercicio10;

public class JobSchedulerFIFO extends JobScheduler{
    public JobDescription next() {
        JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
        	nextJob = jobs.get(0);
        	this.unschedule(nextJob);
        }
        return nextJob;
    }

}
