package co.sen.firstapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @GetMapping("/category")
    public String viewCategory(ModelMap modelMap){
        modelMap.addAttribute("editContent",
                "<h1>Category Management</h1>");
        return "category/main";
    }
}
