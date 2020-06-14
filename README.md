# Stop Watch
A java library that provides thread safe implimentation of stop watch

 [![GitHub license](https://img.shields.io/github/license/Priytam/stopwatch.svg)](https://github.com/Priytam/stopwatch/blob/master/LICENSE)
 [![Build Status](https://travis-ci.org/Priytam/stopwatch.svg?branch=master)](https://travis-ci.org/Priytam/stopwatch)
 [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.priytam/stopwatch/badge.svg)](https://search.maven.org/search?q=g:com.github.priytam%20AND%20a:stopwatch)
 
 [![HitCount](http://hits.dwyl.io/Priytam/stopwatch.svg?style=svg)](http://hits.dwyl.io/Priytam/stopwatch)
 [![Open Source Love svg2](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)
 [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity)

### Usage of stop watch

- Maven dependency  
```xml
<dependency>
  <groupId>com.github.priytam</groupId>
  <artifactId>stopwatch</artifactId>
  <version>1.0.0</version>
</dependency>
```

- Gradle dependency  
```groovy
compile 'com.github.priytam:stopwatch:1.0.0'
```

- Example
```text
IStopWatch stopWatch = StopWatch.create();
stopWatch.id(); // id of watch
stopWatch.start(); //Start a watch
stopWatch.elapsedMillis(); // Time elapsed till now

// Pause and Start
stopWatch.pause();
stopWatch.start();

stopWatch.restart(); // Restart a watch

stopWatch.stop(); // Stop a watch
```
