package objetos.ejercicio10;

public class JobSchedulerLIFO extends JobScheduler{
    public JobDescription next() {
        JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
        	nextJob = jobs.get(jobs.size()-1);
            this.unschedule(nextJob);
        }
        return nextJob;
    }

}
