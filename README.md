## 介绍
Xxl-Job是一款优秀的开源调度平台，在推广并使用的过程中，我在它的基础上进行了扩展，开发了一些它本身无法满足我们公司业务需求的功能，提供了异构系统（PHP,Python等）接入的方案和实施样例，并完善了用户权限模型等等。

## 版本关系
Xxl-Job是在Xxl-Job 2.0.1 release版本的基础上开发的。
## Documentation
- [中文文档](http://www.xuxueli.com/xxl-job/)
- [English Documentation](http://www.xuxueli.com/xxl-job/en/)

## Xxl-Job-Plus新增功能
Xxl-Job-Plus是Xxl-Job的一个超集，这意味着它拥有着Xxl-Job可以提供的所有功能，当你需要以下功能时，可以选择xxl-job-plus。
> 需要把该项目xxl-job-core模块打包到公司的maven私服，不能使用 maven 中央仓库的JAR包。
#### 用户管理
  - 完善登录功能，使用数据库表存储用户，而不再是原来xxl-job自带的配置文件配置单一用户的模式。
  - 提供用户管理功能，有管理员和普通用户两种角色。

#### 权限管理
  - 管理员用户拥有最高权限，普通用户没有用户模块的查看和操作权限（没有该页面）和 执行器的操作权限（只能查看，不能修改执行器配置）
  - 普通用户权限以执行器为粒度进行权限管理，可以再用户管理页面对用户授予某执行器及该执行器下任务的查看权限。

#### 告警优化
  - 按照小时维度限制发送告警邮件的次数，超过xxl.job.maxErrorCountAlarm配置次数后不发送。
  
#### 阻塞策略
  - 增加阻塞策略：丢弃后续调度返回成功。该策略与丢弃后续调度的区别是，当任务阻塞时会直接返回成功。在调度日志中点击调度备注-查看，msg为block strategy effect：Discard Return Success 的是触发该策略的调度记录。
  