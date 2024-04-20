//Пуффедуй
public class Hufflepuff extends Hogwarts {
    // сила трудолюбия
    private int powerDiligence;
    //сила верности
    private int powerLoyalty;
    //сила чесности
    private int powerHonesty;

    public Hufflepuff(int powerMagic, int transgressDistance, String pupil, int powerDiligence, int powerLoyalty, int powerHonesty) {
        super(powerMagic, transgressDistance, pupil);
        this.powerDiligence = powerDiligence;
        this.powerLoyalty = powerLoyalty;
        this.powerHonesty = powerHonesty;
    }

    public int getPowerDiligence() {
        return powerDiligence;
    }

    public void setPowerDiligence(int powerDiligence) {
        this.powerDiligence = powerDiligence;
    }

    public int getPowerLoyalty() {
        return powerLoyalty;
    }

    public void setPowerLoyalty(int powerLoyalty) {
        this.powerLoyalty = powerLoyalty;
    }

    public int getPowerHonesty() {
        return powerHonesty;
    }

    public static int calcull(Hufflepuff magic) {
        return magic.powerDiligence + magic.powerLoyalty + magic.powerHonesty;
    }

    public void setPowerHonesty(int powerHonesty) {
        this.powerHonesty = powerHonesty;
    }

    static void compare(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = calcull(student1);
        int sum2 = calcull(student2);
        if (sum1 > sum2) {
            System.out.println(student1 + " лучший Пуффендуец чем " + student2);
        } else if (sum2 > sum1) {
            System.out.println(student2 + " лучший Пуффендуец чем " + student1);
        } else {
            System.out.println(student1 + " оджинаковые в Пуффендуее по силе с " + student2);
        }
    }

    void printContent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "powerDiligence=" + powerDiligence +
                ", powerLoyalty=" + powerLoyalty +
                ", powerHonesty=" + powerHonesty +
                '}';
    }
}
