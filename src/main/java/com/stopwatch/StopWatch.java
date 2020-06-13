package com.stopwatch;

import EDU.oswego.cs.dl.util.concurrent.SynchronizedLong;

/**
 * User: Priytam Jee Pandey
 * Date: 05/06/20
 * Time: 6:21 pm
 * email: mrpjpandey@gmail.ocm
 */
public class StopWatch implements IStopWatch {
    private static final long serialVersionUID = 6035643693870755049L;
    private static final SynchronizedLong currentID = new SynchronizedLong(0);
    private long id = 0L;
    private State state = State.STOPPED;
    private long savedElapsedTime = 0L;
    private long startTime = 0L;

    private StopWatch() {
        super();
        setId(currentID.increment());
    }

    public enum State implements INamedEnum {
        STOPPED("Stopped"),
        RUNNING("Running"),
        PAUSED("Paused");

        private String name;

        State(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

    }

    public static IStopWatch create() {
        return new StopWatch();
    }

    public static IStopWatch createAndStart() {
        IStopWatch stopWatch = create();
        stopWatch.start();
        return stopWatch;
    }

    @Override
    public void start() {
        if (isRunning()) {
            return;
        }

        setStartTime(now());
        setState(State.RUNNING);
    }

    @Override
    public long elapsedMillis() {
        long savedElapsed = getSavedElapsedTime();

        if (!isRunning()) {
            return savedElapsed;
        }

        return (now() - getStartTime() + savedElapsed);
    }

    @Override
    public void pause() {
        if (!isRunning()) {
            return;
        }

        setSavedElapsedTime(elapsedMillis());
        setState(State.PAUSED);
    }

    @Override
    public void restart() {
        boolean wasRunning = isRunning();
        stop();

        if (wasRunning) {
            start();
        }
    }

    @Override
    public long id() {
        return id;
    }

    @Override
    public void stop() {
        setSavedElapsedTime(0);
        setStartTime(0);
        setState(State.STOPPED);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private void setId(long id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public long getSavedElapsedTime() {
        return savedElapsedTime;
    }

    public void setSavedElapsedTime(long savedElapsedTime) {
        this.savedElapsedTime = savedElapsedTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    private boolean isRunning() {
        return getState() == State.RUNNING;
    }

    @Override
    public String toString() {
        return "StopWatch: " + elapsedMillis() + " [" + getState() + "]";
    }
}
