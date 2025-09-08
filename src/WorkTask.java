public class WorkTask extends Task implements Prioritization{
    private Assignee assignee;
    private int priority;

    WorkTask(String title, Assignee assignee, String description, String category, int priority){
    super(title, description, category);
    this.assignee = assignee;
    this.priority = priority;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        assignee.getDetails();
        System.out.println("Description: " + this.description);
    }

    @Override
    public String calculatePriority(int num) {
        return switch (num) {
            case 1, 2, 3 -> "LOW priority";
            case 4, 5, 6 -> "MEDIUM priority";
            case 7, 8, 9, 10 -> "HIGH priority";
            default -> "Invalid number, must be between 1-10";
        };
    }
}
