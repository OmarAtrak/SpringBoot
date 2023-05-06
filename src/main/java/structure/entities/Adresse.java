package structure.entities;

public class Adresse {
    private String rue;
    private String avenue;
    private String number;


    public String getRue() {
        return this.rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAvenue() {
        return this.avenue;
    }
    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", avenue='" + avenue + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
