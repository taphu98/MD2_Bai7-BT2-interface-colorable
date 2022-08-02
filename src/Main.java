import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------- interface 'Resizeable' ---------------- ");
        Shape [] shape1 = new Shape[3];
        shape1[0] = new Circle("yellow", false, 5);
        shape1[1] = new Rectangle("blue",false,10,5);
        shape1[2] = new Square("green", false,10);
        shape1[0].resize((int)(Math.random()*100));
        System.out.println("Hình tròn sau khi thay đổi: " + shape1[0]);
        shape1[1].resize((int)(Math.random()*100));
        System.out.println("Hình chữ nhất sau khi thay đổi: " + shape1[1]);
        shape1[2].resize((int)(Math.random()*100));
        System.out.println("Hình vuông sau khi thay đổi: " + shape1[2]);

    }
}