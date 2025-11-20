public class GradeEvaluator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println("Your Result: " + result);
    }
}
