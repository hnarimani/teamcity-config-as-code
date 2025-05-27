version = "2023.11"

project {
    buildType(HelloWorld)
}

object HelloWorld : BuildType({
    name = "HelloWorld"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "Say Hello"
            scriptContent = "echo Hello from TeamCity Kotlin DSL"
        }
    }
})
