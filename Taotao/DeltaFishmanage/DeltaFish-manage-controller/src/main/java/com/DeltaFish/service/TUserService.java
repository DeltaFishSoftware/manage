package com.DeltaFish.service;

public interface TUserService {

    public boolean login(String username, String password) throws Exception;

    public boolean checkUserExist(String user) throws Exception;


}