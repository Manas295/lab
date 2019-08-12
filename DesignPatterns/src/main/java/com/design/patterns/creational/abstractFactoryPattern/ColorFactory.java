package com.design.patterns.creational.abstractFactoryPattern;
public class ColorFactory extends AbstractFactory{	 
   //getColor method returns object of input type color
   @Override
   Color getColor(String color) {   
      if(color == null){
         return null;
      }		
 
      if(color.equalsIgnoreCase("Red")){
         return new Red();
 
      }else if(color.equalsIgnoreCase("Green")){
         return new Green();
 
      }else if(color.equalsIgnoreCase("Blue")){
         return new Blue();
      }
 
      return null;
   }
 
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
}