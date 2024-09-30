public class Main {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double firstMax = Double.MIN_VALUE;
        for (double cgpa : cgpas) {
            if (cgpa > firstMax) {
                firstMax = cgpa;
            }
        }
        double secondMax = Double.MIN_VALUE;
        for (double cgpa : cgpas) {
            if (cgpa > secondMax && cgpa < firstMax) {
                secondMax = cgpa;
            }
        }
        System.out.println("The second highest CGPA is: " + secondMax);
    }
}