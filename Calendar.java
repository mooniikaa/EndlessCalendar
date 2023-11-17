import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weekday = "";
        System.out.println("Day Month Year");
        int day = scan.nextInt(); int month = scan.nextInt(); int year = scan.nextInt();
        String exception = (month + " month don`t have " + day + " days.");
        if (month == 2){
            exception = "February in years that are devided by 4 have 29 days, " +
                    "in other years have 28 days";
        }
        int nulls = 0; int jan; int feb = 0; int mar; int apr; int may; int jun; int jul;
        int aug; int sep; int oct; int nov; int dec;
        int february;
        for (int b = 1; b <= year; b++){
            if (year % 4 == 0){
                feb = 29;
            }
            else{
                feb = 28;
            }
        }
        for (jan = 1; jan < 31; jan++){
        }
        for (february = 1; february < feb; february++){
        }
        for (mar = 1; mar < 31; mar++){
        }
        for (apr = 1; apr < 30; apr++){
        }
        for (may = 1; may < 31; may++){
        }
        for (jun = 1; jun < 30; jun++){
        }
        for (jul = 1; jul < 31; jul++){
        }
        for (aug = 1; aug < 31; aug++){
        }
        for (sep = 1; sep < 30; sep++){
        }
        for (oct = 1; oct < 31; oct++){
        }
        for (nov = 1; nov < 30; nov++){
        }
        for (dec = 1; dec < 31; dec++){
        }
        int[] months = {nulls, jan, february, mar, apr, may, jun, jul, aug,
                sep, oct, nov, dec};
        int m = 0;
        for (int a = 0; a <= month - 1; a++){
            m += months[a];
        }
        int sum = 0;
        for (int b = 1; b <= year - 1; b++){
            if (b % 400 != 0 && b % 100 == 0){
                sum += 1;
            }
        }
        int today = (year - 1) * 365 + m + day + (year - 1) / 4 - sum;//correct
        for (int i = 1; i <= today + 1; i++){
            if (today % 7 == 1){
                weekday = "Monday";
            }
            if (today % 7 == 2){
                weekday = "Tuesday";
            }
            if (today % 7 == 3){
                weekday = "Wednesday";
            }
            if (today % 7 == 4){
                weekday = "Thursday";
            }
            if (today % 7 == 5){
                weekday = "Friday";
            }
            if (today % 7 == 6){
                weekday = "Saturday";
            }
            if (today % 7 == 0){
                weekday = "Sunday";
            }
        }

        if (month == 2 && year % 4 == 1 && day > 28 || month == 2 && year % 4 == 0 && day > 29 || month == 4
                && day > 30 || month == 6 && day > 30 || month == 9 && day > 30 || month == 11 && day > 30)
            {
                System.out.println(exception);
            }
        else{
            System.out.println(weekday);
        }
    }
}
