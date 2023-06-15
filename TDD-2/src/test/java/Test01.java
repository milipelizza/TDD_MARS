import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

    @Test
    void move() {

        MarsRover prueba = new MarsRover(1, 1, "N");
        assertEquals(prueba.getXCoordinate(), 1);
        assertEquals(prueba.getYCoordinate(), 1);
        assertEquals(prueba.getDirection(), "N");

    }

    @Test
    void testPosition2(){
        MarsRover prueba = new MarsRover(2, 2, "N");
        assertEquals(prueba.getXCoordinate(), 2);
        assertEquals(prueba.getYCoordinate(), 2);
        assertEquals(prueba.getDirection(), "N");
    }

    @Test
    void checkPositionRefactor(){

        MarsRover rover = new MarsRover(1, 1, "N");
        assertTrue(rover.validatePosition(1, 1, "N"));
    }

    @Test
    void checkPositionRefactor2(){

        MarsRover rover = new MarsRover(2, 1, "N");
        assertFalse(rover.validatePosition(1, 1, "N"));
    }

    @Test
    void test05(){
        MarsRover rover = new MarsRover(1, 1, "N");
        rover.move("f");
        assertTrue(rover.validatePosition(1, 2, "N"));
    }

    @Test
    void test06(){
        MarsRover rover = new MarsRover(1, 1, "N");
        rover.move("b");
        assertTrue(rover.validatePosition(1, 0, "N"));
    }
    @Test
    void test07(){
        MarsRover rover = new MarsRover(1, 1, "N");
        rover.move("l");
        assertTrue(rover.validatePosition(1, 1, "W"));
    }

    @Test
    void Test08_IsValidPositionWhenTurnRight() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.move("r");
        assertTrue(marsRover.validatePosition(1, 1, "E"));
    }

    @Test
    void Test09_IsValidPositionWhenReceiveAnOrderWithCapitalLetter() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.move("F");
        assertTrue(marsRover.validatePosition(1, 2, "N"));
    }

    @Test
    void Test10_IsValidPositionWhenReceiveTwoOrders() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.movementOrders("fb");
        assertTrue(marsRover.validatePosition(1, 1, "N"));
    }

    @Test
    void Test11_IsValidPositionWhenReceiveThreeOrders() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.movementOrders("lfr");
        assertTrue(marsRover.validatePosition(0, 1, "N"));
    }

    @Test
    void Test12_IsValidPositionWhenReceiveTenOrders() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.movementOrders("ffrfflfrff");
        assertTrue(marsRover.validatePosition(5, 4, "E"));
    }

    @Test
    void Test13_IsValidPositionWhenReceiveSixOrders() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.movementOrders("fbblrr");
        assertTrue(marsRover.validatePosition(1, 0, "E"));
    }
}
