package com.github.hzqd.ikfr.textGenerator.textType.bullShit.wordOrder

import arrow.core.getOrElse
import com.github.hzqd.ikfr.textGenerator.textType.bullShit.textSource.cn
import kotlin.random.Random

val famous = cn.famous.getOrElse { throw NullPointerException() }    // a 代表前面垫话，b代表后面垫话
val before = cn.before.getOrElse { throw NullPointerException() }    // 在名人名言前面弄点废话
val after = cn.after.getOrElse { throw NullPointerException() }      // 在名人名言后面弄点废话
val bosh = cn.bosh.getOrElse { throw NullPointerException() }        // 代表文章主要废话来源

var content: String = ""

fun cn() {
    val title = "睡觉"
    while (content.length < 6000) {
        Random.nextInt(0, 100).let {
            content += when {
                it < 5 -> getAnotherParagraph()
                it < 20 -> getFamous()
                else -> getBosh()
            }
        }
    }
    content.replace("x", title).let(::println)
}

fun getAnotherParagraph() = "\r\n"

fun getFamous() = famous.random()
    .replace("a", after.random())
    .replace("b", before.random())

fun getBosh() = bosh.random()
