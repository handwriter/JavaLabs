package ru.mirea.lab13;

public class PhoneNumber {
    private String countryCode;
    private String formattedNumber;

    public PhoneNumber(String numb) {
        if (numb.startsWith("+")) {
            parseDefault(numb);
        }
        else if (numb.startsWith("8")) {
            parseRussian(numb);
        }
    }

    private void parseDefault(String phoneNumber) {
        this.countryCode = phoneNumber.substring(1, phoneNumber.length() - 10);
        String number = phoneNumber.substring(phoneNumber.length() - 10);
        this.formattedNumber = formatNumber(number);
    }

    private void parseRussian(String phoneNumber) {
        this.countryCode = "+7";
        String number = phoneNumber.substring(1);
        this.formattedNumber = formatNumber(number);
    }

    private String formatNumber(String number) {
        return number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
    }

    public String getNumberFormatted() {
        return countryCode + formattedNumber;
    }
}