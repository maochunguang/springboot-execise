## 练习目标
1. 熟悉spring的扩展点
2. 熟悉AOP
3. 熟悉springboot扩展点
4. 熟悉spring其他模块的扩展
    1. mvc扩展
    2. dataSource扩展
        1. 读写分离插件
        2. 动态数据源插件
    3. mybatis扩展：
        1. mbg生成merge插件，overwrite xml文件
5. 做成自己开发的脚手架，开箱即用

## 实战任务

### 1. aop实战
1. 打印request，response日志，service日志
2. 全局异常处理：`GlobalExceptionAdvice`
3. 全局json名称返回下划线风格

