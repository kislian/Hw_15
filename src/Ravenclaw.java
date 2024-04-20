//Когтевран
public class Ravenclaw extends Hogwarts {
    //сила ума
    private int powerMind;
    //сила мудрости
    private int powerWisdom;
    //сила остроумия
    private int powerWit;
    //сила творчества
    private int powerCreativity;

    public Ravenclaw(int powerMagic, int transgressDistance, String pupil, int powerMind, int powerWisdom, int powerWit, int powerCreativity) {
        super(powerMagic, transgressDistance, pupil);
        this.powerMind = powerMind;
        this.powerWisdom = powerWisdom;
        this.powerWit = powerWit;
        this.powerCreativity = powerCreativity;
    }

    public int getPowerMind() {
        return powerMind;
    }

    public void setPowerMind(int powerMind) {
        this.powerMind = powerMind;
    }

    public int getPowerWisdom() {
        return powerWisdom;
    }

    public void setPowerWisdom(int powerWisdom) {
        this.powerWisdom = powerWisdom;
    }

    public int getPowerWit() {
        return powerWit;
    }

    void printContent() {
        System.out.println(toString());
    }

    public static int calcull(Ravenclaw magic) {
        return magic.powerMind + magic.powerWisdom + magic.powerWit + magic.powerCreativity;
    }

    static void compare(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = calcull(student1);
        int sum2 = calcull(student2);
        if (sum1 > sum2) {
            System.out.println(student1 + " лучший Когтевранец чем " + student2);
        } else if (sum2 > sum1) {
            System.out.println(student2 + " лучший Когтевранец чем " + student1);
        } else {
            System.out.println(student1 + " одинаковые  по силе с " + student2);
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() +
                "powerMind=" + powerMind +
                ", powerWisdom=" + powerWisdom +
                ", powerWit=" + powerWit +
                ", powerCreativity=" + powerCreativity +
                '}';
    }
}
