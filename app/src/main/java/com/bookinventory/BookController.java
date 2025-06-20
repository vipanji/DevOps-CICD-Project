package com.bookinventory;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final Map<Integer, String> books = new HashMap<>();

    @PostMapping("/{id}")
    public String addBook(@PathVariable int id, @RequestBody String name) {
        books.put(id, name);
        return "Book added.";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable int id) {
        return books.getOrDefault(id, "Book not found.");
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody String name) {
        books.put(id, name);
        return "Book updated.";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        books.remove(id);
        return "Book deleted.";
    }
}
