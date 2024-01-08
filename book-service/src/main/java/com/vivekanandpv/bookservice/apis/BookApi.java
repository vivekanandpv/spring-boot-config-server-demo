package com.vivekanandpv.bookservice.apis;

import com.vivekanandpv.bookservice.models.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    private final Book bookInstance;

    public BookApi(
            @Value("${book.id}") int id,
            @Value("${book.title}") String title,
            @Value("${book.pages}") int pages,
            @Value("${book.price}") double price
    ) {
        this.bookInstance = new Book(
                id,
                title,
                pages,
                price
        );
    }

    @GetMapping
    public ResponseEntity<Book> get() {
        return ResponseEntity.ok(bookInstance);
    }
}
