import java.util.Scanner;
class Result{
    public static void main(String[]args) {
        System.out.println("The exam result");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Marks of Maths");
        int a = Sc.nextInt();
        System.out.println("Marks of Physics");
        int b = Sc.nextInt();
        System.out.println("Marks of Chemistry");
        int c = Sc.nextInt();
        System.out.println("Marks of Biology");
        int d = Sc.nextInt();
        System.out.println("Marks of English");
        int e = Sc.nextInt();

        //Calculate the marks
        int total = a+b+c+d+e;

        //Percentage formula
        double percentage = (total/500.0)*100;
    
        System.out.println("percentage = " + percentage + " % ");


    }
}
 
