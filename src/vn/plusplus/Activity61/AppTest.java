package vn.plusplus.Activity61;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhập vào thông tin các cửa hàng
        System.out.print("Nhập vào số cửa hàng cần quản lí: ");
        int m = input.nextInt();
        Store[] stores = new Store[m];

        for(int i=0;i<stores.length;i++) {
            System.out.println("** Nhập vào thông tin cửa hàng thứ " + i);
            System.out.print("\tTên cửa hàng: ");
            String name = input.next(); // Tên cửa hàng
            System.out.print("\tĐịa chỉ của cửa hàng: ");
            String address = input.next(); // Địa chỉ cửa hàng
            System.out.print("\tTổng số điện thoại có trong cửa hàng: ");
            int n = input.nextInt(); // Tổng số điện thoại có trong cửa hàng
            stores[i] = new Store();
            stores[i].setName(name);
            stores[i].setAddress(address);
            stores[i].setN(n);

            StoreManagement storeManagement = new StoreManagement();
            storeManagement.setStores(stores);

            // Nhập vào thông tin chi tiết các điện thoại có trong cửa hàng
            SmartPhone[] phones = new SmartPhone[n];
            for (int j = 0; j < n; j++) {
                System.out.println(" + Info điện thoại " + j + " có trong cửa hàng " + i);
                System.out.print("\tThương hiệu: ");
                String brand = input.next();
                System.out.print("\tCó Bluetooth không? (Y/N) ");
                boolean bluetooth = input.hasNext("Y") ? true : false;
                System.out.print("\tCó 5G không? (Y/N) ");
                char fiveG = input.next().charAt(0);
                System.out.print("\tCó Wifi không? (Y/N) ");
                char wifi = input.next().toUpperCase().charAt(0);
                System.out.print("\tHệ điều hành: ");
                String os = input.next();
                System.out.print("\tBộ nhớ (GB): ");
                float memory = input.nextFloat();
                System.out.print("\tMàu: ");
                String color = input.next();
                System.out.print("\tGiá bán: ");
                long price = input.nextLong();
                System.out.print("\tTổng số đã bán được: ");
                int totalsold = input.nextInt();
                phones[j] = new SmartPhone();
                phones[j].setBrand(brand);
//                if(bluetooth == 'Y' ){
//                    phones[i].setHasBluetooth(true);
//                }else phones[i].setHasBluetooth(false);
//                if(fiveG == 'Y' ){
//                    phones[i].setHas5G(true);
//                }else phones[i].setHas5G(false);
//                if(wifi == 'Y' ){
//                    phones[i].setHasWifi(true);
//                }else phones[i].setHasWifi(false);
                phones[j].setOs(os);
                phones[j].setMemory(memory);
                phones[j].setColor(color);
                phones[j].setPrice(price);
                phones[j].setTotalSold(totalsold);

                Store store = new Store();
                store.setPhones(phones);
            }
        }
        for(Store item : stores){
            System.out.println(item.getName());
            System.out.println(item.getAddress());
            System.out.println(item.getN());
            System.out.println(item.getPhones().toString());
        }
    }
}
