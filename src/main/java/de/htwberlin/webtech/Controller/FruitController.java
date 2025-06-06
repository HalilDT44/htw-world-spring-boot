package de.htwberlin.webtech.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*") // für CORS, ggf. Render-Domain angeben
@RestController
@RequestMapping("/api")
public class FruitController {

    @GetMapping("/fruits")
    public List<String> getFruits() {
        return List.of("Apple", "Banana", "Cherry");
    }
}
