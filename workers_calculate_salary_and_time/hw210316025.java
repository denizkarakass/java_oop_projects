/*
 * Name: Deniz Karakaş
 * ID: 210316025
 * Night Edu (Second)
 */

//import java.util.*;

public class hw210316025 {
    public static void main(String[] args) {
        int[][] workHours = createWorkersArray();
        System.out.println("The workers weekly working hours are:");
        displayArray(workHours);
        double[] averageHours = calculateAvg(workHours);
        displayAvg(averageHours);

        System.out.println("\n Employee with the max. Average working time: " +
                maxAvg(averageHours));

        double[] salary = createSalary(workHours);
        displaySalary(salary);

    }

    public static int[][] createWorkersArray() {
        int[][] workHours = new int[10][7];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                int sayi = (int) (Math.random() * 9 + 1);
                workHours[i][j] = sayi;
            }
        }
        return workHours;
    }

    public static void displayArray(int[][] workHours) {
        String days[] = { "S ", "M ", "T ", "W ", "T ", "F ", "S " };

        System.out.print("            ");
        for (int d = 0; d < 7; d++) {
            System.out.print(days[d]);
        }
        System.out.println();

        for (int i = 0; i < workHours.length; i++) {
            System.out.print("Employee " + i + "  ");
            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print(workHours[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[] calculateAvg(int[][] workHours) {
        double[] avg = new double[10];
        for (int i = 0; i < 10; i++) {
            double hours = 0;
            for (int j = 0; j < 7; j++) {
                hours += workHours[i][j];
            }
            avg[i] = hours / 7;
        }
        return avg;
    }

    public static void displayAvg(double[] averageHours) {
        System.out.println("\n Emloyers Average Work Hours ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + i + " average work hours: " + averageHours[i]);
        }
    }

    public static double maxAvg(double[] averageHours) {
        double maxAvg = 0;
        for (int i = 0; i < 10; i++) {
            if (maxAvg < averageHours[i]) {
                maxAvg = averageHours[i];
            }
        }
        return maxAvg;
    }

    public static double[] createSalary(int[][] workHours) {
        double[] salary = new double[10];
        double[] time = new double[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                time[i] += workHours[i][j];
            }
            if (time[i] > 35) {
                salary[i] = (time[i] - 35) * 100 + 2500;
            } else {
                salary[i] = 2500;
            }
        }
        return salary;
    }

    public static void displaySalary(double[] salary) {
        System.out.println("\n Employee Salaries");
        for (int i = 0; i < 10; i++) {
            System.out.println("Emloyer" + i + "'s salary is " + salary[i]);
        }
    }
}
