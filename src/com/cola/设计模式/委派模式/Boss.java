package com.cola.设计模式.委派模式;

/**
 * Author:cola
 * Date:2020/2/20
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}
