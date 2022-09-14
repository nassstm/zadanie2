public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Дом");
        animals[1] = new Dog("Вольер");
        animals[2] = new Horse("Загон");

        Veterinarian veterinarian = new Veterinarian();

        for (int i = 0; i < animals.length; i++){
            animals[i].makeNoise();
            veterinarian.treatAnimal(animals[i]);
            System.out.println();
        }
    }
}