package structure.dtos.Task;

import java.util.Date;

public class TaskDto {
    private long id;
    private String description;
    private Date date;
    private boolean isDone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getStatus() {
        return isDone;
    }

    public void setStatus(boolean isDone) {
        this.isDone = isDone;
    }


    @Override
    public String toString() {
        return "TaskDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", Status=" + isDone +
        '}';
    }
}
