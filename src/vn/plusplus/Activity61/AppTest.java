package vn.plusplus.Activity61;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class AppTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumdt =0;
        // Nhập vào thông tin các cửa hàng
        System.out.print("Nhập vào số cửa hàng cần quản lí: ");
        int m = input.nextInt();
        input.nextLine();
        Store[] store = new Store[m];
        StoreManagement storeManagement = new StoreManagement();
        for(int i=0;i<store.length;i++) {
            System.out.println("** Nhập vào thông tin cửa hàng thứ " + (i+1));
            System.out.print("\tTên cửa hàng: ");
            String name = input.nextLine(); // Tên cửa hàng
            System.out.print("\tĐịa chỉ của cửa hàng: ");
            String address = input.nextLine(); // Địa chỉ cửa hàng
            System.out.print("\tTổng số điện thoại có trong cửa hàng: ");
            int n = input.nextInt(); // Tổng số điện thoại có trong cửa hàng
            input.nextLine();
            store[i] = new Store();
            store[i].setName(name);
            store[i].setAddress(address);
            store[i].setN(n);
            // Nhập vào thông tin chi tiết các điện thoại có trong cửa hàng
            //phones = new SmartPhone[n];
            SmartPhone[] phones = new SmartPhone[n];
            for (int j = 0; j < phones.length; j++) {
                store[i].setPhones(phones);
                System.out.println(" + Info điện thoại thứ " + (j+1) + " có trong cửa hàng " + (i+1));
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
                store[i].setPhones(phones);
                if(phones[j].isHasBluetooth() && phones[j].isHas5G() && phones[j].isHasWifi()){
                    sumdt +=1;
                }
            }
            storeManagement = new StoreManagement(m,store);

        }
        System.out.println("Thông tin chi tiết các cửa hàng: ");
        System.out.println(storeManagement.toString());
        System.out.println();
        // tìm max/min
        int max = store[0].tongSoDaBan();
        double maxdt = store[0].doanhThu();
        for(int i=0;i<store.length;i++){
            if(max<store[i].tongSoDaBan()){
                max = store[i].tongSoDaBan();
            }
            if(maxdt<store[i].doanhThu()){
                maxdt = store[i].doanhThu();
            }
        }
        int min = store[0].tongSoDaBan();
        double mindt = store[0].doanhThu();
        for(int i=0;i<store.length;i++){
            if(min > store[i].tongSoDaBan()){
                min = store[i].tongSoDaBan();
            }
            if(mindt>store[i].doanhThu()){
                mindt = store[i].doanhThu();
            }
        }
        //in ra max/min
        for(int i=0;i<store.length;i++){
            if(max == store[i].tongSoDaBan()){
                System.out.println("Cua hang thu "+(i+1)+" ban nhieu dien thoai nhat: ");
                System.out.println("\tName: "+store[i].getName());
                System.out.println("\tAndress: "+store[i].getAddress());
                System.out.println("\tTong so da ban duoc: "+store[i].tongSoDaBan());
            }
            if(min == store[i].tongSoDaBan()){
                System.out.println("Cua hang thu "+(i+1)+" ban it dien thoai nhat: ");
                System.out.println("\tName: "+store[i].getName());
                System.out.println("\tAndress: "+store[i].getAddress());
                System.out.println("\tTong so da ban duoc: "+store[i].tongSoDaBan());
            }
            if(maxdt == store[i].doanhThu()){
                System.out.println("Cua hang thu "+(i+1)+" co doanh thu cao nhat: ");
                System.out.println("\tName: "+store[i].getName());
                System.out.println("\tAndress: "+store[i].getAddress());
                System.out.println("\tDoanh thu: "+store[i].doanhThu());
            }
            if(mindt == store[i].doanhThu()){
                System.out.println("Cua hang thu "+(i+1)+" co doanh thu thap nhat: ");
                System.out.println("\tName: "+store[i].getName());
                System.out.println("\tAndress: "+store[i].getAddress());
                System.out.println("\tDoanh thu: "+store[i].doanhThu());
            }
        }

        // số lượng điện thoại có 5G,bluetooth, wifi
        System.out.println("Số lượng điện thoại có Bluetooth, 5G, Wifi: "+ sumdt);

    }
}
