package io.github.igordonxiao.springboot.kotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
open class IndexController {

    @RequestMapping
    @ResponseBody
    fun index(@RequestParam(required = false) name: String?): String {
        return "Hello ${name ?: "Gordon"}"
    }
}

@Controller
@RequestMapping("main")
open class MainController {

    @RequestMapping
    @ResponseBody
    fun main() = "main"
}
