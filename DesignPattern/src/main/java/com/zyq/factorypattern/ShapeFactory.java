package com.zyq.factorypattern;

/**
 * @author zhangyunqi
 * @date 2018/05/10
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if (null == type) {
            return null;
        }
        switch (type) {
            case "a":
                return new AaShape();
            case "b":
                return new AbShape();
        }
        return null;
    }
}
