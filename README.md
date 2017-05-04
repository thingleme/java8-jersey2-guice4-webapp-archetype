# java8-jersey2-guice4-webapp-archetype

Webapp archetype for starting with a new java 8, servlet 3.1, jersey 2 and guice 4 project.

Use with `mvn archetype:generate` or

```bash
mvn archetype:generate \
  -DarchetypeGroupId=me.thingle.archetypes \
  -DarchetypeArtifactId=java8-jersey2-guice4-webapp-archetype \
  -DarchetypeVersion=1.1.0
```

Once your new project is created, run command `mvn jetty:run` then go to

* http://localhost:8080/app/hello/world to see how an async json response can be generated
* http://localhost:8080/app/error to see how exceptions can be handled

If you wish to contribute to this archetype, please consider looking at the code from repo [java8-jersey2-guice4-webapp](https://github.com/thingleme/java8-jersey2-guice4-webapp), used to generate this archetype.
