public class SchoolTask extends Task{
    private String courseName;
    private Date dueDate;
    private String SubmissionStatus;
    private float progress;

    SchoolTask(String title, String courseName, String description, String category, Date dueDate){
        super(title, description, category);
        this.courseName = courseName;
        this.dueDate = dueDate;
    }
    public void submit(){

    }

    @Override
    public void getDetails(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        courseName = courseName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubmissionStatus() {
        return SubmissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        SubmissionStatus = submissionStatus;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }
}
