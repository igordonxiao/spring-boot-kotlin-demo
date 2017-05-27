package io.github.igordonxiao.springboot.kotlin.controller

import io.github.igordonxiao.springboot.kotlin.dao.IUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
open class IndexController @Autowired constructor(val userRepository: IUserRepository) {

    @RequestMapping
    @ResponseBody
    fun index(): String {
        val user = userRepository.findOne(1)
        return "Hello ${user.name}"
    }
}

@Controller
@RequestMapping("main")
open class MainController {

    @RequestMapping
    @ResponseBody
    fun main() = "main"
}
