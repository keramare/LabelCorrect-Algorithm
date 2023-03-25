public class Hrana {
    private final int zaciatocnyVrchol;
    private final int koncovyVrchol;
    private final int cena;

    public Hrana(int zaciatocnyVrchol, int koncovyVrchol, int cena) {
        this.zaciatocnyVrchol = zaciatocnyVrchol;
        this.koncovyVrchol = koncovyVrchol;
        this.cena = cena;
    }

    public void vypis() {
            System.out.format("Hrana (%d , %d) : %d \n ", this.zaciatocnyVrchol, this.koncovyVrchol, this.cena);
        }

    public int getCena() { return cena; }

    public int getZaciatocnyVrchol() { return zaciatocnyVrchol; }

    public int getKoncovyVrchol() {
        return koncovyVrchol;
    }

}
