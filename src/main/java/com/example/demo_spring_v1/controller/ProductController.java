package com.example.demo_spring_v1.controller;

import com.example.demo_spring_v1.entites.Category;
import com.example.demo_spring_v1.entites.Product;
import com.example.demo_spring_v1.service.impl.CategoryService;
import com.example.demo_spring_v1.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.netty.NettyWebServer;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "product")
@Transactional
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/save")
    public String save(){
        Set<Category> categories = new HashSet<>();
        Category category = categoryService.finbyid(1l);
        Product product = new Product();
        product.setName("demo");
        categories.add(category);
        product.setCategories(categories);
        productService.save(product);
        return "";
    }
    @GetMapping("/getAll")
    public String get(){
       List<Product> productList = productService.getList();
        return "";
    }




}
