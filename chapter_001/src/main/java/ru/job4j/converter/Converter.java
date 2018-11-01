package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int Euro = 1;
        int ruble = 70;
        int kurs = 70;
        return value = ruble / kurs ;

    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int EuroToRuble(int value) {
        int Euro = 1;
        int ruble = 70;
        int kurs = 70;
        return value = Euro * kurs;

    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int RubleToDollar(int value) {
        int Dollar = 1;
        int Ruble = 1200;
        int kurs = 60;
        return value = Ruble / kurs;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return рубли
     */
    public int DollarToRuble(int value) {
        int Dollar = 1;
        int Ruble = 60;
        int kurs = 60;
        return value = Dollar * kurs;

    }
}