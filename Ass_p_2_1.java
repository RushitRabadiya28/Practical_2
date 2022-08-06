public class Ass_p_2_1 {
        private double radius;

        public Ass_p_2_1() //no-argumentconstructo  default valueis1 
        {
            radius = 1;
        }
        public Ass_p_2_1(double radius) //Single argument constructor 
        {
            this.radius = radius;
        }
        public double getArea() // getarea method 
        {
            return 22*radius*radius/7;
        }
        public double getPerimeter() // getparimeter  method 
        {
            return 2*22*radius/7;
        }

}
