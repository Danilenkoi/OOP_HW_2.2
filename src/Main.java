import transport.Car;
public class Main {
    public static void main(String[] args) {

        Car car [] = new Car [5];

        car [0] = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "МКП", "sedan", "а111аа77", 4);
        car [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "АКП", "sedan", "А222АА77", 5);
        car [2] = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "АКП", "coupe", "A333AA77", 2);
        car [3] = new Car("KIA", "Sportage 4-го поколения", 2.4, "red", 2018, "South Korea", "АКП", "jeep", "А444АА77", 5);
        car [4] = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "МКП", "sedan", "А555АА77", 4);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
            System.out.println("\t " + car[i].changeTires(0) + "\n");
        }
    }
}
