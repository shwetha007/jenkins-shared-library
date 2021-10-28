def call() {
  snykSecurity additionalArguments: '--docker myimage:12', failOnIssues: false, snykInstallation: 'mySnyk', snykTokenId: 'mySnkToken'
  echo "hi Prasad"
}
