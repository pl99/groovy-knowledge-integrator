package gki.chat

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ChatService)
class ChatServiceSpec extends Specification {

  def setup() {
  }

  def cleanup() {
  }

  void "test initialization"() {
  expect:
    service != null
  }
}
