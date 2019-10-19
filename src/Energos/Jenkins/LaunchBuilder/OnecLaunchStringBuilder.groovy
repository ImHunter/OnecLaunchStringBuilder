package Energos.Jenkins.LaunchBuilder

class OnecLaunchStringBuilder{

    def common
    def designer
    def enterprise

    OnecLaunchStringBuilder() {
        common = new CommonLaunchStringBuilder()
        designer = new DesignerLaunchStringBuilder(common)
        enterprise = new EnterpriseLaunchStringBuilder(common)
    }

}
