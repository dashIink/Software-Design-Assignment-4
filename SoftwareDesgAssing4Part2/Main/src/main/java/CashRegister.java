import java.util.ArrayList;

public class CashRegister {
    static int currentProduct;
    static ProductDB products;
    public CashRegister(){
        products = new ProductDB();
    }


    public static void setCurrentProductUPC(int x){
        currentProduct = x;
        Product printProduct = getCurrentProductInfo();
        Display.updateDisplay(printProduct.getName(), printProduct.getPrice());

    }
    public static Product getCurrentProductInfo(){
        return products.GetProductInfo(currentProduct);
    }

}
