public class PersonalTask extends Task{
    private String notes;
    private boolean isRecurring;
    private String location;
    private Date reminder;

    public PersonalTask(String title, String description, String category,
                        String notes, boolean isRecurring, String location, Date reminder) {
        super(title, description, category);
        this.notes = notes;
        this.isRecurring = isRecurring;
        this.location = location;
        this.reminder = reminder;
    }

    @Override
    public void getDetails(){
        super.getDetails();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }
}
