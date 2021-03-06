/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.krutna.testexercise;

public class App {

  private final StringProcessor stringProcessor;
  private final RomeNumberCreator romeNumberCreator;

  App() {
    this.stringProcessor = new StringProcessor();
    this.romeNumberCreator = new RomeNumberCreator();
  }

  public final StringProcessor getStringProcessor() {
    return this.stringProcessor;
  }

  public final RomeNumberCreator getRomeNumberCreator() {
    return this.romeNumberCreator;
  }

  public static void main(String[] args) {
    App application = new App();
  }
}
