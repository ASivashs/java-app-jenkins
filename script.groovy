def buildApp() {
    echo "Build app"
}

def testApp() {
    echo "Test app"
}

def deployApp() {
    echo "Deploy app version: ${params.VERSION}"
}


return this
