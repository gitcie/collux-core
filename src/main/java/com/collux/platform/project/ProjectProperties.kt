package com.collux.platform.project

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * 项目属性配置
 * @author Siyi Lu
 * @since 2020/1/14
 */
@Component
@ConfigurationProperties(prefix = "project")
class ProjectProperties {

    var version: String = ""

}