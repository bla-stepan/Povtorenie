package P06_Poiymirfism;

public class VideoPhone extends AbstractPhone{
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("подключается видеоканал для абонента "+outputNumber);
    }

    @Override
    public void ring(int outputNumber) {
        System.out.println("Входящий видеозвонок абонента -"+outputNumber);
    }
}
