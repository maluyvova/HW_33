package core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher.*;

public class SubtractTest {
  @Test
  public void substractTest() {
	  assertThat (Calculator.substruct( 30, 20), instanceOf(double.class));}
  @Test
  public void substructTesta(){
	  assertThat (Calculator.substruct(29, 10), equalTo(19.0));}
  @Test
  public void substractTestb(){
	  assertThat (Calculator.substruct(100.0, 50.0, 25.0), equalTo (25.0));}
  @Test
  public void substractTestc(){
	  assertThat (Calculator.substruct(1000, 100, 200, 300), equalTo(45.0));
  
  }
  
  }

