package bloque_4;

/**
 * @author alonsocucei
 */

/**
 * Exercise: choose if the super classes should be abstract or not.
 */
public class IdentifyingAbstractClasses {}

abstract class Person {}
class Employee extends Person {}
class Customer extends Person {}

abstract class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class Ticket {}
class FlightTicket extends Ticket {}
class MovieTicket extends Ticket {}

abstract class Machine {}
class Auto extends Machine {}
class Airplane extends Machine {}