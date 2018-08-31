package com.hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {
    void notifySubject();
    void addObserver(Observer ob);
    void deleteObserver(Observer ob);
}
