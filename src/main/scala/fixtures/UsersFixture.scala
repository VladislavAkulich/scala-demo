package fixtures

trait User {
  val username: String
  val password: String
}

trait Users {
  object StandardUser extends User {
    val username = "standard_user"
    val password = "secret_sauce"
  }
}
