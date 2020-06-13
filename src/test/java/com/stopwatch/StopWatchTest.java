package com.stopwatch;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: Priytam Jee Pandey
 * Date: 13/06/20
 * Time: 10:32 pm
 * email: priytam.pandey@cleartrip.com
 */
public class StopWatchTest {

    @Test
    public void shouldStart() {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.RUNNING);
    }

    @Test
    public void shouldPause() {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        stopWatch.pause();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.PAUSED);
    }

    @Test
    public void shouldResume() {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        stopWatch.pause();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.PAUSED);
        stopWatch.start();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.RUNNING);
    }

    @Test
    public void shouldStop() {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        stopWatch.pause();
        stopWatch.stop();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.STOPPED);
    }

    @Test
    public void shouldCreateAndStart() {
        StopWatch stopWatch = (StopWatch) StopWatch.createAndStart();
        Assert.assertEquals(stopWatch.getState(), StopWatch.State.RUNNING);
    }

    @Test
    public void shouldRestart() throws InterruptedException {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        Thread.sleep(6000);
        long l = stopWatch.elapsedMillis();
        stopWatch.restart();
        Assert.assertTrue(l > stopWatch.elapsedMillis());
    }

    @Test
    public void shouldResumeFromPausedTime() throws InterruptedException {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        Thread.sleep(2000);
        stopWatch.pause();
        long savedElapsedTime = stopWatch.elapsedMillis();
        stopWatch.start();
        Thread.sleep(2000);
        Assert.assertTrue(stopWatch.elapsedMillis() >= savedElapsedTime + 2000);
    }

    @Test
    public void watchShouldHaveSameTimeBeforeAndAfterPause() throws InterruptedException {
        StopWatch stopWatch = (StopWatch) StopWatch.create();
        stopWatch.start();
        stopWatch.pause();
        long l = stopWatch.elapsedMillis();
        Thread.sleep(6000);
        Assert.assertEquals(l, stopWatch.elapsedMillis());
    }
}