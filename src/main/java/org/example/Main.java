package org.example;

import org.example.comprtamiento.Mediator;
import org.example.comprtamiento.Observe;
import org.example.comprtamiento.Strategy;
import org.example.creacion.Builder;
import org.example.creacion.Factory;
import org.example.creacion.Singleton;
import org.example.estructura.Adapter;
import org.example.estructura.Decorator;
import org.example.estructura.Proxy;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        Factory factory=new Factory();
        factory.ejecutarFactory();

        Builder builder=new Builder();
        builder.ejecutarBuilder();

        Singleton singleton=new Singleton();
        singleton.ejecutarSingleton();

        Adapter adapter=new Adapter();
        adapter.ejecutarAdapter();

        Decorator decorator=new Decorator();
        decorator.ejecutarDecorator();

        Proxy proxy=new Proxy();
        proxy.ejecutarProxy();

        Mediator mediator=new Mediator();
        mediator.ejecutarMediator();

        Observe observe=new Observe();
        observe.ejecutarObserver();

        Strategy strategy=new Strategy();
        strategy.ejecuatrStrategy();
    }
}