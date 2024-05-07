package kodlama.io.rentACar.entities.concretes;

public class Brand {
    private int id;
    private String names;

    public Brand() {
    }

    public Brand(int id, String names) {
        this.id = id;
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
