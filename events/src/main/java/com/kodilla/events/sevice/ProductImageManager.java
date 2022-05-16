package com.kodilla.events.sevice;

import com.kodilla.events.event.ProductRegisteredEvent;
import org.springframework.context.ApplicationListener;

public class ProductImageManager implements ApplicationListener<ProductRegisteredEvent> {
    @Override
    public void onApplicationEvent(ProductRegisteredEvent event) {
        System.out.println("Processing image of " + event.getProductName());
        System.out.println("The graphics is: " + event.getOtherData());
    }
}
