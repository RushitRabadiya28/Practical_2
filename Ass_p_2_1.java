public class Ass_p_2_1 {
        private double radius;

        public Ass_p_2_1() {
            radius = 1;
        }
        public Ass_p_2_1(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return 22*radius*radius/7;
        }
        public double getPerimeter(){
            return 2*22*radius/7;
        }

}
