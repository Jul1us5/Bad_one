
/**
 *
 * @author Julius
 */
public class Car_Races {

    public static void main(String[] args) {

        Car[] cars = {
            new Car("Audi", 200),
            new Car("Bmw", 200),
            new Car("Ferrai", 200),
            new Car("Skoda", 200),
            new Car("Toyota", 200)
        };

        do {
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                if (Math.random() < 0.30) {
                    car.deceleration((int) (Math.random() * 4));
                } else {
                    car.acceleration((int) (Math.random() * 6));
                }
                car.start();
            }
            System.out.println("---------");
            for (int i = 0; i < cars.length; i++) {
                Car car = cars[i];
                System.out.println(car.getName() + " " + car.getSpeed() + " " + car.getDistance());
            }
            arraySort(cars);

        } while (cars[0].getDistance() <= 300);
        System.out.println("WIN WIN: " + cars[0].getName());
    }

    public static void arraySort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getDistance() < cars[j].getDistance()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }

            }

        }
    }

}
