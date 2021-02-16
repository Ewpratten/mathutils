# Math Utilities for Java

[![Documentation](https://img.shields.io/badge/-documentation-blue)](https://ewpratten.retrylife.ca/mathutils) ![Build library](https://github.com/Ewpratten/mathutils/workflows/Build%20library/badge.svg)

`mathutils` is a utility library that has seen many revisions and improvements. The library was originally written in C/C++ by myself for use by [@frc5024](https://github.com/frc5024), but has since switched to Java. This library was once part of [frc5024/lib5k](https://github.com/frc5024/lib5k), but has been extracted into its own codebase, since I rely on the contents a fair bit in my personal projects.

The goal of this library is to provide a few small and simple functions to speed up software development involving linear transformations and basic trigonometry. Real-world uses of this library include:

 - Many of my grade 11 and 12 computer science projects
 - A few hobby video games
 - The autonomous navigation system used by [@frc5024](https://github.com/frc5024) on their robots
 - Trajectory calculation tools used by [@frc5024](https://github.com/frc5024) on their robots

## Using in your project

**Step 1.** Add the RetryLife maven server to your `build.gradle` file:

```groovy
repositories {
    maven { 
        name 'retrylife-release'
        url 'https://release.maven.retrylife.ca/' 
    }
}
```

**Step 2.** Add this library as a dependency:

```groovy
dependencies {
    implementation 'ca.retrylife:mathutils:1.+'
    implementation 'ca.retrylife:mathutils:1.+:sources'
    implementation 'ca.retrylife:mathutils:1.+:javadoc'
}
```

## Credits

The contents of this library have been developed my myself with help from [@ExVacuum](https://github.com/ExVacuum) and [@hyperliskdev](https://github.com/hyperliskdev).