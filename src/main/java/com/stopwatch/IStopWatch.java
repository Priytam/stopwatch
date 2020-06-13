package com.stopwatch;

import java.io.Serializable;

/**
 * User: Priytam Jee Pandey
 * Date: 05/06/20
 * Time: 6:21 pm
 * email: mrpjpandey@gmail.ocm
 */
public interface IStopWatch extends Serializable {
	void start();

	long elapsedMillis();

	void pause();

	void restart();

	void stop();

	long id();
}
