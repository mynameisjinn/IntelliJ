package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<Human> getAnimal(){
        AnimalData<Human> animalData = new AnimalData<Human>(new Human());
        return animalData;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.getAnimal().printData();

    }
}
