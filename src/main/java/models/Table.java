package models;


import java.sql.Timestamp;

public class Table extends Furniture {
    private int length;
    private int width;
    private int height;
    private int tableId;

    public Table(String color, double weight, String woodType, Timestamp saleTime, int furnitureId, int length, int width, int height, int tableId) {
        super(color, weight, woodType, saleTime, furnitureId);
        this.length = length;
        this.width = width;
        this.height = height;
        this.tableId = tableId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
}
