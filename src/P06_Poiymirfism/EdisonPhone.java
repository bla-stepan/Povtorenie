package P06_Poiymirfism;

public class EdisonPhone extends AbstractPhone {
    public EdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("вращайте ручку");
        System.out.println("сообщите номер обонента");
    }

    @Override
    public void ring(int outputNumber) {
        System.out.println("телефон соединяется");
    }
}
