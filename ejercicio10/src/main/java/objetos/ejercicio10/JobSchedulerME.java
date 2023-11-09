package objetos.ejercicio10;

public class JobSchedulerME extends JobScheduler{
    public JobDescription next() {
        JobDescription nextJob = null;
        if (!jobs.isEmpty()) {
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                this.unschedule(nextJob);
        }
        return nextJob;
    }

}
