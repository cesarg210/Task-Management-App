public class SchoolTask extends Task{
    String CourseName;
    Date dueDate;
    String SubmissionStatus;
    float progress;

    SchoolTask(String title, String CourseName, String description, Date dueDate){

    }
    public void submit(){

    }

    @Override
    public String getDetails(){

    }

    @Override
    public void updateStatus(){

    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
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
