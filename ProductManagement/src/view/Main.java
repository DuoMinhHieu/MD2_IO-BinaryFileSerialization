package view;

import manager.ManagerProduct;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Product> list = new ArrayList<>();
        Product s1 = new Product("1","DuaMuoi",10000,"HieuHaHa");
        Product s2 = new Product("2","CaMuoi",15000,"HieuHeHe");
        Product s3 = new Product("3","SungMuoi",20000,"HieuHuHu");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        s3.setProductPrice(1200);
        new ManagerProduct();
        ManagerProduct.save("data.txt",list);
        System.out.println(new ManagerProduct().load("data.txt"));

    }
}
