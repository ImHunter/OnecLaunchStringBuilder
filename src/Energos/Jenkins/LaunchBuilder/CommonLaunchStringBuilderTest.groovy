package Energos.Jenkins.LaunchBuilder

class CommonLaunchStringBuilderTest extends GroovyTestCase {
    void testSetDbFromPath() {
        def b = new CommonLaunchStringBuilder()
        b.setDbFromPath('a\\b')
        assert b.dbKindOfConnectionString==CommonLaunchStringBuilder.KindOfConnectionString.ServerPath
        b.setDbFromPath('\\b')
        assert b.dbKindOfConnectionString==CommonLaunchStringBuilder.KindOfConnectionString.FilePath
        b.setDbFromPath('c:\\db')
        assert b.dbKindOfConnectionString==CommonLaunchStringBuilder.KindOfConnectionString.FilePath
    }

    void testSetDbFromConnectionString() {
        def b = new CommonLaunchStringBuilder()
        b.setDbFromConnectionString()
        assert b.dbKindOfConnectionString==CommonLaunchStringBuilder.KindOfConnectionString.ConnectionString
    }

    void testSetUserAndPassword() {
    }

    void testSetUserAndPassword1() {
    }
}
