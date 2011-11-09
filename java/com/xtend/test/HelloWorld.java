package com.xtend.test;

import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class HelloWorld {
  public String helloWorld() {
    String _println = InputOutput.<String>println("Hello, world!");
    return _println;
  }
}
