package vn.plusplus.Activity61;

import java.util.Arrays;

public class StoreManagement extends Store {
    // 3.1
    private int m; // Tổng số cửa hàng cần quản lí
    private Store[] stores;

    public StoreManagement() { }

    public StoreManagement(int m, Store[] stores) {
        this.m = m;
        this.stores = stores;
    }

    public StoreManagement(String name, String address, int n, SmartPhone[] phones, int m, Store[] stores) {
        super(name, address, n, phones);
        this.m = m;
        this.stores = stores;
    }

    public StoreManagement(String brand, boolean hasBluetooth, boolean has5G, boolean hasWifi, String os, float memory,
                           String color, long price, int totalSold, String name, String address, int n, SmartPhone[] phones, int m, Store[] stores) {
        super(brand, hasBluetooth, has5G, hasWifi, os, memory, color, price, totalSold, name, address, n, phones);
        this.m = m;
        this.stores = stores;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "StoreManagement{" +
                "m=" + m +
                ", stores=" + "\t"+Arrays.toString(stores) +
                '}';
    }

    public int sumBluetooth(){
        int j=0;
        for(int i=0;i< getPhones().length;i++) {
            if (isHasBluetooth()) {
                j++;
            }
        }
        return j;
    }
    public int sum5G(){
        int j=0;
        for(int i=0;i< getPhones().length;i++) {
            if (isHas5G()) {
                j++;
            }
        }
        return j;
    }
    public int sumWifi(){
        int j=0;
        for(int i=0;i< getPhones().length;i++) {
            if (isHasWifi()) {
                j++;
            }
        }
        return j;
    }
}