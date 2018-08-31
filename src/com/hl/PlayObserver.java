package com.hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public class PlayObserver implements Observer{
    @Override
    public void update(String msg){
        System.out.println(msg+",停止玩游戏了");
    }
}
