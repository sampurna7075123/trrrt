public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 5;
        System.out.println("x++ = " + (x++));
        System.out.println("After x++ : " + x);
        System.out.println("++x = " + (++x));

        int num = 10;
        num += 5;
        System.out.println("num after += 5 : " + num);

        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        boolean p = true;
        boolean q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));

        int marks = 75;
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result = " + result);
    }
}
