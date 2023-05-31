package com.ashourics.model;

import java.time.LocalDateTime;

public class EthereumPrice {

    private LocalDateTime timestamp;
    private double price;


    public EthereumPrice() {
    }


    public EthereumPrice(LocalDateTime timestamp, double price) {
        this.timestamp = timestamp;
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "EthereumPrice{" +
                "timestamp=" + timestamp +
                ", price=" + price +
                '}';
    }
}
