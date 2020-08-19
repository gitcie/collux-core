/******************************************************************************
 * Copyright (C) 2017 ShenZhen Powerdata Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳博安达开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.collux.platform

import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * class summary
 * <p>
 * class detail description
 * @author Siyi Lu
 * @since 2020/8/19
 */
@RestController("/test")
class TestController {

    fun  hello(@RequestParam name: String): String {
        return "Hello ${name}"
    }

}