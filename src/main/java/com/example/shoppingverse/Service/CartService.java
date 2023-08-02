package com.example.shoppingverse.Service;

import com.example.shoppingverse.Dto.Request.CheckoutCartRequestDto;
import com.example.shoppingverse.Dto.Request.ItemRequestDto;
import com.example.shoppingverse.Dto.Response.CartResponseDto;
import com.example.shoppingverse.Dto.Response.OrderResponseDto;
import com.example.shoppingverse.Exception.CustomerNotFoundException;
import com.example.shoppingverse.Exception.EmptyCartException;
import com.example.shoppingverse.Model.Cart;
import com.example.shoppingverse.Model.Customer;
import com.example.shoppingverse.Model.Item;
import com.example.shoppingverse.Model.Product;
import com.example.shoppingverse.Repository.CartRepository;
import com.example.shoppingverse.Repository.CustomerRepository;
import com.example.shoppingverse.Repository.ItemRepository;
import com.example.shoppingverse.Repository.ProductRepository;
import com.example.shoppingverse.Transformer.CartTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ItemRepository itemRepository;
    public CartResponseDto addItemToCart(ItemRequestDto itemRequestDto, Item item) {

        Customer customer = customerRepository.findByEmailId(itemRequestDto.getCustomerEmail());
        Product product = productRepository.findById(itemRequestDto.getProductId()).get();
        Cart cart = customer.getCart();
        List<Item> list = cart.getItemList();
        cart.setTotalPrice(cart.getTotalPrice()+product.getPrice()*itemRequestDto.getRequiredQuantity());
        item.setCart(cart);
        item.setProduct(product);
        Item savedItem = itemRepository.save(item);
        cart.getItemList().add(savedItem);
        product.getItems().add(savedItem);
        Cart savedCart = cartRepository.save(cart);
        productRepository.save(product);

        //prepare cartResponse Dto
        return CartTransformer.CartToCartResponseDto(savedCart);


    }

    public OrderResponseDto checkoutCart(CheckoutCartRequestDto checkoutCartRequestDto) {
        Customer customer = customerRepository.findByEmailId(checkoutCartRequestDto.getCustomerEmail());
        if(customer==null){
            throw new CustomerNotFoundException("customer doesn't exist");
        }

        Cart cart = customer.getCart();
        if(cart.getItemList().size()==0){
            throw new EmptyCartException("No Items exist");
        }

    }
}
