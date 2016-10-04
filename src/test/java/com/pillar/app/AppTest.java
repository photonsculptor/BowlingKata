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
    
    @Test
    public void whenAll3sReturns60()
    {
       assertEquals(60, app.score("33333333333333333333"));
    }
    
    @Test
    public void whenNoXorSpareRolledReturnsSum()
    {
       assertEquals(59, app.score("-9128-3562--1-815233"));
    }
    
}
