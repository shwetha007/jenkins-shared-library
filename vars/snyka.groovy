def call(String buildnumber) {
  snykSecurity additionalArguments: '--docker myimage:$buildnumber', failOnIssues: false, snykInstallation: 'mySnyk', snykTokenId: 'mySnkToken'
  echo "hi Prasad"
}
