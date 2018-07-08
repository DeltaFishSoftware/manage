package com.DeltaFish.manage;

import com.DeltaFish.mapper.TUserMapper;
import com.DeltaFish.pojo.TUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class TestTUserMapper extends BeforeTUserMapper{
     @Test
     //test intetface insertUser
     public void testSelectAll(){
         SqlSession sqlSession = getSqlSession();
         try{
             // 获取RoleMapper接口
             TUserMapper roleMapper = sqlSession.getMapper(TUserMapper.class);
             TUser sysRole = new TUser();
             sysRole.setUserId("PB11111111");
             sysRole.setUserName("小工匠");
             sysRole.setEmail("czk654@mail.ustc.edu.cn");
             sysRole.setPassword("123456789");
             // 新增用户 ,返回受影响的行数
             int result = roleMapper.insertUser(sysRole);
             System.out.print(result);
         } catch (Exception e) {
             e.printStackTrace();
         } finally{
             //sqlSession.commit(); //commit到mysql？
             sqlSession.close();
         }
     }
     /*test interfatce "selectAll"
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
                    user1.getMobile()+"\n"
            );

        }
    }
    */
}
