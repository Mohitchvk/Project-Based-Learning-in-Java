package assignment2.q5;

import static org.junit.Assert.*;

import java.util.ArrayList;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTest {
    Question5 e = new Question5();
    ArrayList<String> list = new ArrayList<>();
    {
        list.add("Bob");
        list.add("Alice");
        list.add("John");
    }


//	@Before
//	void before() {
//		System.out.println("before");
//	}
//
//	@After
//	void after() {
//		System.out.println("after");
//	}

    @Test
    void testFindName() {
        System.out.println(list);
        assertEquals("Result", "FOUND", e.findName(list, "Alice"));
        System.out.println("test");
    }

}