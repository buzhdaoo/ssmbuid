import com.chen.pojo.Books;
import com.chen.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void MyTest(){
        ApplicationContext context= new ClassPathXmlApplicationContext ("applicationContext.xml");
        BookService booksService= (BookService) context.getBean ("BookServiceImpl");
        for (Books books : booksService.queryAllBook ( )) {
            System.out.println (books );
        }


    }
}
