import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month of birth: ");
        month = input.nextInt();

        System.out.print("Enter the date of your birth: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 21) {
                System.out.println("You're Capricorn. ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("You're Aquarius.");
            }
        }

        if (month == 2) {
            if (day >= 1 && day <= 19) {
                System.out.println("You're Aquarius. ");
            } else if (day >= 20 && day <= 29) {
                System.out.println("You're Pisces.");
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 21) {
                System.out.println("You're Pisces. ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("You're Aries .");
            }
        }

        if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("You're Aries. ");
            } else if (day >= 21 && day <= 30) {
                System.out.println("You're Taurus.");
            }
        }

        if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.println("You're Taurus. ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("You're Gemini.");
            }
        }

        if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.println("You're Gemini. ");
            } else if (day >= 23 && day <= 30) {
                System.out.println("You're Cancer.");
            }
        }

        if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.println("You're Cancer. ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("You're Leo.");
            }
        }

        if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("You're Leo. ");
            } else if (day >= 23 && day <= 31) {
                System.out.println("You're Virgo.");
            }
        }

        if (month == 9) {
            if (day >= 1 && day <= 21) {
                System.out.println("You're Virgo. ");
            } else if (day >= 22 && day <= 30) {
                System.out.println("You're Libra.");
            }
        }

        if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.println("You're Libra. ");
            } else if (day >= 23 && day <= 31) {
                System.out.println("You're Scorpio.");
            }
        }

        if (month == 11) {
            if (day >= 1 && day <= 23) {
                System.out.println("You're Scorpio. ");
            } else if (day >= 24 && day <= 30) {
                System.out.println("You're Sagittarius.");
            }
        }

        if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("You're Sagittarius. ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("You're Capricorn.");
            }
        }

        if (month <1 || month >12){
            System.out.println("You have entered an invalid value. Please enter a value between 1 and 12.");
        }else if (day <1 || day >31){
            System.out.println("You have entered an invalid value. Please enter a value between 1 and 31.");
        }

    }
}
