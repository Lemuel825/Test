
public class Task1 {

    // public static void main(String[] args) {
    //     // Scanner in = new Scanner(System.in);
    //     // int choice = 0;
    //     // DateModel date = new DateModel();

    //     // do{
    //     // displayChoices();

    //     // System.out.print("\nSelected Choice: ");
    //     // choice = in.nextInt();

    //     // processSelection(choice,date);
    //     // System.out.println("\n" + date.Month + " has " + date.DaysInMonth + "
    //     // days\n");
    //     // }while(choice < 13);



    // }
    public static class WaterBottle {
        private String brand;
          //private boolean empty;
          private int empty = 1_2000;
          private double empty2 = 0xE;
          double amount = 0xE;
           public static void main(String... $n) {
                WaterBottle wb = new WaterBottle();
                 System.out.print("Empty = " + wb.empty);
               System.out.print(", Brand = " + wb.brand);
               System.out.print(", amount = " + wb.amount);
          } }


    static class DateModel {
        int DaysInMonth;
        String Month;
    }

    public static void displayChoices() {
        String sf3 = String.format("%1s %13s %11s %15s %12s %16s",
                "[1] January", "[2] February", "[3] March", "[4] April", "[5] May", "[6] June");

        String sf4 = String.format("%1s %14s %17s %14s %15s %16s",
                "[7] July", "[8] August", "[9] September", "[10] October", "[11] November", "[12] December ");

        System.out.println("\t\t ---------------- Select Month ----------------");
        System.out.println(sf3);
        System.out.println(sf4);
    }

    public static void processSelection(int month, DateModel date) {

        switch (month) {
            default:
                System.out.println("Invalid Input!");
                break;
            case 1:
                date.Month = "January";
                date.DaysInMonth = 31;
                break;
            case 2:
                date.Month = "February";
                date.DaysInMonth = 28;
                break;
            case 3:
                date.Month = "March";
                date.DaysInMonth = 31;
                break;
            case 4:
                date.Month = "April";
                date.DaysInMonth = 30;
                break;
            case 5:
                date.Month = "May";
                date.DaysInMonth = 31;
                break;
            case 6:
                date.Month = "June";
                date.DaysInMonth = 30;
                break;
            case 7:
                date.Month = "July";
                date.DaysInMonth = 31;
                break;
            case 8:
                date.Month = "August";
                date.DaysInMonth = 31;
                break;
            case 9:
                date.Month = "September";
                date.DaysInMonth = 30;
                break;
            case 10:
                date.Month = "October";
                date.DaysInMonth = 31;
                break;
            case 11:
                date.Month = "November";
                date.DaysInMonth = 30;
                break;
            case 12:
                date.Month = "December";
                date.DaysInMonth = 31;
        }
    }
}
