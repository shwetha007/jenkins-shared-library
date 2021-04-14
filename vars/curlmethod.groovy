def call(String url, String JFROG_ID,String bn ) {

//String resp = sh(script: "curl -u $JFROG_ID -s $url | grep uri | awk '{ print \$3 }' | sed 's+\"++g' | sed 's+/++g' | sed 's+,++g' | head -1", returnStdout: true).trim()

//return resp
 String lt
    if(bn > 1){
        lt = sh(script: "curl -u $JFROG_ID -s $url | grep uri |awk '{print \$3}'| sed 's+\"++g' | sed 's+/++g' | sed 's+,++g' |sed 's+'https:jfrgfreetst.jfrog.ioartifactoryapistorageexample-repo-local'++g' | sed 's+'Mypath2'++' | sort -u -r | head -c -1 | head -$bn | tail -1", returnStdout: true).trim();
    }else{
        lt = sh(script: "curl -u $JFROG_ID -s $url | grep uri |awk '{print \$3}'| sed 's+\"++g' | sed 's+/++g' | sed 's+,++g' |sed 's+'https:jfrgfreetst.jfrog.ioartifactoryapistorageexample-repo-local'++g' | sed 's+'Mypath2'++' | sort -u -r | head -c -1 | head -$bn", returnStdout: true).trim();
    }
    
    return lt

}
