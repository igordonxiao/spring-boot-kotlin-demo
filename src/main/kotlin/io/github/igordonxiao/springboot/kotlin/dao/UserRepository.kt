package io.github.igordonxiao.springboot.kotlin.dao

import io.github.igordonxiao.springboot.kotlin.model.User
import org.springframework.data.repository.CrudRepository

interface IUserRepository : CrudRepository<User, Int>