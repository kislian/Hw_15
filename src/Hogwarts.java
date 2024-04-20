public class Hogwarts {
    protected int powerMagic;
    protected int transgressDistance;
    protected String pupil;

    public Hogwarts(int powerMagic, int transgressDistance, String pupil) {
        this.powerMagic = powerMagic;
        this.transgressDistance = transgressDistance;
        this.pupil = pupil;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public String getPupil() {
        return pupil;
    }

    public void setPupil(String pupil) {
        this.pupil = pupil;
    }

    public int calcullBase() {
        return powerMagic + transgressDistance;
    }

    public void compareTotal(Hogwarts hogwarts) {
        int sum1 = calcullBase();
        int sum2 = hogwarts.calcullBase();
        if (sum1 > sum2) {
            System.out.println(pupil + " обладает большой магией, чем " + hogwarts.getPupil());
        } else if (sum2 > sum1) {
            System.out.println(hogwarts.getPupil() + " обладает большой магией, чем " + pupil);
        } else {
            System.out.println(hogwarts.getPupil() + " одинаковой по силе  магией, с" + pupil);
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerMagic=" + powerMagic +
                ", transgressDistance=" + transgressDistance +
                ", pupil='" + pupil + '\'' +
                '}';
    }
}

