package manager;

import model.Product;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ManagerProduct {
    public static void save(String path, ArrayList<Product> list) throws IOException {
        DataOutputStream dos = new DataOutputStream(Files.newOutputStream(Paths.get(path)));
        dos.writeInt(list.size());
        for (Product i : list) {
            dos.writeUTF(i.getProductID());
            dos.writeUTF(i.getProductName());
            dos.writeDouble(i.getProductPrice());
            dos.writeUTF(i.getBrand());
        }
        dos.close();
    }
    public ArrayList<Product> load (String path) throws IOException {
        ArrayList<Product> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        DataInputStream dis = new DataInputStream(Files.newInputStream(Paths.get(path)));
        int numberProduct = dis.readInt();
        for (int i = 0; i < numberProduct; i++) {
            String ProductID = dis.readUTF();
            String ProductName = dis.readUTF();
            double ProductPrice = dis.readDouble();
            String Brand = dis.readUTF();
            Product product = new Product(ProductID,ProductName,ProductPrice,Brand);
            list.add(product);
        }
        return list;
    }
}
