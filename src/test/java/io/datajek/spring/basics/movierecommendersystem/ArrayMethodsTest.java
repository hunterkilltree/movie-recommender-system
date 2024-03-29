package io.datajek.spring.basics.movierecommendersystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodsTest {

  @Test
  public void testfindIndex_numberInArray() {
    //1. create object of the class
    ArrayMethods arrayMethods = new ArrayMethods();
    //2. call method
    int result = arrayMethods.findIndex(new int[]{8,4,5}, 4);
    //3. compare the actual results to the expected
    assertEquals(1, result);
  }

  @Test
  public void testfindIndex_numberNotInArray() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1));
  }

  @Test
  public void testfindIndex_emptyArray() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
  }


  @Test
  public void testAssert() {
    Boolean condition = true;
    assertEquals(true,true);
    assertTrue(condition);

    String str = null;
    assertEquals(null, str);
    assertNull(str);

  }

  //this test will fail because of fail method
//  @Test
//  public void testSortArray() {
//    fail("unimplemented method");
//  }

  @Test
  public void testfindIndex_indexOutOfBound() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertThrows(ArrayIndexOutOfBoundsException.class, ()->arrayMethods.printArray(new int[] {1,8,5}, 3));
  }

  @Test
  public void testfindIndex() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertAll(
        () -> assertEquals(1, arrayMethods.findIndex(new int[]{8,4,5}, 4)),
        () -> assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1)),
        () -> assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1))
    );
  }
}
