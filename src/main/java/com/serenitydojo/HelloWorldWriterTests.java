package com.serenitydojo;

import org.testng.annotations.Test;

public class HelloWorldWriterTests {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer1 = new HelloWorldWriter();
        writer1.writeHelloWorld();
    }

}
