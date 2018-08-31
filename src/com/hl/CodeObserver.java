package com.hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/31
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class CodeObserver implements Observer{

    @Override
    public void update(String message){
        System.out.println(message+"，可以停止写代码了");
    }
}
