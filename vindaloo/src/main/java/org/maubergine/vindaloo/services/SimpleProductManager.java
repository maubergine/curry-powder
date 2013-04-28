package org.maubergine.vindaloo.services;

import java.util.List;

import org.maubergine.vindaloo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleProductManager implements ProductManager {

	@Autowired
	private List<Product> products;

	@Override
    public List<Product> getProducts() {
		return products;
    }

	@Override
    public void increasePrice(int percentage) {
        for(Product product : this.getProducts()){
        	
        	double newPrice = (100.0 + percentage)/100.0 * product.getPrice().doubleValue();
        	
        	product.setPrice(newPrice);
        	
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}