import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        try{
            Factory factory = createShape(type);
            Figure figure = factory.create();
            figure.print();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static Factory createShape(String type) throws Exception {
        if (type.equals("Rectangle")){
            return new RectangleFactory();
        }
        else if (type.equals("Circle")){
            return new CircleFactory();
        }
        throw new Exception(type + " имеет неправильный тип");
    }
}