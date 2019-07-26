package com.groovy.service

import com.groovy.model.User
import com.groovy.repository.UserRepository
import spock.lang.Specification

class UserServiceImplTest extends Specification {
    UserService userService
    UserRepository userRepository

    def setup(){
        userRepository = Mock()
        userService = new UserServiceImpl(userRepository)
    }
    def "GetUsers"() {
        given:
        def users = [ new User(),new User()]
        when:
        List<User> result =  userService.getUsers()
        then:
        1 * userRepository.getUsers() >> users
        result==users

    }
}
