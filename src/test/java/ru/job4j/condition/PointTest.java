package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2dot83() {
        double expected = 2.83;
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to67then7dot07() {
        double expected = 7.07;
        Point point1 = new Point(1, 2);
        Point point2 = new Point(6, 7);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to89then12dot04() {
        double expected = 12.04;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(8, 9);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot2() {
        double expected = 5.2;
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}