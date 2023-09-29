package mvc.demo2.controller;
import mvc.demo2.entity.BookEntity;
import mvc.demo2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Object getAllBook() {
        List<BookEntity> bookEntityList = bookRepository.findAll();

        return bookEntityList;
    }

}