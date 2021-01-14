# 第一章  Servlet

将会对servlet进行详细分析，更加容易知道其中的来龙去脉

## 1.1 Servlet&JSP概述

​		我们来思考一下网站通讯的过程，当客户端的浏览器接受发出一个Http请求（request），从底层来说服务器肯定收到的是一堆二进制。我们服务端的程序收到这一堆消息，肯定要对这些请求做一些处理，然后再给请求方一个回应(response)。客户端对这些回应的信息然后做一些处理。（客户端最开始收到也是一些二进制）。

![image-20210112212844286](image/image-20210112212844286.png)



​			我们暂且忽略底层怎么解析这些传输的的信息怎么转化为传递到对应的程序里面，忽略这些后我们现在只关注服务端程序拿到这些信息后怎么回应客户端。在我们的web服务器应用中有一种特殊的类会对客户端的请求做一些处理，把处理的结果返回给客户端。这就会引入我们今天的主角Servlet。servlet将完成以上的操作。



看下面的例子我们看Servlet的使用方式

```java

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
        resp.getOutputStream().write("<html><h1>你好哇</h1></html>".getBytes("UTF-8"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getOutputStream().write("<html><h>你好哇</h></html>".getBytes("UTF-8"));
    }
}
```

上面的代码是实现继承了`HttpServlet`，其实实现Servlet接口同样可以达到效果。HttpServlet只是替我们实现一些方法。

我们看一下执行效果

![image-20210114212243344](image/image-20210114212243344.png)

​	不同的访问链接，执行不同的servlet。`WebServlet`注解里面定义的就是哪一个路径访问这个Servlet。如果Get请求执行`doGet`方法，如果是Post请求执行`doPost`方法。还可以根据XML来配置哪个链接访问哪个servlet

​		方法的参数`req`就是客户端发过来的请求信息（应用层面符合HTTP协议的信息）转成的对象，客户端将会收到的信息也用一个对象来表示`resp`,这个对象会被处理成符合HTTP协议的相关信息发送给客户端。

## 1.2 Servlet容器

​	我们好像只用关心处理根据`reques`对象携带信息去填充response对象即可，其余的一些事情都不用我们关心。其余操作都是回来完成的呢？servlet里面的方法不能平白无故的被执行，是谁调用它的呢？？

我们现在来猜想一下大致都有哪些操作

+ 生成response对象request对象。

+ 根据请求的类别调用servlet的对象的某一个方法。

+ 把request和response对象传递进去

+ 把response对象转化成相关格式的信息传送给客户端

  下图大致画一下servlet容易的功能



![image-20210114215451421](image/image-20210114215451421.png)

servlet容器到底干了什么呢？

+ **通信支持**。servlet容器会监听处理来自客户端的消息，怎么解析传过来的数据，怎么接受数据，怎么解析数据在，怎么返回给客户端的数据这些我们都不用关心，我们只需关心怎么实现servlet即可。
+ **生命周期的管理**。要想调用Servlet里面我们定义的方法我们必须对他实例化，使用完servlet实例将会被回收。servlet容器掌管着servlet实例的生与死。也就是对它的生命周期的管理。我们不用在考虑资源管理了。
+ **多线程的支持** 同时有多个请求访问同一个servlet，容器就会创建多个java线程来访问servlet实例。但是我们在编码的过程中也要注意servlet里卖弄的方法对非局部生成的实例要注意多线程安全。
+ **声明方式实现安全** 可以在XML文件里面设置一些servlet的属性。而不必硬编码到java的源文件里面。方便我们的修改
+ **JSP支持 **  JSP是一种servlet（快被淘汰了）

## 1.3 Servlet的生命周期

​	从下面展示的Servlet接口的定义我们就可以看出Servlet 声明周期



```java
public interface Servlet {

    /**
     * Called by the servlet container to indicate to a servlet that the 
     * servlet is being placed into service.
     */

    public void init(ServletConfig config) throws ServletException;
    
    

    /**
     *
     * Returns a {@link ServletConfig} object, which contains
     * initialization and startup parameters for this servlet.
     * The <code>ServletConfig</code> object returned is the one 
     * passed to the <code>init</code> method. 
     */

    public ServletConfig getServletConfig();
    
    

    /**
     * Called by the servlet container to allow the servlet to respond to 
     * a request.
     *
     */

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;
   
   

    /**
     * Returns information about the servlet, such
     * as author, version, and copyright.
     *
     */

    public String getServletInfo();
    
    

    /**
     *
     * Called by the servlet container to indicate to a servlet that the
     * servlet is being taken out of service.
     *
     */

    public void destroy();
}
```



再加上类的加载和实例化，一共有5个状态。





![image-20210114224858484](image/image-20210114224858484.png)