//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.model ="Audi";
        audi.speed = 10;
        audi.increasedSpeed(10);
        audi.printSpeed();



        Car bmw = new Car();
        bmw.model ="BMW";
        bmw.speed = 20;
        bmw.increasedSpeed(20);
        bmw.increasedSpeed(25);
        bmw.increasedSpeed(50);
        bmw.increasedSpeed(60);
        bmw.printSpeed();




        Car mercedes = new Car();
        mercedes.model ="Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();
    }
}