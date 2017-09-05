package core;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher.*;

public class MultiplyTest {
  @Test
  public void multiplyTest() {
	  assertThat (Calculator.multiply(5, 5), instanceOf(double.class));}
@Test 
public void multipluTestq(){
	assertThat (Calculator.multiply(5, 5, 5), equalTo(25.0));}
@Test
public void multiplyTesta(){
	assertThat (Calculator.multiply(2, 2, 2, 2), equalTo (16.0));}
@Test
public void multipluTest(){
	assertThat (Calculator.multiply(100, 100, 100, 100), equalTo (10000.0));}


  }

