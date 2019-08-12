package com.design.patterns.creational.abstractFactoryPattern;
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}