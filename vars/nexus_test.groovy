package org.foo
class Utilities {
  static def mvn(script, args) {
    script.sh "${script.tool 'mvn'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
  }
}
