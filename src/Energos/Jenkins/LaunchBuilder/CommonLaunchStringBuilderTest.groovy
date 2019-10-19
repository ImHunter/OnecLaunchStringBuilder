package Energos.Jenkins.LaunchBuilder

class CommonLaunchStringBuilderTest extends GroovyTestCase {
    void testSetDbFromPath() {
        def b = new CommonLaunchStringBuilder()
        b.setDbFromPath()
    }

    void testSetDbFromConnectionString() {
        def b = new CommonLaunchStringBuilder()
        b.setDbFromConnectionString()
    }

    void testSetUserAndPassword() {
    }

    void testSetUserAndPassword1() {
    }
}
