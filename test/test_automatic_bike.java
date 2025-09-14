
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

 public class test_automatic_bike {
    @Test
    public void testAutomaticBikeStatusOff() {
        String actual = AutomaticBike.switchOff("Off");
        String expected = "Yes Bike Is Off";
        assertEquals(expected, actual);
    }

     @Test
     public void testAutomaticBikeStatusOn() {
         String actual = AutomaticBike.switchOn("On");
         String expected = "Yes Bike Is On";
         assertEquals(expected, actual);
     }

     //acceleration test
     @Test
     public void testAutomaticBikeStatusInGearOne() {
         double actual = AutomaticBike.enterGearOne(10);
         double expected = (Math.pow(16, 2) - Math.pow(15, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }
     @Test
     public void testAutomaticBikeStatusInGearTwo() {
         double actual = AutomaticBike.enterGearTwo(23);
         double expected = (Math.pow(26, 2) - Math.pow(24, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }

     @Test
     public void testAutomaticBikeStatusInGearThree() {
         double actual = AutomaticBike.enterGearThree(34);
         double expected = (Math.pow(38, 2) - Math.pow(35, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }

     @Test
     public void testAutomaticBikeStatusInGearFour() {
         double actual = AutomaticBike.enterGearFour(45);
         double expected = (Math.pow(48, 2) - Math.pow(44, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }


     //deceleration test

     @Test
     public void testAutomaticBikeDecreaseInGearOne() {
         double actual = AutomaticBike.decreaseGearOne(10);
         double expected = (Math.pow(14, 2) - Math.pow(15, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }

     @Test
     public void testAutomaticBikeDecreaseInGearTwo() {
         double actual = AutomaticBike.decreaseGearTwo(25);
         double expected = (Math.pow(22, 2) - Math.pow(24, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }

     @Test
     public void testAutomaticBikeDecreaseInGearThree() {
         double actual = AutomaticBike.decreaseGearThree(36);
         double expected = (Math.pow(32, 2) - Math.pow(35, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }

     @Test
     public void testAutomaticBikeDecreaseInGearFour() {
         double actual = AutomaticBike.decreaseGearFour(53);
         double expected = (Math.pow(40, 2) - Math.pow(44, 2)) / (2 * 50);
         assertEquals(expected, actual);
     }










 }