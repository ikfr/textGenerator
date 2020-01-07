package com.github.hzqd.ikfr.textGenerator.textType.science.textSource

import arrow.core.None
import arrow.core.Option

data class Structure (
    //句子库
    //修饰
    val 分段: String = "\n",
    //结果部分
    var 结目的: Option<List<String>> = None,
    var 结数据: Option<List<String>> = None,
    var 正数据: Option<List<String>> = None,
    var 负数据: Option<List<String>> = None,
    var 两数据: Option<List<String>> = None,
    var 亮数据: Option<List<String>> = None,
    var 效数据: Option<List<String>> = None,
    var 比数据: Option<List<String>> = None,
    var 场数据: Option<List<String>> = None,
    var 另数据: Option<List<String>> = None,
    var 外数据: Option<List<String>> = None,
    var 结过渡: Option<List<String>> = None,
    var 结论点: Option<List<String>> = None,
    //证言部分
    var 泛相关: Option<List<String>> = None,
    var 远相关: Option<List<String>> = None,
    var 域相关: Option<List<String>> = None,
    var 近相关: Option<List<String>> = None,
    var 现相关: Option<List<String>> = None,
    var 前做法: Option<List<String>> = None,
    var 前人员: Option<List<String>> = None,
    var 前时间: Option<List<String>> = None,
    var 前研究: Option<List<String>> = None,
    var 前话题: Option<List<String>> = None,
    var 前关系: Option<List<String>> = None,
    var 前总结: Option<List<String>> = None,
    //方法部分
    var 前方法: Option<List<String>> = None,
    var 近方法: Option<List<String>> = None,
    var 源方法: Option<List<String>> = None,
    var 样本征: Option<List<String>> = None,
    var 样本基: Option<List<String>> = None,
    var 方法意: Option<List<String>> = None,
    var 总步骤: Option<List<String>> = None,
    var 被步骤: Option<List<String>> = None,
    var 步骤前: Option<List<String>> = None,
    var 步骤度: Option<List<String>> = None,
    var 分析器: Option<List<String>> = None,
    var 方法缺: Option<List<String>> = None,
    //讨论部分
    var 重总证: Option<List<String>> = None,
    var 重目的: Option<List<String>> = None,
    var 重结果: Option<List<String>> = None,
    var 外结果: Option<List<String>> = None,
    var 重分证: Option<List<String>> = None,
    var 重反证: Option<List<String>> = None,
    var 解释: Option<List<String>> = None,
    var 谨慎: Option<List<String>> = None,
    var 假设: Option<List<String>> = None,
    var 评论: Option<List<String>> = None,
    var 重建议: Option<List<String>> = None,
    var 总声明: Option<List<String>> = None,
    //结论部分
    var 总发现: Option<List<String>> = None,
    var 域发现: Option<List<String>> = None,
    var 总意义: Option<List<String>> = None,
    var 总缺陷: Option<List<String>> = None,
    var 未工作: Option<List<String>> = None,
    //其他
    var 作者: Option<List<String>> = None,
    var 时间: Option<List<String>> = None,
    var 从句库: Option<List<String>> = None,
    //句库名称
    var 结果部分: Option<List<Option<List<String>>>> = None,
    var 证言部分: Option<List<Option<List<String>>>> = None,
    var 方法部分: Option<List<Option<List<String>>>> = None,
    var 讨论部分: Option<List<Option<List<String>>>> = None,
    var 结论部分: Option<List<Option<List<String>>>> = None,
    //基本
    //全局输入
    var 主题: Option<String> = None,
    var 同义词: Option<String> = None,
    var 近义词: Option<String> = None,
    var 上级: Option<String> = None,
    var 方法: Option<String> = None,
    var 特征: Option<String> = None,
    //全局写入
    var 序列: Int = 0,
    var 结果序列: Int = 0,
    var 局部序列1: Int = 0,
    var 章节: String = "",
    //局部写入
    var 选中作者: Option<String> = None,
    var 选中时间: Option<String> = None,
    var 从句: Option<String> = None,
    var 结果小标题: Option<String> = None
)