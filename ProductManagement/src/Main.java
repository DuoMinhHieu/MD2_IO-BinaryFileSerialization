import java.util.ArrayList;
import java.io.*;
public class Main {
    public void save(String path, ArrayList<ProductManagement> list) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
        dos.writeInt(list.size());
        for (ProductManagement i : list) {
            dos.writeUTF(i.getMaSP());
            dos.writeUTF(i.getTenSP());
            dos.writeDouble(i.getGia());
            dos.writeUTF(i.getHangSanXuat());
        }
        dos.close();
    }
    public ArrayList<ProductManagement> load (String path) throws IOException {
        ArrayList<ProductManagement> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        DataInputStream dis = new DataInputStream(new FileInputStream(path));
        int numberProduct = dis.readInt();
        for (int i = 0; i < numberProduct; i++) {
            String product_id = dis.readUTF();
            String product_name = dis.readUTF();
            double product_price = dis.readDouble();
            String product_brand = dis.readUTF();
            ProductManagement product = new ProductManagement(product_id,product_name,product_price,product_brand);
            list.add(product);
        }
        return list;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<ProductManagement> list = new ArrayList<>();
        ProductManagement s1 = new ProductManagement("1","Tivi",1000,"Sony");
        ProductManagement s2 = new ProductManagement("2","MayGiat",1000,"LG");
        ProductManagement s3 = new ProductManagement("3","TuLanh",1000,"Hitachi");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        s3.setGia(1200);
        new Main().save("data.txt",list);
        System.out.println(new Main().load("data.txt"));

    }
}
