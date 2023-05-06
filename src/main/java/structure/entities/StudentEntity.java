package structure.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)    // TABLE = HIBERNATE_SEQUENCE (GERRER LES ID)
    @Column(name = "id_student")
//    private StudentID studentId;
//    private StudentID studentId;
        private long id;

    @Column(name = "student_name")
    private String name;

    @Embedded
    @Column(name = "adresse_student")
    private Adresse adresse;

    @ManyToMany
    private List<CourseEntity> courses;

    public long getId() {
        return this.id;
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

    public Adresse getAdresse(){
        return this.adresse;
    }
    public void setAdresse(Adresse adresse){
        this.adresse = adresse;
    }

    public List<CourseEntity> getCourses(){
        return this.courses;
    }
    public void setCourses(List<CourseEntity> courses){
        this.courses = courses;
    }


}
