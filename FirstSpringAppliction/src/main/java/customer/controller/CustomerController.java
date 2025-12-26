package customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import customer.model.Customer;
import customer.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/register")
    public String form(Model model) {
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer) {
        service.register(customer);
        return "success";
    }
}

