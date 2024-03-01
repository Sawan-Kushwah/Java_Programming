class cylinder {
    int height, radius;

    cylinder(int h, int r) {
        height = h;
        radius = r;
    }

    public void area() {
        System.out.println(" Area is : " + 2 * Math.PI * height * radius);
    }
    public  void volume(){
        System.out.println(" Volume is : " + Math.PI*radius*radius*height);
    }
}
class rectangle{
    int length , breadth ;
    rectangle(int l ,int b){
        length = l;
        breadth = b;
    }
    rectangle(){
        length=10;
        breadth = 7;
    }
    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth ;
    }
}

public class exercise_constructor {
    public static void main(String[] args) {
//        cylinder lpg = new cylinder(10, 4);
//        lpg.area();
//        lpg.volume();
         
        rectangle r = new rectangle(54,4);
        System.out.println(r.length);
        System.out.println(r.breadth);

    }

}
