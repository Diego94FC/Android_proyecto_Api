package diego.api.producto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ApiController {

    @RequestMapping("/hello")
    public String showHello(Model model){
        model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
        return "hello";
    }

}