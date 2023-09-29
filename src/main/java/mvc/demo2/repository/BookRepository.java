package mvc.demo2.repository;
import mvc.demo2.entity.BookEntity;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepository {
private List<BookEntity> bookList = new ArrayList();
@PostConstruct
    public void init(){
    bookList.add(new BookEntity(1,"Java A-Z",13.2,"Roger"));
    bookList.add(new BookEntity(2,".Net tutorial",22.1,"Peter"));

    }
    public List<BookEntity> findAll(){
        return bookList;
    }
}