package model;

import java.util.List;

public class Toy {

    private int idToy;
    private String nameToy;
    private int dropoutRateToy;

    public Toy(int idToy, int dropoutRateToy, String nameToy){
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.dropoutRateToy = dropoutRateToy;
    }

    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getDropoutRateToy() {
        return dropoutRateToy;
    }

    @Override
    public String toString() {
        return "Игушка №" + idToy + " " + nameToy + " " + dropoutRateToy;
    }
}
