//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.ln.blog.server.Application;
//import com.ln.blog.server.infrastructure.repository.authors.po.Author;
//import com.ln.blog.server.infrastructure.repository.authors.mapper.AuthorMapper;
//
///**
// * @author lining
// * @date 2022/2/10
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//public class DbTest {
//
//    @Autowired
//    private AuthorMapper authorMapper;
//
//    @Test
//    public void getAuthor(){
//        Author author = authorMapper.queryById(1L);
//        System.out.println(author);
//        author = new Author(2L,"wang", "wu");
//        authorMapper.insertAuthor(author);
//    }
//
//
//}
