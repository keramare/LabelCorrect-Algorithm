import java.util.ArrayList;

public class Vrchol {
    private final int cisloVrcholu;
    private Vrchol predposlednyVrchol;
    private int zatedyNajlepsiaCena;
    public Vrchol(int cisloVrcholu) {
        this.cisloVrcholu = cisloVrcholu;
    }

    public void vypis() {
        if(this.predposlednyVrchol != null) {
            System.out.format("\n %d : predposlednyVrchol-%d : CENA %d \n", this.cisloVrcholu, this.predposlednyVrchol.getCisloVrcholu(), this.zatedyNajlepsiaCena);} else {
            System.out.format("\n %d : predposlednyVrchol-nie je : CENA %d \n", this.cisloVrcholu, this.zatedyNajlepsiaCena); }
    }

    public void setZatedyNajlepsiaCena(int zatedyNajlepsiaCena) {
        this.zatedyNajlepsiaCena = zatedyNajlepsiaCena;
    }

    public void setPredposlednyVrchol(Vrchol predposlednyVrchol) {
        this.predposlednyVrchol = predposlednyVrchol;
    }

    public int getCisloVrcholu() {
        return cisloVrcholu;
    }

    public int getZatedyNajlepsiaCena() {
        return zatedyNajlepsiaCena;
    }

    public Vrchol getPredposlednyVrchol() {
        return predposlednyVrchol;
    }
}
