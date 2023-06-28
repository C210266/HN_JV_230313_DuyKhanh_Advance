package ra.service;

import ra.config.InputMethods;
import ra.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartItemService implements IService<CartItem, Integer> {
    private List<CartItem> cartItems;

    public CartItemService() {
        cartItems = new ArrayList<>();
    }

    public int getSize() {
        return cartItems.size();
    }

    @Override
    public List<CartItem> getAll() {
        return cartItems;
    }

    @Override
    public void save(CartItem cartItem) {
        if (findById(cartItem.getCartItemId()) == null) {
            cartItems.add(cartItem);

        } else {
            cartItems.set(cartItems.indexOf(findById(cartItem.getCartItemId())), cartItem);
        }
    }

    @Override
    public CartItem findById(Integer i) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getCartItemId() == i) {
                return cartItem;
            }
        }
        return null;
    }

    @Override
    public void delete(Integer i) {
        System.out.println("Nhap id cartItem ma ban muon xoa");
        int id = InputMethods.getInteger();
        cartItems.remove(findById(id));
    }
}
