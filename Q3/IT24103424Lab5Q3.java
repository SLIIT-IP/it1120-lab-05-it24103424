import java.util.Scanner;

public class IT24103424Lab5Q3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        final double chargersPerDay = 48000;

        System.out.print("Enter Start Date (1-31): ");
        int startDay = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDay>=1 && endDate<=31 && startDay<=31 && endDate>=1) {

            if (startDay<endDate) {

                System.out.println("");
                System.out.println("Room Charge Per Day: Rs. "+chargersPerDay+"/=");

                int numberOfDates =endDate-startDay;
                System.out.println("Number of Days Reserved: "+numberOfDates);

                if (numberOfDates<3) {
                    double totalAmount = chargersPerDay*numberOfDates;
                    System.out.println("Total Amount to be Paid: "+totalAmount);
                }
                else if (numberOfDates==3 || numberOfDates==4) {
                    double totalAmount = (chargersPerDay *numberOfDates)*90/100;
                    System.out.println("Total Amount to be Paid: "+totalAmount);
                }
                else{
                    double totalAmount = (chargersPerDay*numberOfDates)*80/100;
                    System.out.println("Total Amount to be Paid: "+totalAmount);
                }
            }
            else{
                System.out.println("Error: Start Date must be less than End Date");
            }

        }
        else{
            System.out.println("Error: Days must be between 1 and 31");
        }


    }
}