package com.example.demo_spring_v1.controller;

import com.example.demo_spring_v1.dto.CartDto;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Homepage {
    @GetMapping("/index")
    public String home(HttpSession session, HttpServletResponse response){
        List<CartDto> cartDtos = new ArrayList<>();
        cartDtos.add(new CartDto(1,"quần đùi",2,1000));
        cartDtos.add(new CartDto(2,"áo",3,500));
        session.setAttribute("count",cartDtos);
        return "demo";
    }
    @GetMapping("/getsession")
    public String getSession(HttpSession session, HttpServletRequest request, Model model){


       List<CartDto> cartDtos = (List<CartDto>) session.getAttribute("count");
        model.addAttribute("cart",cartDtos);
        return "detailCart";

    }
    @GetMapping("/addToCart")
    public String addToCart(HttpSession session){
        session.getAttribute("count");
        return "";
    }
}
