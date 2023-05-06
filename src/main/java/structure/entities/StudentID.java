package structure.entities;

public class StudentID {
    private Long id;
    private String code;
    private String alias;

    public StudentID(Long id, String code, String alias) {
        this.id = id;
        this.code = code;
        this.alias = alias;
    }

    public StudentID() {
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAlias() {
        return this.alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }


    @Override
    public String toString() {
        return "StudentId{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
