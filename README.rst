==================================
unfiltered-scalatest
==================================

This moves the functionality till now avaiable only as branch scalatest in ppurang/Unfiltered.
See src/main/test/scala for a demo of Unfiltered scalatest support. The ExampleApp was seeded
using `Unfiltered g8 Template`_

Changes
=====

1. The example app was modified to make it a bit more interesting
2. The ``App`` was changed to send a ``Bad Request`` (400) for invalid parameters
   which was surprisingly easy to achieve. Line ``32`` was prefixed with ::

        BadRequest ~>

Usage
=====

Start sbt_ and run the commands ::

    > ;update;run

to play with the app in the browser @ http://localhost:8080. Or the command ::

    > test

to run the tests.

Attribution
=====

1. anti-xml_ for this readme's template
2. `Unfiltered g8 Template`_ for the excellent template for quick start


.. _Unfiltered g8 Template: https://github.com/softprops/unfiltered.g8
.. _anti-xml: https://github.com/djspiewak/anti-xml
.. _sbt: http://code.google.com/p/simple-build-tool/wiki/Setup

