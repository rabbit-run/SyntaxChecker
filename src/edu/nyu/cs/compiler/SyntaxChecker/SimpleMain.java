package edu.nyu.cs.compiler.SyntaxChecker;

import java.io.*;
class SimpleMain {
  public static void main(final String[] args) throws IOException{
    String infix = args[0];
    Reader reader = new StringReader(infix);
    SimpleParser parser = new SimpleParser(reader, "args[0]");
    xtc.parser.Result result = parser.pprogram(0);
    String postfix = (String)result.semanticValue();
    System.out.println(postfix);
  }
}