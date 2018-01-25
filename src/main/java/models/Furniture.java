package models;

import java.sql.Timestamp;

public class Furniture {
    public String color;
    public double weight;
    public String woodType;
    public Timestamp saleTime;
    public int furnitureId;

    public Furniture(String color, double weight, String woodType, Timestamp saleTime, int furnitureId) {
        this.color = color;
        this.weight = weight;
        this.woodType = woodType;
        this.saleTime = saleTime;
        this.furnitureId = furnitureId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Timestamp getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Timestamp saleTime) {
        this.saleTime = saleTime;
    }

    public int getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }
}
