package ru.mirea.lab13;

public class Task3 {
    public static void main(String[] args) {
        String addr1 = "Россия, Московская область, Москва, Тверская улица, 10, 1, 15";
        String addr2 = "Россия, Иркутская область, Иркутск, Ленина улица, 20, 1, 35";
        String addr3 = "Россия. Самарская область. Самара. Гагарина улица. 1. 1. 1";
        String addr4 = "Россия; Самарская область; Тольятти; Жилина улица; 35; 1; 116";
        Address adr1 = new Address();
        adr1.defaultParse(addr1);
        Address adr2 = new Address();
        adr2.parse(addr2);
        Address adr3 = new Address();
        adr3.parse(addr3);
        Address adr4 = new Address();
        adr4.parse(addr4);
        System.out.println(adr1);
        System.out.println(adr2);
        System.out.println(adr3);
        System.out.println(adr4);
    }
}
