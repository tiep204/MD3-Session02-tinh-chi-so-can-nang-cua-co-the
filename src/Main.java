import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        if (age>20){
            System.out.println("mời bạn nhập cân nặng của bạn: ");
            double weight = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập chiều cao của bạn:");
            double height = Double.parseDouble(scanner.nextLine());
            double BMI = weight/Math.pow(height,2);
            if (BMI<18.5){
                System.out.printf("BMI của bạn %f underweight",BMI);
            } else if (18.5<=BMI) {
                System.out.printf("BMI của bạn %f Normal",BMI);
            } else if (25.0<=BMI && BMI<30.0) {
                System.out.printf("BMI của bạn %f overweight",BMI);
            }else {
                System.out.printf("BMI của bạn %f obese",BMI);
            }
        }else {
            System.err.println("Bạn không đủ tuổi để dùng BMI");
            main(args);
        }
    }
}