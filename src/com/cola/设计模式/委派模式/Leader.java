package com.cola.设计模式.委派模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:cola
 * Date:2020/2/20
 */
public class Leader {
    private Map<String, IEmplyee> register = new HashMap<>();

    public Leader() {
        register.put("加密", new EmployeeA());
        register.put("架构", new EmployeeB());
    }

    public void doing(String command) {
        register.get(command).doing(command);
    }
}
