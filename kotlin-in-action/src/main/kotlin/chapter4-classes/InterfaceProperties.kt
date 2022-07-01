package `chapter4-classes`


fun getFacebookName(accountId: Int): String = accountId.toString()


/*
    Interface can have properties
    if no getter is provided, then those properties must be overridden in subclasses.
        - through constctor(PrivateUser), getter(SubscribedUser), some custom method(FaceBookUser)
 */
interface InterfaceProperties {
    val nickName: String
    val address: String
        get() = "India"
}

class PrivateUser(override val nickName: String) : InterfaceProperties

class SubscribedUser(private val email: String) : InterfaceProperties {
    override val nickName: String
        get() = email.substringAfter("@")
}

class FaceBookUser(private val accountId: Int) : InterfaceProperties {
    override val nickName: String
        get() = getFacebookName(accountId)
}