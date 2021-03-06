package com.github.samarium150.mirai.plugin

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

/**
 * Reply config
 * <br>
 * 自定义回复语句
 *
 * @constructor Create a Reply config instance <br> 实例化回复配置
 * @see net.mamoe.mirai.console.data.AutoSavePluginConfig
 */
object ReplyConfig: AutoSavePluginConfig("ReplyConfig") {

    /**
     * APIException internal error
     * <br>
     * API 内部错误
     */
    @ValueDescription("API内部错误, 返回状态码：-1")
    val exceptionInternal: String by value("API内部错误")

    /**
     * APIException status: 401
     * <br>
     * API 返回状态码401
     */
    @ValueDescription("API 返回状态码401")
    val exception401: String by value("apikey不存在")

    /**
     * APIException status: 403
     * <br>
     * API 返回状态码403
     */
    @ValueDescription("API 返回状态码403")
    val exception403: String by value("调用不规范, 用户两行泪. 快去找开发者的麻烦.")

    /**
     * APIException status: 404
     * <br>
     * API 返回状态码404
     */
    @ValueDescription("API 返回状态码404")
    val exception404: String by value("没有找到相关图片, 换个关键词试试吧")

    /**
     * APIException status: 429
     * <br>
     * API 返回状态码429
     */
    @ValueDescription("API 返回状态码429")
    val exception429: String by value("调用达到上限, 是时候换个apikey了")

    /**
     * In cooldown
     * <br>
     * 指令未冷却
     */
    @ValueDescription("指令未冷却")
    val inCooldown: String by value("你怎么冲得到处都是")

    /**
     * Fuel error
     * <br>
     * 获取图片失败
     */
    @ValueDescription("获取图片失败")
    val fuelError: String by value("网络连接失败/超时或图片已被删除，之后再试试吧")

    /**
     * Non admin permission denied
     * <br>
     * 没有群主和管理员权限
     */
    @ValueDescription("没有群主和管理员权限")
    val nonAdminPermissionDenied: String by value("该命令仅限群主和管理员使用")

    /**
     * Untrusted
     * <br>
     * 非受信任的用户
     */
    @ValueDescription("非受信任的用户")
    val untrusted: String by value("非受信任的用户不能设置该属性, 让Bot所有者添加到受信任用户名单后才能使用")

    /**
     * Set succeeded
     * <br>
     * set命令执行成功
     */
    @ValueDescription("set命令执行成功")
    val setSucceeded: String by value("设置成功")

    /**
     * Illegal property
     * <br>
     * 非法属性
     */
    @ValueDescription("非法属性")
    val illegalProperty: String by value("不是有效的属性")

    /**
     * Illegal value
     * <br>
     * 非法值
     */
    @ValueDescription("非法值")
    val illegalValue: String by value("不是有效的数字")

    /**
     * Non master permission denied
     * <br>
     * 不是Bot master
     */
    @ValueDescription("不是Bot master")
    val nonMasterPermissionDenied: String by value("该命令仅能由Bot所有者使用")

    /**
     * No master id
     * <br>
     * 没有填写master qq号
     */
    @ValueDescription("没有填写master qq号")
    val noMasterID: String by value("请先在配置文件设置Bot所有者id")

    /**
     * Trust succeeded
     * <br>
     * 添加到信任列表成功
     */
    @ValueDescription("添加到信任列表成功")
    val trustSucceeded: String by value("添加成功")

    /**
     * Already exists
     * <br>
     * 用户已在信任列表中
     */
    @ValueDescription("用户已在信任列表中")
    val alreadyExists: String by value("该用户已经在名单中")

    /**
     * Distrust succeeded
     * <br>
     * 从信任列表中移除成功
     */
    @ValueDescription("从信任列表中移除成功")
    val distrustSucceeded: String by value("移除成功")

    /**
     * Does not exists
     * <br>
     * 用户不在信任列表中
     */
    @ValueDescription("用户不在信任列表中")
    val doesNotExists: String by value("该用户不在名单中")

    /**
     * Reloaded
     * <br>
     * 配置已重载
     */
    @ValueDescription("配置已重载")
    val reloaded: String by value("配置已重载")
}
