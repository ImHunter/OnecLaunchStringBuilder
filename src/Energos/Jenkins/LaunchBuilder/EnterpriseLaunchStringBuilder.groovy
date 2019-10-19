package Energos.Jenkins.LaunchBuilder

class EnterpriseLaunchStringBuilder extends AppLaunchStringBuilder{

    def serviceEpf

    EnterpriseLaunchStringBuilder(Object common) {
        super(common)
    }

    def setServiceEpf(def pathToEpf){
        serviceEpf = pathToEpf
        this
    }

    def batLaunchAndClose(def withUpdateMetadata = null){

    }

}
