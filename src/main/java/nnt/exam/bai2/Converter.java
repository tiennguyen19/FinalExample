package nnt.exam.bai2;

public class Converter {
    public double convertCtoF(double C) {
        return C * 1.8 + 32;
    }

    public double convertFtoC(double F) {
        return (F - 32) / 1.8;
    }
}
