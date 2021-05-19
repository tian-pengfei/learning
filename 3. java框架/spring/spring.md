# Spring概述

![image-20210126225544981](image/image-20210126225544981.png)



https://www.zhihu.com/question/48427693/answer/723146648

![2](image/2.png)



![img](image/v2-9bd6efe7c86130553896c3744c338778_1440w.jpg)



BeanPostProcessor会对每一个Bean生效。



![image-20210322100553235](image/image-20210322100553235.png)

![image-20210322100609613](image/image-20210322100609613.png)











postProcessBeforeInitialization和postProcessAfterInitialization分别执行在Bean执行配置的init的方法前后



AbstractAutowireCapableBeanFactory.java 

![image-20210322111744149](image/image-20210322111744149.png)





postProcess也是一种bean，会在registerBeanPostProcessors的方法中加载进来