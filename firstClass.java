
class empolyees {
    int salary;
    String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    int getSalary() {
        return salary;
    }
}

class cellPhone {
    void ringing() {
        System.out.println("Ringing......");
    }

    void vibrate() {
        System.out.println("vibrating......");
    }
}

class square {
    int side;

    void setSide(int s) {
        side = s;
    }

    void calculateArea() {
        System.out.printf("Area of square with %dm is %d\n", side, side * side);
    }

    void calculatePerimeter() {
        System.out.printf("Perimeter of square with %dm is %d\n", side, 4 * side);
    }
}

public class firstClass {
    public static void main(String[] args) {
//        empolyees sawan = new empolyees();
//        sawan.setName("Sawan kushwah");
//        sawan.salary = 23;
//        System.out.println("your name  is : " + sawan.getName());
//        System.out.println("your salary is : " + sawan.getSalary());

//        cellPhone vivo = new cellPhone();
//        vivo.ringing();
//        vivo.vibrate();

        square box = new square();
        box.setSide(7);
        box.calculateArea();
        box.calculatePerimeter();

    }
}
