package lv.acodemy.classroom;

public class Cond {
    public static void main(String[] args) {
        if(1<2) {
            System.out.println("yes 1<2");
        }

        if(18<1){
            System.out.println("Hello");
        }

        boolean isNikitaToxic = false;
        if (isNikitaToxic) {
            System.out.println("Spank him!");
        }

        String myCity = "Riga";
        if(myCity.equals("Riga")) {
            System.out.println("yes is Riga");
        }

        if(myCity.contains("rga")) {
            System.out.println("Yes is Riga");

        }

        String name = "Johny";
        if(name.equals("Nikita")) {
            System.out.println(name + "is not Nikita");
        }

        int age = 20;
        if (age < 18) {
            System.out.println("Prihodi poze");
        } else {
            System.out.println("Beri i duj ot suda");
        }

        int currentTime = 20;
        if(currentTime <= 11 && currentTime > 6) {
            System.out.println("Podjom Strana!");
        } else if(currentTime > 11 && currentTime < 17) {
            System.out.println("Denj Dobrij!");
        } else {
            System.out.println("Dobrejshij vecerocek!");

        }
    }
}
