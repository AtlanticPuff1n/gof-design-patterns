package com.patterns.design.gof.creational.builder;

public class Car {
   private final int seats;
   private final String color;
   private final String engine;

   private Car(Builder builder) {
       this.seats = builder.seats;
       this.color = builder.color;
       this.engine = builder.engine;
   }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class Builder {
        private int seats;
        private String color;
        private String engine;

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
