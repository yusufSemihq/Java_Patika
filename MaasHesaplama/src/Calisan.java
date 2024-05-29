import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Calisan {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Calisan(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Haftalık çalışma saati ve işe başlangıç yılına göre prim hesapla
    public double calculateBonus() {
        int currentYear = java.time.LocalDate.now().getYear();
        int workedYears = currentYear - hireYear;
        double bonus = (workHours > 40) ? 0.1 * salary : 0;
        bonus += (workedYears > 5) ? 0.05 * salary : 0;
        return bonus;
    }

    // Brüt maaş hesapla
    public double calculateGrossSalary() {
        double grossSalary = salary + calculateBonus();
        return grossSalary;
    }

    // Net maaş hesapla
    public double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double deductions = grossSalary * 0.1; // Kesintiler
        double taxes = grossSalary * 0.2; // Vergiler
        double netSalary = grossSalary - (deductions + taxes);
        return netSalary;
    }

    // Net maaş için gerekli brüt maaşı tahmin et
    public double estimateGrossSalary(double netSalary) {
        ArrayList<Double> netSalaries = new ArrayList<>();
        double[][] netSalaryRange = new double[1][2];

        for (int i = 0; i < 10; i++) { // Örnek olarak 10 kez tahmin yap
            netSalaries.add(calculateNetSalary());
            double range = netSalaries.get(0) * 0.1;

            if (i == 0) {
                netSalaryRange[0][0] = netSalaries.get(0);
                netSalaryRange[0][1] = range;
            }

            double grossSalary = netSalary * (1 + 1.5);
            double estimatedNetSalary = calculateNetSalary();

            if (estimatedNetSalary > netSalaries.get(0)) {
                if (i > 0) {
                    netSalaryRange[0][0] = netSalaries.get(i);
                }
                netSalary = ThreadLocalRandom.current().nextDouble(netSalaryRange[0][1], netSalaryRange[0][0]);
            } else if (estimatedNetSalary < netSalaries.get(0)) {
                netSalaryRange[0][1] = netSalaries.get(i);
                netSalary = ThreadLocalRandom.current().nextDouble(netSalaryRange[0][1], netSalaryRange[0][0]);
            }
        }
        return calculateGrossSalary();
    }

    public static void main(String[] args) {
        Calisan calisan = new Calisan("kemal", 2000, 45, 1985);
        double grossSalary = calisan.calculateGrossSalary();
        double bonus = calisan.calculateBonus();
        double taxes = grossSalary * 0.2;
        double salaryIncrease = grossSalary - (calisan.salary + bonus);
        double totalSalary = calisan.salary + bonus + salaryIncrease - taxes;

        System.out.println("Adı: " + calisan.name);
        System.out.println("Maaşı: " + calisan.salary);
        System.out.println("Çalışma Saati: " + calisan.workHours);
        System.out.println("Başlangıç Yılı: " + calisan.hireYear);
        System.out.println("Vergi: " + taxes);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + salaryIncrease);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + (totalSalary + taxes));


        Car carornek=new Car();

    }
}
