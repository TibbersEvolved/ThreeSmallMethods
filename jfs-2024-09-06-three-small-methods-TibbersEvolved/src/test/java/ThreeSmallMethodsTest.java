import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSmallMethodsTest {
  ThreeSmallMethods methods = new ThreeSmallMethods();

  @Test
  void isYoungShouldEvaluate30AsYoung(){
    boolean isYoung = methods.isYoung(30);
    assertTrue(isYoung);
  }

  @Test
  void isYoungShouldEvaluate99AsOld(){
    boolean isYoung = methods.isYoung(99);
    assertFalse(isYoung);
  }

  @Test
  void isYoungShouldEvaluate1AsYoung(){
    boolean isYoung = methods.isYoung(1);
    assertTrue(isYoung);
  }
  @Test
  void isYoungShouldEvaluateIfPersonIsBorn(){
    boolean isYoung = methods.isYoung(-5);
    assertFalse(isYoung);
  }


  @ParameterizedTest
  @ValueSource(strings = {
    "7001011147",
    "7001011680",
    "7311112245"

  })
  void hasLegalGenderManInSwedenShouldEvaluateToFemale(String personnummer){
    boolean legallyManInSweden = methods.hasLegalGenderManInSweden(personnummer);
    assertFalse(legallyManInSweden);

  }

  @ParameterizedTest
  @ValueSource(strings = {
    "8802020014",
    "7711134474",
    "0101010110",
    "194903016892",
  })
  void hasLegalGenderManInSwedenShouldEvaluateToMale(String personnummer){
    boolean legallyManInSweden = methods.hasLegalGenderManInSweden(personnummer);
    assertTrue(legallyManInSweden);
  }



  @Test
  void firstTwoDigitIntegerShouldBe15(){
    int[] data = {1, 2, 15, 73};
    assertEquals(15, methods.firstTwoDigitInteger(data));
  }


  @Test
  void firstTwoDigitIntegerShouldBe12(){
    int[] data = {125, 12, 0, 1};
    assertEquals(12, methods.firstTwoDigitInteger(data));
  }

  @Test
  void firstTwoDigitIntegerShouldBeMinus1WhenThereAreNone(){
    int[] data = {1};
    assertEquals(-1, methods.firstTwoDigitInteger(data));
  }

  @Test
  void firstTwoDigitIntegerShouldSkip3DigitNumbers(){
    int[] data = {100, 1, 12};
    assertEquals(12, methods.firstTwoDigitInteger(data));
  }

  @Test
  void firstTwoDigitIntegerShouldhandleNegativeNumbers(){
    int[] data = {100, 1, -17, 22};
    assertEquals(-17, methods.firstTwoDigitInteger(data));
  }
}
