public class Horse extends Animal{
    String food = "что то что едят лошади";

    public Horse(String location_) {
        super(location_);
    }

    @Override
    public void makeNoise(){
        System.out.println("Игого");
    }

    @Override
    public void eat(){
        System.out.println("Животное поело " + food);
    }
}
