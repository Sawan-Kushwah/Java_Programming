class animal {
    String name;
    String food;

    public void setNameOfFood(String f) {
        food = f;
    }

    public String getNameOfFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class dog extends animal {
    String voice;
//
//    public void setVoice(String v) {
//        voice = v;
//    }
//
    public String getVoice() {
        return voice;
    }
    dog(){
        this.voice = "bark";
    }

}


public class exercise_animal {
    public static void main(String[] args) {
        dog tommy = new dog();
        tommy.setName("Tommy");
        tommy.setNameOfFood("Meat and milk");
//        tommy.setVoice("Bark");
        System.out.println("Name of our dog is : " + tommy.getName());
        System.out.println("Favourite food of our dog is : " + tommy.getNameOfFood());
        System.out.println("Our dog voice  : " + tommy.getVoice());

    }
}

