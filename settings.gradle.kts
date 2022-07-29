import java.io.FileInputStream
import java.util.*

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        val githubProperties = Properties()
        githubProperties.load(FileInputStream("github.properties"))
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/green7night/github-packages-sample-android-library")
            credentials {
                username = githubProperties.get("github_username") as String? ?: System.getenv("github_username")
                password = githubProperties.get("github_access_token") as String? ?: System.getenv("github_access_token")
            }
        }
    }
}
rootProject.name = "github-packages-sample-android-app"
include(":app")