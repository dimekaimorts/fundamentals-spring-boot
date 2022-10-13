package com.fundamentos.springboot.fundamentos.bean;

import org.springframework.context.annotation.Bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println("Implementacion de otra dependencia: " + myOperation.sum(4));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
