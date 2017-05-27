package io.github.igordonxiao.springboot.kotlin.model

import io.github.igordonxiao.springboot.kotlin.annotation.NoArg
import javax.persistence.*

@Table(name = "user", schema = "public")
@Entity
@NoArg
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int, val name: String)

