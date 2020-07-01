package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(dateValidate(11,01,2000));// true
        System.out.println(dateValidate(32,01,2000));// false
        System.out.println(dateValidate(29,02,2000));// true
        System.out.println(dateValidate(29,02,2001));// false
        System.out.println(dateValidate(2,13,2001));// false
        System.out.println(dateValidate(-2,1,2001));// false
        System.out.println(dateValidate(10,-1,2001));// false
        System.out.println(dateValidate(2,10,-200));// false

        System.out.println(getStringMonth);
        System.out.println(getStringMonth(6));
        System.out.println(getStringMonth(0));
    }

    public static boolean dateValidate(int day,int month, int year){
        return  isYearCorrect(year)&&
                isMonthCorrect(month)&&
                isDayCorrect(day,month,year);
    }

    public static boolean isYearCorrect(int year) {
        return year>=0;
    }

    public static boolean isMonthCorrect(int month) {
        return month>=1 && month<=12;
    }

    public static boolean isDayCorrect(int day,int month,int year){
        if((day>=1)&&(day<=28)) {
            return true;
        }
        return day>=1&&day<=getDayPerMonth(month,year);

    }

    public static int getDayPerMonth(int month, int year) {
        if ((month == 1) || (month == 3) ||
                (month == 5) || (month == 7) || (month == 8) ||
                (month == 10) || (month == 12))  {
            return 31;
        }
        if ((month == 4) || (month == 6) ||
                (month == 9) || (month == 11)) {
            return 30;
        }
        return 28+addDayIfYearLeap(year);
    }
    public static boolean isYearLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }
    public static int addDayIfYearLeap(int year) {
        if (isYearLeap(year)) {
            return 1;
        } else {
            return 0;
        }
        public static String getStringMonth (int month);{
            String stringMonth = " ";
            switch (month) {
                case 1:
                    stringMonth = "january";
                    break;
                case 2:
                    stringMonth = "february";
                    break;
                case 3:
                    stringMonth = "march";
                    break;
                case 4:
                    stringMonth = "april";
                    break;
                case 5:
                    stringMonth = "may";
                    break;
                case 6:
                    stringMonth = "juny";
                    break;
                case 7:
                    stringMonth = "july";
                    break;
                case 8:
                    stringMonth = "august";
                    break;
                case 9:
                    stringMonth = "september";
                    break;
                case 10:
                    stringMonth = "oktober";
                    break;
                case 11:
                    stringMonth = "november";
                    break;
                case 12:
                    stringMonth = "december";
                    break;
                default:
                    stringMonth = "error";
                    break;
            }

        }


    }

}
// if() {} else {}
// if() {}