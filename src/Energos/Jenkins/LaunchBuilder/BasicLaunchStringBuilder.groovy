package Energos.Jenkins.LaunchBuilder

class BasicLaunchStringBuilder{

    protected def params = []

    protected static def qStr(def str){
        def res = str
        if (str != null) {
            res = str.toString()
            def needQuote = res.contains(' ') && (!res.startsWith('"') || !res.endsWith('"'))
            if (needQuote)
                res = '"'.concat(res).concat('"')
        }
        res
    }

    def addParam(def paramKey, def paramValue = null){
        params.add(qStr(paramKey))
        if (paramValue!=null)
            params.add(qStr(paramValue))
        this
    }

    def buildParams(){
        params.clear()
    }

}