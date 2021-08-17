package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("formData",new User());
        return "index";

    }

    @PostMapping("/create")
    public String processFormDate(User user, RedirectAttributes attributes){
        // Insert data submitted in the form to the database
        attributes.addFlashAttribute("user",user);
        return "redirect:/display";

    }

    @GetMapping("/display")
    public String displayFormData(User user){

        return "result";
    }




}
