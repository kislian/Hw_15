public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(70, 60, "Гарри Поттер", 50, 40, 50);
        Gryffindor hermioneGranger = new Gryffindor(100, 100, "Гермиона Грейнджер", 100, 45, 35);
        Gryffindor ronWeasley = new Gryffindor(65, 64, "Рон Уизли", 45, 45, 55);
        Hufflepuff zachariahSmith = new Hufflepuff(65, 55, "Захария Смит", 55, 45, 55);
        Hufflepuff cedricDiggory = new Hufflepuff(45, 40, "Седрик Диггори", 45, 40, 30);
        Hufflepuff justinFinchFletchley = new Hufflepuff(45, 60, "Джастин Финч-Флетчли", 35, 40, 50);
        Ravenclaw zhouChangs = new Ravenclaw(60, 50, "Чжоу Чанг", 50, 50, 50, 40);
        Ravenclaw padmaPatil = new Ravenclaw(40, 45, "Падма Патил", 40, 45, 35, 50);
        Ravenclaw marcusBelby = new Ravenclaw(50, 55, "Маркус Белби", 30, 45, 40, 40);
        Slytherin dracoMalfoy = new Slytherin(65, 55, "Драко Малфой", 55, 45, 55);
        Slytherin grahamMontague = new Slytherin(45, 40, "Грэхэм Монтегю", 45, 40, 30);
        Slytherin gregoryGoyle = new Slytherin(45, 60, "Грегори Гойл", 35, 40, 50);
        harryPotter.printContent();
        //вариант 2  начало если считать to_String за метод
        System.out.println("Варинат 2  begin");
        System.out.println(harryPotter);
        System.out.println("Варинат 2  end");
        //окончание
        zachariahSmith.printContent();
        zhouChangs.printContent();
        dracoMalfoy.printContent();
        Gryffindor.compare(harryPotter, hermioneGranger);
        Hufflepuff.compare(zachariahSmith, cedricDiggory);
        Ravenclaw.compare(zhouChangs, padmaPatil);
        Slytherin.compare(dracoMalfoy, grahamMontague);
        ronWeasley.compareTotal(dracoMalfoy);
        };




    }

