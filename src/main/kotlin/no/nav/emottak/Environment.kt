package no.nav.emottak

data class Environment(

    val applicationPort: Int = getEnvVar("APPLICATION_PORT", "8080").toInt()
)

data class VaultCredentials(
    val databaseUsername: String,
    val databasePassword: String

)

fun getEnvVar(varName: String, defaultValue: String? = null) =
    System.getenv(varName) ?: defaultValue ?: throw RuntimeException("Missing required variable \"$varName\"")
