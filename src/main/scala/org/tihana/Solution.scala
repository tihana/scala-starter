package org.tihana

import org.slf4j.LoggerFactory

class Solution {

  private val logger = LoggerFactory.getLogger(classOf[Solution])

  def run(): Unit = {
    logger.info("Hello world")
  }
}

object Solution extends App {
  new Solution().run()
}
