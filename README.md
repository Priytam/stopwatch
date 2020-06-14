# Stop Watch
A java library that provides thread safe implimentation of stop watch

### Usage of stop watch

Maven dependency  
```xml
<dependency>
  <groupId>com.github.priytam</groupId>
  <artifactId>stopwatch</artifactId>
  <version>1.0.0</version>
</dependency>
```

Gradle dependency  
```groovy
compile 'com.github.priytam:stopwatch:1.0.0'
```

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
