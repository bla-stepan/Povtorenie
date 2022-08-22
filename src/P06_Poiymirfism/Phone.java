package P06_Poiymirfism;

public class Phone extends AbstractPhone{
    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("вызываю номер "+outputNumber);
    }

    @Override
    public void ring(int outputNumber) {
        System.out.println("телефон звонит");
    }
}
