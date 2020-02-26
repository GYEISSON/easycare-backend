package edu.eci.arsw.easycare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @GetMapping("")
    public String holaMundo(Model model){
        return "hola";
    }
}
