def call() {
  int Bnumber = sh(script: "curl -u $JFROG_ID -s $url | grep uri |awk '{print \$3}'| sed 's+\"++g' | sed 's+/++g' | sed 's+,++g' |wc -l",returnStdout: true).trim()
  return Bnumber
}
