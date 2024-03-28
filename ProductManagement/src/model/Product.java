package model;

public class Product {
    private String ProductID;
    private String ProductName;
    private double ProductPrice;
    private String Brand;

    public Product() {
    }

    public Product(String ProductID, String ProductName, double ProductPrice, String Brand) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.Brand = Brand;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", ProductPrice=" + ProductPrice +
                ", Brand='" + Brand + '\'' +
                '}';
    }
}