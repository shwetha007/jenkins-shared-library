class envtst implements Serializable {
  static methodA() {
    def env = System.getenv()
    return env.dump()
  }
}
