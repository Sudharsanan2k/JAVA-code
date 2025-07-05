import java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String name = scan.nextLine();
        double score=scan.nextDouble();
        scan.nextLine();
        String department=scan.nextLine();
        System.out.println("name "+name);
        System.out.println("score "+score/10 + "/10");
        System.out.println("department "+department);
    }
    
}
