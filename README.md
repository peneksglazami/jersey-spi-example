# Jersey and SPI example

[![](https://img.shields.io/badge/License-Apache%202-blue.svg)](LICENSE)
![](https://github.com/peneksglazami/peneksglazami/jersey-spi-example/workflows/main.yml/badge.svg)

This repository provides an example of registering a resource class using the Java Service Provider mechanism (SPI)
in a Jersey application.

Sometimes it may be necessary to extend the functionality of an existing application without the possibility of
modifying the source code. To do this, you can use the extension mechanism that the Jersey provides. By default,
when an application is initialized, Jersey scans the classpath and looks for files that contain a list of interface
implementations. If a list of such implementations is found, it creates instances of these classes and calls the
`org.glassfish.jersey.internal.spi.AutoDiscoverable#configure` method, where you can register resource classes
(see example in `com.github.peneksglazami.ext.ResourcesAutoDiscoverable`).