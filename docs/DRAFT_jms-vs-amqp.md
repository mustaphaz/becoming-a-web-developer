## JMS vs AMQP

Notes of the [blogpost](https://www.linkedin.com/pulse/jms-vs-amqp-eran-shaham/) of Eran Shaham on LinkedIn 

Take aways:

| JMS               | AMQP          |
|:----              |:--------------|
|API                | Protocol                                                      |
|                   | provides a description on how a message should be constructed.|

JMS:
- is a standard Java API for communicating with Message Oriented Middleware (MOM).
- is a part of the Java J2EE, and it's defined by JSR 914.
- is robust and mature.
- allows two different Java applications to communicate, those applications could be using JMS clients and yet still be able to communicate, yet kept being decoupled.


JMS allows Java components to send and receive messages reliably, with just a few lines of code, yet to be loosely coupled.

Examples of JMS messaging brokers: ActiveMQ (more popular) or HornetQ.


AMQP (*Advanced Message Queuing Protocol*) is kind of an open standard application layer protocol for delivering messages.
Examples of AMQP: RabbitMQ, Qpid or StormMQ.


AMQP provides a description on how a message should be constructed. It doesn't provide an API on how the message should be sent.