package fixtures

trait User {
  val username: String
  val password: String
  val firstName: String
  val lastName: String
  val zip: String
}

trait Users {
  object StandardUser extends User {
    val username = "standard_user"
    val password = "secret_sauce"
    val firstName = "Harry"
    val lastName = "Potter"
    val zip = "220000"

    override def toString() : String = {
      return s"\n first name: ${firstName}\n lastname: ${lastName}\n zip: ${zip}\n";
    }
  }
}
