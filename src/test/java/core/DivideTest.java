package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher.*;

public class DivideTest {
  @Test
  public void devide_test_instanceOF() {
	  assertThat (Calculator.divide(10, 5), instanceOf (double.class));}
	  @Test
	  public void devide_test_equalto(){
	  assertThat (Calculator.divide(20.0, 2.0, 2.0), equalTo(5.0));}
	  @Test
	  public void devide_test_close(){
		  assertThat (Calculator.divide(100, 2, 2,4), equalTo(4.0));}
	  @Test
	  public void devide_test_closec(){
		  assertThat (Calculator.divide(200, 2, 4, 5), equalTo(5.0));}
	  
	  }
  

