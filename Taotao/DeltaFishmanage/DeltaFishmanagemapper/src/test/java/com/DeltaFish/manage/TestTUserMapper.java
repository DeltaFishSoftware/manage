package com.DeltaFish.manage;

import com.DeltaFish.mapper.BookMapper;
import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.Book;
import com.DeltaFish.pojo.BookExample;
import com.DeltaFish.pojo.TUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import javax.validation.Valid;
import java.util.List;

public class TestTUserMapper extends BeforeTUserMapper{
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            List<TUser> TUserList =
                    sqlSession.selectList("com.DeltaFish.mapper.TUserMapper.selectAll");
            printTUserList(TUserList);
        } finally{
            sqlSession.close();
        }
    }

    private void printTUserList(List<TUser> TUserList){
        for( TUser user1 : TUserList){
            System.out.printf(
                    user1.getUserId()+"\n"+
                    user1.getUserName()+"\n"+
                    user1.getPassword()+"\n"+
                    user1.getCredits()+"\n"+
                    user1.getEmail()+"\n"+
                    user1.getMobile()
            );

        }
    }

    @Test
    public void testInsert() {
        SqlSession session = getSqlSession();
        try {
            TUserMapper tUserMapper = session.getMapper(TUserMapper.class);
            TUser tUser = new TUser();
            tUser.setUserName("testuser");
            tUser.setUserId("PB16061470");
            tUser.setEmail("fucking");
            tUser.setPassword("1234");

            tUserMapper.insertUser(tUser);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("failed to insert");
        }finally {
            session.close();
        }
    }

}
