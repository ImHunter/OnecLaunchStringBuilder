package Energos.Jenkins.LaunchBuilder

class EnterpriseLaunchStringBuilder extends AppLaunchStringBuilder{

    private def serviceEpf
    private def useThinClient = false
    private def runModeOrdinaryApplication = false

    EnterpriseLaunchStringBuilder(Object common) {
        super(common)
    }

    def setServiceEpf(def pathToEpf){
        serviceEpf = pathToEpf
        this
    }

    def setRunModeOrdinaryApplication(){
        runModeOrdinaryApplication = true
        this
    }

    def batLaunchAndClose(def withUpdateMetadata = null){
        if (serviceEpf != null)
            addParam('/Execute', serviceEpf)
        if (withUpdateMetadata==true)
            addParam('/С', 'ЗапуститьОбновлениеИнформационнойБазы')
        bat()
    }

}
