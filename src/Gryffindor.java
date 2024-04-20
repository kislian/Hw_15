//Гриффиндор
public class Gryffindor extends Hogwarts{
    //сила благородства
    private int powerGegnerosity;
    //сила чести
    private  int powerHonour;
    //сила храбрости
    private int  powerCourage;

    //конструктор
    public Gryffindor(int powerMagic, int transgressDistance, String pupil, int powerGegnerosity, int powerHonour, int powerCourage) {
        super(powerMagic, transgressDistance, pupil);
        this.powerGegnerosity = powerGegnerosity;
        this.powerHonour = powerHonour;
        this.powerCourage = powerCourage;
    }

    @Override
        public String toString() {

        return "Gryffindor{" + super.toString()+
                "powerGegnerosity=" + powerGegnerosity +
                ", powerHonour=" + powerHonour +
                ", powerCourage=" + powerCourage +
                '}';
    }
    public static int calcull(Gryffindor magic){
        return magic.getPowerGegnerosity()+magic.powerHonour+magic.powerCourage;
    }
    void  printContent(Gryffindor gryffindor){
        System.out.println(gryffindor);
    };
    static void compare(Gryffindor student1,Gryffindor student2){
     int sum1=calcull(student1)  ;
        int sum2=calcull(student2);
        if (sum1>sum2){
            System.out.println(student1.getPupil()+" лучший Гриффиндоровец чем "+ student2.getPupil() );
        } else if (sum2 > sum1) {
            System.out.println(student2.getPupil()+" лучший Гриффиндоровец чем "+ student2.getPupil() );
        } else {
            System.out.println(student1 + " оджинаковые по силе с"+ student2 +" в Гриффиндорде  " );
        }
    }

    public int getPowerGegnerosity() {
        return powerGegnerosity;
    }

    public int getPowerHonour() {
        return powerHonour;
    }

    public int getPowerCourage() {
        return powerCourage;
    }


}
