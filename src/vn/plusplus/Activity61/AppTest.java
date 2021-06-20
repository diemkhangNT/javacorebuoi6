package vn.plusplus.Activity61;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class AppTest extends StoreManagement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhập vào thông tin các cửa hàng
        System.out.print("Nhập vào số cửa hàng cần quản lí: ");
        int m = input.nextInt();
        input.nextLine();
        Store[] stores = new Store[m];
        SmartPhone[] phones;
        //StoreManagement storeManagement = new StoreManagement();
        //storeManagement.setStores(stores);
        for(int i=0;i<stores.length;i++) {
            System.out.println("** Nhập vào thông tin cửa hàng thứ " + i);
            System.out.print("\tTên cửa hàng: ");
            String name = input.nextLine(); // Tên cửa hàng
            System.out.print("\tĐịa chỉ của cửa hàng: ");
            String address = input.nextLine(); // Địa chỉ cửa hàng
            System.out.print("\tTổng số điện thoại có trong cửa hàng: ");
            int n = input.nextInt(); // Tổng số điện thoại có trong cửa hàng
            input.nextLine();

            stores[i] = new Store();

            stores[i].setName(name);
            stores[i].setAddress(address);
            stores[i].setN(n);

            // Nhập vào thông tin chi tiết các điện thoại có trong cửa hàng
            phones = new SmartPhone[n];
            for (int j = 0; j < phones.length; j++) {
                System.out.println(" + Info điện thoại " + j + " có trong cửa hàng " + i);
                System.out.print("\tThương hiệu: ");
                String brand = input.next();
                System.out.println("\tNhập vào true/false: ");
                System.out.print("\t\tCó Bluetooth không? ");
                boolean bluetooth = input.nextBoolean();
                input.nextLine();
                System.out.print("\t\tCó 5G không? ");
                boolean fiveG = input.nextBoolean();
                input.nextLine();
                System.out.print("\t\tCó Wifi không? ");
                boolean wifi = input.nextBoolean();
                input.nextLine();
                System.out.print("\tHệ điều hành: ");
                String os = input.nextLine();
                System.out.print("\tBộ nhớ (GB): ");
                float memory = input.nextFloat();
                input.nextLine();
                System.out.print("\tMàu: ");
                String color = input.nextLine();
                System.out.print("\tGiá bán: ");
                long price = input.nextLong();
                input.nextLine();
                System.out.print("\tTổng số đã bán được: ");
                int totalsold = input.nextInt();
                input.nextLine();
                phones[j] = new SmartPhone();
                phones[j].setBrand(brand);
                phones[j].setHasBluetooth(bluetooth);
                phones[j].setHas5G(fiveG);
                phones[j].setHasWifi(wifi);
                phones[j].setOs(os);
                phones[j].setMemory(memory);
                phones[j].setColor(color);
                phones[j].setPrice(price);
                phones[j].setTotalSold(totalsold);
                //storeManagement.setPhones(phones);
            }
        }

        for(int i=0;i<stores.length;i++){
            System.out.println("Cửa hàng "+(i+1)+": ");
            System.out.println("\tName: "+ stores[i].getName());
            System.out.println("\tAndress: "+stores[i].getAddress());
            System.out.println("\tTổng số smartphone: "+stores[i].getN());
        }

    }
}
