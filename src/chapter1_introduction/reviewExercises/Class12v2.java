package chapter1_introduction.reviewExercises;

public class Class12v2 {
    public static void main(String[] args) {
        double sum=10000d;
        int month;
        int year;
        int totalmonth = 0;
        //int n=0;
        for (year=0; year>=0; year++) {
            for (month = 12; month > 0; month--) {
                if (sum > 500) {
                    sum = sum - 500;
                } else break;
                totalmonth++;
                System.out.println("Месяц: " + month + " " + sum + "$");
            }
            if (sum < 500) break;
            sum=sum*1.06;
            System.out.println("Месяц: " + month + " " + sum + "$");
        }
        System.out.println("Остаток: "+ sum);
        System.out.println("Всего месяцев: " + totalmonth);
        System.out.println("Всего полных лет: " + year);

    }


}
