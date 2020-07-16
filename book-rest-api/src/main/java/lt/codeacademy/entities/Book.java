package lt.codeacademy.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {

    private Long id;
    private String title;
    private String author;
    private String coverPhotoURL;
    private Long isbnNumber;
    private Double price;
    private String language;
}
