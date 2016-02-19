package gg.asdf.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {
	private HelloWorldController sut;

	@Before
	public void setUp() {
		sut = new HelloWorldController();
	}

	@Test
	public void testHelloWorld() {
		assertEquals("hello world", sut.helloWorld());
	}
}