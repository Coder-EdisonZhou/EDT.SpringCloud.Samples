# EDC.SpringCloud.Samples

## 温馨提示
本示例基于Spring Boot 1.5.x实现，如对Spring Boot不熟悉，可以先学习我的这一篇：《[Spring Boot 1.5.x 基础学习示例](https://www.cnblogs.com/edisonchou/p/java_spring_boot_foundation_demos.html)》。关于微服务基本概念不了解的童鞋，可以先阅读下始祖Martin Fowler的《[Microservice](https://mp.weixin.qq.com/s/fzk-kENu0I22P3F2Vu7KBA)》，本文不做介绍和描述。

## Spring Cloud
<img src="https://images2018.cnblogs.com/blog/381412/201808/381412-20180822202553841-1217264857.jpg" style="border: 1px solid #ddd; border-radius: 5px;" alt="Spring Cloud微服务实战"/>

首先，尽管Spring Cloud带有“Cloud”这个单词，但它并不是云计算解决方案，而是在Spring Boot基础之上构建的，用于快速构建分布式系统的通用模式的工具集。<br/>
其次，使用Spring Cloud开发的应用程序非常适合在Docker和PaaS（比如Pivotal Cloud Foundry）上部署，所以又叫做云原生应用（Cloud Native Application）。云原生可以简单地理解为面向云环境的软件架构。<br/>
总结，Spring Cloud是一个基于Spring Boot实现的云原生应用开发工具，它为基于JVM的云原生应用开发中涉及的配置管理、服务发现、熔断器、智能路由、微代理、控制总线、分布式会话和集群状态管理等操作提供了一种简单的开发方式。

## 示例环境版本
  - **Java** : JDK & JRE 1.8 8u151
  - **Spring Boot** : 1.5.15.RELEASE
  - **Spring Cloud** : Edgware.SR3

## 示例简要说明（持续更新中...）
  - 服务注册与发现（基于Eureka） : 
    [part1_service-register-discovery](https://github.com/EdisonChou/EDC.SpringCloud.Samples/tree/master/src/part1_service-register-discovery)
  - 客户端负载均衡（基于Ribbon） :
    [part2_client-load-balance](https://github.com/EdisonChou/EDC.SpringCloud.Samples/tree/master/src/part2_client-load-balance)
  - 声明式REST调用（基于Feign） :
    [part3_feign](https://github.com/EdisonChou/EDC.SpringCloud.Samples/tree/master/src/part3_feign)
  - 容错处理（基于Hystrix） :
    [part4_hystrix](https://github.com/EdisonChou/EDC.SpringCloud.Samples/tree/master/src/part4_hystrix)
  - API网关（基于Zuul） :
    XXXXXXX
  - 统一配置管理（基于Spring Cloud Config） :
    XXXXXXX
  - 微服务跟踪（基于Spring Cloud Sleuth） :
    XXXXXXX
  - 使用Docker-Compose编排Spring Cloud微服务 :
    XXXXXXX

## 推荐学习资料
`PS`：下面资料都是我们项目组新同事以及老同事（.Net技术背景）所采用的学习资料，并不保证适合于所有人。本示例主要也主要是基于下面的资料而写的sample code。<br/>
<img src="https://www.cnblogs.com/images/cnblogs_com/edisonchou/1288702/o_eBook1.jpg" style="border: 1px solid #ddd; border-radius: 5px;" alt="Spring Cloud微服务实战"/>
<img src="https://www.cnblogs.com/images/cnblogs_com/edisonchou/1288702/o_eBook2.jpg" style="border: 1px solid #ddd; border-radius: 5px;" alt="Spring Cloud与Docker微服务架构实战"/>
> 程序猿DD SpringCloud基础教程（Dalston版本），Spring Cloud微服务实战：http://blog.didispace.com/Spring-Cloud%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/<br/>
> 周立 Spring Cloud与Docker微服务架构实战：https://book.douban.com/subject/30278673/<br/>
> 纯洁的微笑 SpringCloud系列教程：http://www.ityouknow.com/spring-cloud

## 推荐开发环境

<img src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533644040260&di=f5ef1cf27c43f744cc8fbac384bfd0e9&imgtype=0&src=http%3A%2F%2Fimage.bubuko.com%2Finfo%2F201808%2F20180801214347937731.png" style="border: 1px solid #ddd; border-radius: 5px;" alt="Intellij Idea 2018"/>
> Intellij Idea Community 2018版本<br/>
`PS`: 如果是.Net程序猿想要学习SpringBoot，建议更改快捷键与Visual Studio保持一致，这样能加快开发效率

<img src="https://www.cnblogs.com/images/cnblogs_com/edisonchou/1288702/o_alibaba_plugin.jpg" style="border: 1px solid #ddd; border-radius: 5px;" alt="阿里巴巴代码规约"/>
> 阿里巴巴代码规约插件<br/>

## 参考博文

More details ：https://www.cnblogs.com/edisonchou/p/java_spring_cloud_foundation_sample_list.html

