public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private String category;
    public Product(int productid,String productname,String category){
        this.productId = productid;
        this.productName = productname;
        this.category = category;
    }

    public int getproductid(){
        return this.productId;
    }

    public String getproductname(){
        return this.productName;
    }

    public String getcategroy(){
        return this.category;
    }

    @Override
    public String toString() {
        return "Product [ID=" + productId + ", Name=" + productName + ", Category=" + category + "]";
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
}