package ru.mirea.lab13;
import java.util.StringTokenizer;

class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void defaultParse(String address) {
        String[] parts = address.split(",");
        if (parts.length != 7) {
            return;
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    public void parse(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        if (tokenizer.countTokens() != 7) {
            return;
        }
        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.building = tokenizer.nextToken().trim();
        this.apartment = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}