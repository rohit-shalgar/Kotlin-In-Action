package `chapter4-classes`

open class View {
    private var ctx = ""
    private var atr = ""

    constructor(ctx: String) {
        this.ctx = ctx
    }

    constructor(ctx: String, atr: String) {
        this.ctx = ctx
        this.atr = atr
    }
}

class Button : View {

    constructor(ctx: String) : this(ctx, "Style")
    constructor(ctx: String, atr: String) : super(ctx, atr)
}

open class PrimeConstrcutor(open val prime: String = "")

class PrimeConstructorExtended(override val prime: String) : PrimeConstrcutor(prime)
/*
    Classes View and Button are examples of 2dary constructors
    Primary constructors are annoted with () like PrimeConstructor class.
    also, whenever we extend a class, super class constructor has be initialized.
    eg- PrimeConstrcutor,PrimeConstructorExtended
    We dont need many overloaded methods in Kotlin as we can specify default values for
    all the arguments.
 */