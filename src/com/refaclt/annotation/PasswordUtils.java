package com.refaclt.annotation;

/**
 * @Author LiuYang
 * @Date 2019/6/14/014  14:19
 * @Version 1.0
 **/

/**
 * 使用注解
 */
public class PasswordUtils {

    @UseCase.UseCases(id = "47",description = "password must be contains a numberic")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w");
    }

    @UseCase.UseCases(id="48")
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
}
