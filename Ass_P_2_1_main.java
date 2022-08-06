import java.util.Scanner;

public class Ass_P_2_1_main {


        public static void main(String[] args) {
            Ass_p_2_1 object1 = new Ass_p_2_1();
            System.out.print("Enter The Argument for Radius -> ");
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();

            Ass_p_2_1 object2 = new Ass_p_2_1(a);

            System.out.println("Area and Perimeter of Circle for default argument 1 : "+object1.getArea()+" and "+object1.getPerimeter());
            System.out.println("Area and Perimeter of Circle for argument  " + a + "  : "+object2.getArea()+" and "+object2.getPerimeter());
        }
    }
