public class Calculation {
    private double x;
    private double y;

    public Calculation(double x, double y){
        if(x != 0 && y != 0){
            this.x = x;
            this.y = y;
        }
    }
    public void printResult(){
        double a = (Math.cos(x) + Math.sin(y*y)) / Math.cos(y * y);
        double b = Math.sqrt(a) + x / y;
        System.out.printf("a = %f, b = %f", a, b);
    }
}
