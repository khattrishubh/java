
class ElectricityBill
{
    int consumerNo;
    String consumerName;
    int prevReading, currReading;
    String connectionType;

    ElectricityBill(int consumerNo, String consumerName)
    {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
    }
    ElectricityBill(int consumerNo, String consumerName, int prevReading, int currReading, String connectionType)
    {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevReading = prevReading;
        this.currReading = currReading;
        this.connectionType = connectionType;
    }
    void displayBill() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + prevReading);
        System.out.println("Current Reading: " + currReading);
        System.out.println("Connection Type: " + connectionType);
    }
}

public class Lab5Q1 {
    public static void main(String[] args) {
        ElectricityBill b1 = new ElectricityBill(101, "Shubh");
        ElectricityBill b2 = new ElectricityBill(102, "Ravi", 1200, 1300, "domestic");
        ElectricityBill b3 = new ElectricityBill(103, "Amit", 2000, 2200, "commercial");
        b1.displayBill();
        b2.displayBill();
        b3.displayBill();
    }
}
