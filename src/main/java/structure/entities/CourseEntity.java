package structure.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "T_list_courses")
    private List<StudentEntity> students;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }
    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }


}
