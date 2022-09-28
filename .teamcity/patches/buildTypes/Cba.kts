package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Cba'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Cba")) {
    dependencies {
        remove(RelativeId("Dep")) {
            snapshot {
            }
        }

    }

    requirements {
        remove {
            contains("teamcity.agent.name", "Default")
        }
    }
}
