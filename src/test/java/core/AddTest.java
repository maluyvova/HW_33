package core;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher.*;
public class AddTest {
@ Test
public void add_test_instatnceOf(){
	assertThat (Calculator.add(2, 2),  instanceOf(double.class));}
	@Test
	public void add_test_equalTo(){
		assertThat (Calculator.add(5.0 , 5.0), equalTo(15.0));}
	 @Test
	 public void add_test_equal(){
	 assertThat (Calculator.add (4.0,5.0,6.0,6.0), equalTo(21.0));}
		@ Test
		public void add_test_close(){
			assertThat (Calculator.add(5.0, 3.0, 4.0), equalTo (12.0));}
		

}
	
	
	
	
	
	

