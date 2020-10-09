plugins {
  antlr
  kotlin("jvm").version("1.4.10")
  id ("com.autonomousapps.dependency-analysis").version("0.61.1-SNAPSHOT")
}

repositories {
  mavenCentral()
}

dependencies {
  antlr("org.antlr:antlr4:4.8-1")
}
