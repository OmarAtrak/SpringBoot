package structure.dtos;


import java.util.List;

public class StudentDto {
    private long id;
    private String name;
    private AdresseDto adresseDto;
    private List<CourseDto> courses;

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public AdresseDto getAdresse() {
        return adresseDto;
    }
    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setId(long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setAdresse(AdresseDto adresse) {this.adresseDto = adresse;}
    public void setCourses(List<CourseDto> courses) {this.courses = courses;}

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresse='" + adresseDto + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
}
