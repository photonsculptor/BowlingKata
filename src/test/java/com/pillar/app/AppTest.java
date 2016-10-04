package com.pillar.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    private App app;
    

    @Before
    public void setUp() {
        this.app = new App();
    }

    @Test
    public void whenAllGutterBallsReturns0()
    {
       assertEquals(0, app.score("--------------------"));
    }
    
}
