import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTests {

  ListFunctions listFunctions = new ListFunctions();

  @Test
  public void testAdd() {
    //tests an empty string
    int result = listFunctions.add("");
    assertEquals(0, result);

    //tests one number
    //single digit
    result = listFunctions.add("3");
    assertEquals(3, result);
    //double digit
    result = listFunctions.add("31");
    assertEquals(31, result);

    //tests two numbers
    result = listFunctions.add("3,3");
    assertEquals(6, result);
    //double digits
    result = listFunctions.add("13,31");
    assertEquals(44, result);

    //test three numbers
    result = listFunctions.add("1,2,3");
    assertEquals(6, result);

    assertEquals(0,listFunctions.add(","),", did NOT return 0");
  }
}
