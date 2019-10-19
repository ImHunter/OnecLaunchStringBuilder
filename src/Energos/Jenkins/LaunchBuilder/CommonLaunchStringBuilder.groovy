package Energos.Jenkins.LaunchBuilder

class CommonLaunchStringBuilder extends BasicLaunchStringBuilder{

    private enum KindOfConnectionString {
        FilePath,
        ServerPath,
        WS,
        ConnectionString,
        IBName
    }

    private def dbKindOfConnectionString = null
    private def dbConnectionString = null

    private def userName = null
    private def userPassword = null
    private def userBySystem = true
    private def pathToBin

    def disableStartupDialogs = true
    def disableStartupMessages = true
    def ucCode = ''

    @Override
    def buildParams() {

    }

    def setDbFromPath(def path){
        if (path.toString().contains('\\'))
            dbKindOfConnectionString = KindOfConnectionString.ServerPath
        else
            dbKindOfConnectionString = KindOfConnectionString.FilePath
        dbConnectionString = path
        this
    }

    def setDbFromConnectionString(def connStr){
        dbKindOfConnectionString = KindOfConnectionString.ConnectionString
        dbConnectionString = connStr
        this
    }

    def setDbFromWS(def ws){
        dbKindOfConnectionString = KindOfConnectionString.WS
        dbConnectionString = ws
        this
    }

    def setDbFromIBName(def ibName){
        dbKindOfConnectionString = KindOfConnectionString.IBName
        dbConnectionString = ibName
        this
    }

    def setUserAndPassword(def uName, def uPwd = null){
        assert uName!=null
        userName = uName
        if (uPwd!=null)
            userPassword = uPwd
        userBySystem = false
    }

    def setUCCode(def ucCode){
        this.ucCode = ucCode
    }

    def setPathToBin(def pathToBin){
        this.pathToBin = pathToBin
    }

}

