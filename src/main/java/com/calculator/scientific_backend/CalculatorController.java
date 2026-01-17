package com.calculator.scientificbackend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CalculatorController {

    @GetMapping("/calculate")
    public double calculate(@RequestParam String operation, @RequestParam double number) {
        return switch (operation.toLowerCase()) {
            case "sin" -> Math.sin(Math.toRadians(number));
            case "cos" -> Math.cos(Math.toRadians(number));
            case "tan" -> Math.tan(Math.toRadians(number));
            case "log" -> Math.log10(number);
            case "sqrt" -> Math.sqrt(number);
            default -> 0.0;
        };
    }
}