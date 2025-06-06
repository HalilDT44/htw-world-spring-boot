package de.htwberlin.webtech.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://webtech-frontend-gmy6.onrender.com") // oder "*"
@RestController
@RequestMapping("/api")
public class FruitController {
    @GetMapping("/fruits")
    @CrossOrigin(origins = "https://webtech-frontend-gmy6.onrender.com")
    public List<String> getFruits() {
        return List.of("Apple", "Banana", "Cherry");
    }
}
