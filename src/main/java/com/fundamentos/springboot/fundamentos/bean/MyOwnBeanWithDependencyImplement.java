package com.fundamentos.springboot.fundamentos.bean;

import java.util.List;

public class MyOwnBeanWithDependencyImplement implements MyOwnBeanWithDependency {

    private MyOwnOperation myOwnOperation;

    public MyOwnBeanWithDependencyImplement(MyOwnOperation myOwnOperation) {
        this.myOwnOperation = myOwnOperation;
    }

    @Override
    public void displayElements() {
        System.out.println("Llamamos a MyOwnBeanOperationImplement para generar la lista aleatoria");
        List<Integer> rand_nums = this.myOwnOperation.generateRandomElements(500, 10);
        rand_nums.forEach(System.out::println);
        System.out.println("Hola desde mi implementación de un bean con dependencia usando Streams y Listas");
    }
}
