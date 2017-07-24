package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import BaseTest.BaseJunitTest;

public class UserTest extends BaseJunitTest{
	@Autowired
	protected WebApplicationContext wac;
	protected MockMvc mockMvc;
	@Before
	public void SetUp() {
		mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
