/**
 *
 * @author Julius
 */
public class Car {
    
    private String name;
    private int start;
    private int speed;
    private int maxSpeed;
    private int distance;
    
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.start = 0;
        this.maxSpeed = 0;
        this.distance = 0;
    }
    
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getDistance() {
        return distance;
    }
    
    public void acceleration(int kiek) {
        this.speed += kiek;
        if(this.speed > this.maxSpeed) {
           this.speed = this.maxSpeed; 
        }
    }
    public void deceleration(int kiek) {
        this.speed -= kiek;
        if(this.speed < 0) {
           this.speed = 0;
        } 
    }
    public void start() {
        this.distance += this.speed;
    } 
}
