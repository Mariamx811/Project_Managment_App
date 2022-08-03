package MainPack;

enum status{
    To_do,
    On_going ,
    Done
}
public class Task {

    String title ;
    String description ;
    status status ;
    int deadline;

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Task(String title, String description, MainPack.status status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Task(String title, MainPack.status status) {
        this.title = title;
        this.status = status;
    }

    public Task(String title, String description, MainPack.status status, int deadline) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
    }

    public Task(String title, int deadline) {
        this.title = title;
        this.deadline = deadline;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MainPack.status getStatus() {
        return status;
    }

    public void setStatus(MainPack.status status) {
        this.status = status;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}
