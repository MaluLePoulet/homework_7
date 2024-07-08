package Person;

public interface JobTitleProvider {

     default void getJobTitle() {
          System.out.println("Job title: " + getClass().getSimpleName());
     }
}