package com.zyq.factorypattern;

/**
 * @author zhangyunqi
 * @date 2018/05/10
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("a");
        shape.draw();
    }
}
