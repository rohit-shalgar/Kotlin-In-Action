package `chapter6-types`


/*One of its most common uses is handling
 a nullable argument that should be passed to a function that expects a non-null parameter.

 let function will be executed if the value is not null, otherwise it won't do anything.
 */

fun sendEmail(emailAddress: String) {
    println("Email was sent...")
}

fun main() {
    var emailAddress: String? = "xyz@google.com"
    emailAddress?.let { email -> sendEmail(email) }
    emailAddress = null
    emailAddress?.let { email -> sendEmail(email) }
}