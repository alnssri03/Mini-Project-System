package Objects;

public class Specialization {
    private String specialization;

    public Specialization() {
    }

    public Specialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "{" +
                " specialization='" + getSpecialization() + "'" +
                "}";
    }

    public  String toCsv() {
        return "-Specialization: " + this.specialization + "\r\n";
    }

    public static Specialization fromCsv(String csv) {
        String[] row = csv.split("-");
        String specialization = row[1].split(": ")[1];

        Specialization s = new Specialization(specialization);
        return s;
    }
}