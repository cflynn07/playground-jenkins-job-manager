job('DSL-Tutorial-1-Test') {
  scm {
    git('git://github.com/cflynn07/simple-producer-consumer.git')
  }
  triggers {
    scm('*/15 * * * *')
  }
  steps {
    shell('whoami')
  }
}
