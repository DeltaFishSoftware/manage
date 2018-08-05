package com.DeltaFish.manage;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.pojo.Book;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class TestBooksMapper extends BeforeBooksMapper{
    @Test
  /*  public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            List<Books> Booklist =
                    sqlSession.selectList("com.DeltaFish.mapper.BooksMapper.selectAll");
            printBookList(Booklist);
        } finally{
            sqlSession.close();
        }
    }

    private void printBookList(List<Books> BookList){
        for( Books book1 : BookList){
            System.out.printf(
                    book1.getAuthor()+"\n"+
                            book1.getBookId()+"\n"+
                            book1.getBookName()+"\n"+
                            book1.getOwnerId()+"\n"+
                            book1.getLink()+"\n"
            );

        }
    }
    */
/*
    public void testFindBookById(){
        SqlSession sqlSession = getSqlSession();
        try{
            BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
            Books sysRole = roleMapper.findBookById("11111");
            System.out.print(sysRole.getBookId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
*/
/*
    public void testFindBookByAurthor(){
        SqlSession sqlSession = getSqlSession();
        try{
            BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
            Books sysRole = (Books) roleMapper.findBookByAuthor("xxx");
            System.out.print(sysRole.getBookId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    */
/*
    public void testFindBookByName(){
        SqlSession sqlSession = getSqlSession();
        try{
            BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
            Books sysRole = (Books) roleMapper.findBookByName("xxx");
            System.out.print(sysRole.getBookId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    */
/*
public void testFindBookByPress(){
    SqlSession sqlSession = getSqlSession();
    try{
        BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
        Books sysRole = (Books) roleMapper.findBookByPress("xxx");
        System.out.print(sysRole.getBookId());
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        sqlSession.close();
    }
}
*/
/*
    public void testFindBookByOwner(){
        SqlSession sqlSession = getSqlSession();
        try{
            BooksMapper roleMapper = sqlSession.getMapper(BooksMapper.class);
            Books sysRole = (Books) roleMapper.findBookByOwner("xxx");
            System.out.print(sysRole.getBookId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
*/
    public void testInsert(){
        SqlSession sqlSession = getSqlSession();
        try{
            // 获取RoleMapper接口
            BookMapper roleMapper = sqlSession.getMapper(BookMapper.class);
            Book sysRole = new Book();
            sysRole.setBookId("b11111111");
            sysRole.setBookName("西方树叶");
            sysRole.setEdition("第二版");
            sysRole.setOperation("3");
            sysRole.setOwnerId("PB16061470");
            // 新增用,返回受影响的行数
            int result = roleMapper.insertSelective(sysRole);
            System.out.print(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //sqlSession.commit(); //commit到mysql？
            sqlSession.close();
        }
    }

}
