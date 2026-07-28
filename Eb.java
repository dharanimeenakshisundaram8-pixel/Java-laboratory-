mport java.util.Scanner;

class EBBill
{
    int consumerNo;
    String consumerName;
    int previousReading, currentReading, units;
    String connectionType;
    double amount = 0;

    void getInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        currentReading = sc.nextInt();

        units = currentReading - previousReading;

        sc.nextLine();
        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        connectionType = sc.nextLine();
    }
