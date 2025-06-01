package de.htwberlin.webtech.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*") // oder spezifisch mit Render-URL
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Test";
    }

}
