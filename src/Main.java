

public class Main {
    public static void main(String[] args){
        Assignee assignee = new Assignee("Cesar", "Gallegos", "Finance");
        WorkTask workTask = new WorkTask("calculate sales", assignee, "put together a bill of sale for the client", "Contracts", 6);
        workTask.getDetails();
        workTask.toggleComplete();
        System.out.println(workTask.getStatus());
    }
}
