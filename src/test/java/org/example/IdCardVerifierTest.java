package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import org.junit.jupiter.api.Test;

class IdCardVerifierTest {

  // create an arrays store test data
  String[][] testData = {
      {"001091266777", "Hà Nội", "Nam", "1991"},
      {"001192908765", "Hà Nội", "Nữ", "1992"},
      {"001093123456", "Hà Nội", "Nam", "1993"},
      {"001194456654", "Hà Nội", "Nữ", "1994"},
      {"001095456789", "Hà Nội", "Nam", "1995"},
      {"001196789987", "Hà Nội", "Nữ", "1996"},
      {"001097333333", "Hà Nội", "Nam", "1997"},
      {"001198123457", "Hà Nội", "Nữ", "1998"},
      {"001099986432", "Hà Nội", "Nam", "1999"},
      {"001300121323", "Hà Nội", "Nữ", "2000"},
      {"001201323232", "Hà Nội", "Nam", "2001"},
      {"001302323232", "Hà Nội", "Nữ", "2002"},
      {"001203323232", "Hà Nội", "Nam", "2003"},
      {"001304323232", "Hà Nội", "Nữ", "2004"},
      {"001205323232", "Hà Nội", "Nam", "2005"},
      {"001306323233", "Hà Nội", "Nữ", "2006"},
      {"001207488585", "Hà Nội", "Nam", "2007"},
      {"001308436577", "Hà Nội", "Nữ", "2008"},
      {"001209875434", "Hà Nội", "Nam", "2009"},
      {"001310654768", "Hà Nội", "Nữ", "2010"},
      {"001211757462", "Hà Nội", "Nam", "2011"},
      {"001312776655", "Hà Nội", "Nữ", "2012"},
      {"001213757568", "Hà Nội", "Nam", "2013"},
      {"001214874724", "Hà Nội", "Nam", "2014"},
      {"001215875836", "Hà Nội", "Nam", "2015"},
      {"001216376888", "Hà Nội", "Nam", "2016"},
      {"001217253643", "Hà Nội", "Nam", "2017"},
      {"001218654523", "Hà Nội", "Nam", "2018"},
      {"001219515111", "Hà Nội", "Nam", "2019"},
      {"001220531534", "Hà Nội", "Nam", "2020"},
  };
  @Test
  public void testIsValidIdWithInvalidInput() {
    assertFalse(IdCardVerifier.isValidId(null));
    assertFalse(IdCardVerifier.isValidId("000"));
    assertFalse(IdCardVerifier.isValidId("01238473947592347859"));
    assertFalse(IdCardVerifier.isValidId("abcd1123"));
  }

  @Test
  public void testValidIdWithValidInput() {

    assertTrue(IdCardVerifier.isValidId("012345678911"));
    assertTrue(IdCardVerifier.isValidId("012345678912"));
    assertTrue(IdCardVerifier.isValidId("012345678913"));
    assertTrue(IdCardVerifier.isValidId("012345678914"));
    assertTrue(IdCardVerifier.isValidId("012345678915"));


  }

  @Test
  public void testGetProvinceName() {
    assertEquals("Cần Thơ", IdCardVerifier.getProvinceName("054"));
    assertEquals("Unknown", IdCardVerifier.getProvinceName("999"));
    // test the province name from testData
    assertEquals("Hà Nội", IdCardVerifier.getProvinceName("001"));
    assertEquals(testData[0][1], IdCardVerifier.getProvinceName(testData[0][0]));
    assertEquals(testData[1][1], IdCardVerifier.getProvinceName(testData[1][0]));
    assertEquals(testData[2][1], IdCardVerifier.getProvinceName(testData[2][0]));
    assertEquals(testData[15][1], IdCardVerifier.getProvinceName(testData[15][0]));

  }
  @Test
  public void testSexCode() {

    assertEquals("Nam", IdCardVerifier.getSexCode("056078999999"));
    assertEquals("Nữ", IdCardVerifier.getSexCode("056178999998"));
    assertEquals("Nữ", IdCardVerifier.getSexCode("056309999997"));
    //test the sex code from testData
    assertEquals(testData[0][2], IdCardVerifier.getSexCode(testData[0][0]));
    assertEquals(testData[1][2], IdCardVerifier.getSexCode(testData[1][0]));
    assertEquals(testData[2][2], IdCardVerifier.getSexCode(testData[2][0]));
    assertEquals(testData[15][2], IdCardVerifier.getSexCode(testData[15][0]));
    assertEquals(testData[16][2], IdCardVerifier.getSexCode(testData[16][0]));
    assertEquals(testData[17][2], IdCardVerifier.getSexCode(testData[17][0]));

  }
  @Test
  public void testYearOFBirth() {
    assertEquals("1991", IdCardVerifier.getYearOfBirth("056091999999"));
    assertEquals("1992", IdCardVerifier.getYearOfBirth("056192999998"));
    assertEquals("2009", IdCardVerifier.getYearOfBirth("056309999997"));
    //test the year of birth from testData
    assertEquals(testData[0][3], IdCardVerifier.getYearOfBirth(testData[0][0]));
    assertEquals(testData[1][3], IdCardVerifier.getYearOfBirth(testData[1][0]));
    assertEquals(testData[2][3], IdCardVerifier.getYearOfBirth(testData[2][0]));
    assertEquals(testData[15][3], IdCardVerifier.getYearOfBirth(testData[15][0]));
    assertEquals(testData[16][3], IdCardVerifier.getYearOfBirth(testData[16][0]));
    assertEquals(testData[17][3], IdCardVerifier.getYearOfBirth(testData[17][0]));
  }

  @Test
  public void testMain() {
    testMainForId("054078890890", "Cần Thơ");
  }

  private void testMainForId(String id, String expectedProvince) {
    assertTrue(IdCardVerifier.isValidId(id));
    assertEquals(expectedProvince, IdCardVerifier.getProvinceName(id));

  }
}