package com.tradeco.hola;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestHolaGradle {
	
	@Test public void testHolaGradle() {
		HolaGradle helloWorld = new HolaGradle();
        assertEquals("Hola Gradle", helloWorld.printString());
    }
}
