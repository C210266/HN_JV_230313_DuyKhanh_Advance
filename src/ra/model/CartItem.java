package ra.model;

import ra.config.InputMethods;

import java.util.List;

public class CartItem {
    private int cartItemId;
    private List<Product> products;
    private int price;
    private int quanity = 0;

    public CartItem() {
    }


    public CartItem(int cartItemId, List<Product> products, int price, int quanity) {
        this.cartItemId = cartItemId;
        this.products = products;
        this.price = price;
        this.quanity = quanity;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", products=" + products +
                ", price=" + price +
                ", quanity=" + quanity +
                '}';
    }
}
