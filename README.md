# quarkus-smallry-jwt warning

- Requires JAVA 11


```
./gradlew quarkusDev
> Task :processResources UP-TO-DATE
> Task :quarkusGenerateCode UP-TO-DATE
> Task :quarkusGenerateCodeDev UP-TO-DATE
> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :classes UP-TO-DATE
> Task :jar UP-TO-DATE
> Task :inspectClassesForKotlinIC UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :quarkusGenerateCodeTests UP-TO-DATE
> Task :compileTestKotlin NO-SOURCE
> Task :compileTestJava NO-SOURCE
> Task :testClasses UP-TO-DATE

> Task :quarkusDev
Listening for transport dt_socket at address: 5005
Press [h] for more options>
Tests paused
Press [r] to resume testing, [h] for more options>
Press [r] to resume testing, [o] Toggle test output, [h] for more options>
2022-12-01 16:32:42,689 WARN  [io.qua.sma.jwt.dep.SmallRyeJwtProcessor] (build-37) Cannot determine null of mp.jwt.verify.publickey.location to register with the native image
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2022-12-01 16:32:44,443 INFO  [io.quarkus] (Quarkus Main Thread) quarkus-smallrye-jwt-warning 1.0.0-SNAPSHOT on JVM (powered by Quarkus 2.14.2.Final) started in 2.186s. Listening on: http://localhost:8080
2022-12-01 16:32:44,443 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2022-12-01 16:32:44,443 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, config-yaml, kotlin, reactive-routes, resteasy-reactive, resteasy-reactive-jackson, security, smallrye-context-propagation, smallrye-jwt, vertx]
```
