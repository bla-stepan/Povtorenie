package P09_Abstrakciya;

abstract class Animal {
    //абстрактный метод не имеет тела
    public abstract void animalSound();

    //регулярный метод
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Хрюшка говорит уви уви");
    }
}

class MyMain{
    public static void main(String[] args) {
        Pig myPig = new Pig();//содаем объект класса пиг
        myPig.animalSound();
        myPig.sleep();
    }
}