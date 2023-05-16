interface MotorBike{
    double speed1 = 57.3;
    double time1 = 23;
    public void totalDistance();
}
interface Cycle{
    double speed2 = 6.012;
    double time2 = 12.5;
    public void speed();
}
class TwoWheeler implements MotorBike, Cycle{
    double totalDistance;
    double avgSpeed;
    public void totalDistance(){
        totalDistance = (speed1+speed2)*(time1+time2);
        System.out.println("Total distance travelled: " + totalDistance);
    }
    public void speed(){
        avgSpeed = totalDistance/(time1+time2);
        System.out.println("Average speed maintained: " + avgSpeed);
    }
}
class MultipleInheritance{
    public static void main(String args[]){
        TwoWheeler obj = new TwoWheeler();
        obj.totalDistance();
        obj.speed();
    }
}