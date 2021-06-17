package vn.plusplus.Activity61;

public class Store extends SmartPhone {
    // 2.1
    private String name;
    private String address;
    private int n; // Tổng số điện thoại có trong cửa hàng
    private SmartPhone[] phones;
    // 2.2
    public Store(){}

    public Store(String name, String address, int n, SmartPhone[] phones) {
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public Store(String brand, boolean hasBluetooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price, int totalSold, String name, String address, int n, SmartPhone[] phones) {
        super(brand, hasBluetooth, has5G, hasWifi, os, memory, color, price, totalSold);
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    @Override
    public int getTotalSold() {
        return super.getTotalSold();
    }
    public long doanhThu(){
        return getTotalSold()*getPrice();
    }
}
