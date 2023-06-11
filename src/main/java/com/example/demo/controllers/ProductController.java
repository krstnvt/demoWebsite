package com.example.demo.controllers;

import com.example.demo.Person;
import com.example.demo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    String getView(ModelMap model) {
        //model.addAttribute("product", new Product("NiceProduct", 99, "product1.png"));

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Оплачиваемый выходной", 1000, "Дополнительный выходной, оплачиваемый компанией", "Screenshot_1.png"));
        productList.add(new Product("Akropole card на 50 EUR", 500, "Карточка на шоппинг в Akropole на 50 EUR", "Screenshot_2.png"));
        productList.add(new Product("Поход в бар со своим ПМ", 1500, "Возможность сходить в бар со своим ПМ", "Screenshot_3.png"));
        productList.add(new Product("Осознанный выбор", 3000, "Возможность самому выбирать себе таски весь следующий спринт", "Screenshot_4.png"));
        productList.add(new Product("Билеты в кино", 300, "Билеты в кино на двух персон", "Screenshot_5.png"));

        model.addAttribute("product", productList);

        model.addAttribute("firstName", "Kristina");
        model.addAttribute("balance", "900 AGC Points");

        return "products";

    }
}
