package structure.entities.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_Task")
public class TaskEntity {
    @Id
    @Column(name = "id_task")
    private long id;
    @Column(name = "description_task")
    private String description;
    @Column(name = "date_task")
    private Date date;
    @Column(name = "isDone_task")
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
}
