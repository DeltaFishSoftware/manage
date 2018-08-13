package com.DeltaFish.test;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.pojo.Book;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class TestBooksMapper extends BeforeBooksMapper {

    @Test
   public void testInsert() {
        SqlSession sqlSession = getSqlSession();
        try {
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
        } finally {
            //sqlSession.commit(); //commit到mysql？
            sqlSession.close();
        }

    }

}
