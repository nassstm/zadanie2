public class Animal {
    String food;
    String location;

    public Animal(String location_){
        location = location_;
    }

    public void makeNoise(){
        System.out.println("какой голос");
    }

    public void eat(){
        System.out.println("Животное поело " + food);
    }

    public void sleep(){
        System.out.println("Животное спит");
    }

}
