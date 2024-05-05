package com.apirest.storeapi.controllers;

import com.apirest.storeapi.models.Product;
import com.apirest.storeapi.services.ProductRepository;
import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductRepository repos;

    public String showProductList(Model model) {
        List<Product> products = repos.findAll();
        model.addAttribute("produtos" products);
        return "produtos/index";
    }
}
