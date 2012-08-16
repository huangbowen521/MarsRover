package com.thoughtworks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest {

    private Rover rover;

    @Before
    public void setup()
    {
        rover = new Rover(3, 3, Direction.NORTH);
    }

    @Test
    public void shouldGetRightPositionWhenInitARover()
    {
        //Given
        rover = new Rover(3,3,Direction.NORTH);

        //Then
        assertThat(rover.printStatus(), is("3 3 N"));

    }

    @Test
    public void shouldTurnToWestWhenGivenANorthRoverToTurnLeft()
    {
        // Given
        rover = new Rover(3, 3, Direction.NORTH);

        //When
        rover.turnLeft();

        //Then
        assertThat(rover.printStatus(), is("3 3 W"));
    }

    @Test
    public void shouldTurnToSouthWhenGivenAWestRoverToTurnLeft()
    {
        // Given
        rover = new Rover(3, 3, Direction.WEST);

        //When
        rover.turnLeft();

        //Then
        assertThat(rover.printStatus(), is("3 3 S"));
    }

    @Test
    public void shouldTurnToEastWhenGivenASouthRoverToTurnLeft()
    {
        // Given
        rover = new Rover(3, 3, Direction.SOUTH);

        //When
        rover.turnLeft();

        //Then
        assertThat(rover.printStatus(), is("3 3 E"));
    }

    @Test
    public void shouldTurnToNorthWhenGivenAEastRoverToTurnLeft()
    {
        // Given
        rover = new Rover(3, 3, Direction.EAST);

        //When
        rover.turnLeft();

        //Then
        assertThat(rover.printStatus(), is("3 3 N"));
    }
}
