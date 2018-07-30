package com.DeltaFish.manage;

import com.DeltaFish.pojo.TUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


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
        for(TUser user1 : TUserList){
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
}
