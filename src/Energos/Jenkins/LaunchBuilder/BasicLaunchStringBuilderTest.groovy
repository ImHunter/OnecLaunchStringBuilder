package Energos.Jenkins.LaunchBuilder

class BasicLaunchStringBuilderTest extends GroovyTestCase {
    void testAddParam() {
        def b = new BasicLaunchStringBuilder()
        b.addParam(2)
        assert b.params.size()==1
    }

    void testAddParam1() {
        def b = new BasicLaunchStringBuilder()
        b.addParam(2, 2)
        assert b.params.size()==2
        assert b.params.size()!=1
    }

    void testGetLaunchString() {
        def b = new BasicLaunchStringBuilder()
        b.addParam(2, 4)
        assert b.getLaunchString().equals('2 4')
    }

    void testqStr() {
        def b = new BasicLaunchStringBuilder()
        assert b.qStr('"a"').equals('"a"')
        assert b.qStr('"a').equals('""a"')
    }

}
