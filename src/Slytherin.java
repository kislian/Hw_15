//Слизерин
public class Slytherin extends Hogwarts{
    //сила хитрости
    private int powerCunning;
    //сила решительности
    private int powerResolution;
    //сила амбициозности
    private int powerAmbition;

    public Slytherin(int powerMagic, int transgressDistance, String pupil, int powerCunning, int powerResolution, int powerAmbition) {
        super(powerMagic, transgressDistance, pupil);
        this.powerCunning = powerCunning;
        this.powerResolution = powerResolution;
        this.powerAmbition = powerAmbition;
    }

    public int getPowerCunning() {
        return powerCunning;
    }


    public int getPowerResolution() {
        return powerResolution;
    }
    public static int calcull(Slytherin magic){
        return magic.powerCunning +magic.powerResolution+magic.powerAmbition;
    }
    static void compare(Slytherin student1,Slytherin student2){
        int sum1=calcull(student1)  ;
        int sum2=calcull(student2);
        if (sum1>sum2){
            System.out.println(student1+ " лучший Слизеринец чем "+ student2 );
        } else if (sum2 > sum1) {
            System.out.println(student2+ " лучший Слизеринец чем "+ student1 );
        } else {
            System.out.println( student1+ " одинаковые по силе  в Слизерине с "+ student2);
        }
    }

    public int getPowerAmbition() {
        return powerAmbition;
    }
    void printContent(Slytherin slytherin){
        System.out.println(slytherin);
    }
    @Override
    public String toString() {
        return "Slytherin{" +super.toString()+
                "powerCunning=" + powerCunning +
                ", powerResolution=" + powerResolution +
                ", powerAmbition=" + powerAmbition +
                '}';
    }
}
