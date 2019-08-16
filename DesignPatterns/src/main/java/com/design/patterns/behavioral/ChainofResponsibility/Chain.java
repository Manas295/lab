package com.design.patterns.behavioral.ChainofResponsibility;
interface Chain 
{ 
    public void setNext(Chain nextInChain); 
    public void process(Number request); 
} 