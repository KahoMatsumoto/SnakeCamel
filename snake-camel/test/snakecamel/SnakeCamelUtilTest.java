package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamel() {

		String expected = "AbcDefGhi";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, equalTo(expected));
	}
	@Test
	public void camelToSnake() {
		String expected = "abc_def_ghi";
		String actual = SnakeCamelUtil.snakeToCamelcase("AbcDefGhi");
		assertThat(actual, equalTo(expected));
	}


}
