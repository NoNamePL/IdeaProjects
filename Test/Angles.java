// Демонстрация работы toDegrees() и toRadians()

class Angles {
    public static void main(String[] args){
        double theta = 120.0;

        System.out.println(theta + " градусов равно " + Math.toRadians(theta) + " радиант");

        theta = 1.312;
        System.out.println(theta + " радиан равно " + Math.toDegrees(theta) + " градусов.");
    }
}