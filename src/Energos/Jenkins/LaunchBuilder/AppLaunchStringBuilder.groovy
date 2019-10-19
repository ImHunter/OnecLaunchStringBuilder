package Energos.Jenkins.LaunchBuilder

class AppLaunchStringBuilder extends BasicLaunchStringBuilder {

    protected CommonLaunchStringBuilder common

    AppLaunchStringBuilder(def common){
        this.common = common
    }

    protected def getLaunchString(def launchParams = null){

        def usedParams
        if (launchParams==null)
            usedParams = params
        else
            usedParams = launchParams

        String result = ''
        def idx = 0
        usedParams.each {
            if (idx!=0)
                result = result.concat(' ')
            result = result.concat(it.toString())
            idx++
        }
        result
    }

    protected def resetParams(){

    }

}
