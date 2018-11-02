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

        return value / 70 ;

    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int EuroToRuble(int value) {

        return value * 70;

    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int RubleToDollar(int value) {

        return value / 60;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return рубли
     */
    public int DollarToRuble(int value) {

        return value * 60;

    }
}