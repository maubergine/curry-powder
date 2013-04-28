package org.maubergine.vindaloo.services;

import java.io.Serializable;
import java.util.List;

import org.maubergine.vindaloo.domain.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}