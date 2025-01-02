package com.cursojava.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/books")
public class Rutas {

    @GetMapping("/")
    public String index() {
        return "¡Hola mundo!";
    }

    @GetMapping("/{bookId}")
    public  String libros(@PathVariable("bookId") Long bookId) {
        return "El id es: " + bookId;
    }
}