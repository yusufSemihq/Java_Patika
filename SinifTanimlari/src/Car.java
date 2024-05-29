 class Car {
    //Nitelikler
    String type;
    String color;
    String model;
    int speed;
    int speedLimiy = 180;

    void increasedSpeed(int increment){
        if ((speed += increment) < speedLimiy) {
            speed += speed + increment;
        }
    }

    void decreaseSpeed(int decrease){
        if (speed > 0){
            speed -= speed - decrease;
        }
    }


    void printSpeed(){
        System.out.println("Hızınız :" +speed);
    }


}
