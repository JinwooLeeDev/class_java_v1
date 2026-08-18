package com.oop10;

public class Card {
    private String cardName;
    private int cardNumber;


    public Card(String cardName) {
        this.cardName = cardName;
        this.cardNumber = Company.cardNumber++;
        Company.cardNumber = (int)(Math.random() * 10000) + 1000;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
