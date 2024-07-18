package model;

public class Toy {

    private int idToy;
    private String nameToy;
    private int dropoutRateToy;

    public Toy(int idToy, int dropoutRateToy, String nameToy){
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.dropoutRateToy = dropoutRateToy;
    }

    public int getDropoutRateToy() {
        return dropoutRateToy;
    }

    @Override
    public String toString() {
        return "Игушка №" + idToy + " " + nameToy;
    }
}
