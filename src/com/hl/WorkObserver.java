package com.hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class WorkObserver implements Observer{
    @Override
    public void update(String msg){
        System.out.println(msg+ ",可以停止工作了");
    }

}
