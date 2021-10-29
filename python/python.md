## 初识

```python
from time import sleep,ctime  #导入第三方的库函数
    
fire='大火'  #变量赋值
def do_xcr():   #定义函数（完成做一件事）
    print("准备食材")
    print("-----开始炒菜------")
    pot = "油"
    pot = pot+ 'pork'
    print('锅里有:'+pot)
    if(fire == '大火'): #分支判断
        count=0
        while(count<10):  #循环控制
            count = count+1	
            print('翻炒'+str(count))
    else:       
        print('翻炒40下')
    pot = pot+ '辣椒'+'盐'+'花椒'
    print('锅里有:'+pot)
    sleep(2)  #调用第三方的函数
    print("装盘完成")
    print(ctime())  #显示当前的时间

print("============做小炒肉=============")
do_xcr()  #调用函数
print("============做小炒肉=============")
do_xcr()  #调用函数（避免代码重复）
```



### hello

pyhton 解析器--> 解析python文件,输出结果

> 命令方式

```python
$ python
>>> print("hello")
hello
>>> 3+5  
8
>> a ="hello"
>> b =" baby"
>> a+b
hello baby
>>> print("out:"+a+b)
>> quit()    //退出
```

> 脚本方式

```python
print("Hello, world ")  #//输出显示 
x=2  #//变量x 赋值为2
y=5
print(x+y)  #//输入 x+y的结果显示
```

运行程序

```shell
$ python3 hello.py
```

### 数据类型和变量

```python
字符串(string) //‘pork’    ‘辣椒’
数字(number)   // 0.5        5
列表           //['盐','芝麻','花椒'] 	
字典           //{'name':'王伟','age':25,'school':'新东方'}
逻辑(Bool)     //True(真)   False(假)

变量   //变量可以变化，存放不同的东西
       //pot   = ‘辣椒’    listBox   =  ['盐','芝麻', '花椒']
```

### 流程控制

**分支（条件判断）**

```python
if(fire == '大火'):  #注意有冒号
  print('翻炒10下')  #注意冒号下的分支程序要 Tab键缩进
else:       
  print('翻炒20下')	
```

```python
count=0
while(count<10): 
  count = count+1	
  print('翻炒'+str(count))
```

### 函数

```python
def do_xcr():
    print("hello world")
    print("准备食材")
    print("炒菜完成")
```

调用函数

```python
do_xcr()
do_xcr()
```

### 类

```python
class Person:     #//定义类(只是想法)
  name = 'lili'   #//类属性
  def talk(self): #//类行为(方法)：形参self必须有，代表类的实例,相当于java中的this
    print("can talk,my name is:",self.name);

p = Person()      #//新建类的实例对象
p.talk()          #//调用对象的方法（无参，但其实有参，它是隐藏的第一个实参，为类的实例)
print("name is",p.name)  #//访问对象的属性	
p.age=30          #//可动态添加(python是动态语言）
print("new age is",p.age)
```

### 库

封装好功能，只需导入调用。pyhton库是python的快速的原因

```python
#//官方文档  https://docs.python.org/zh-cn/3/ 
import random #//随机数库
print(random.random())

import time; #//时间的库
print(time.ctime())
     
import math; #//数学库
print(math.gcd(4,12));
```

### 输入输出



```python
a = input("请输入: ")
print(a, type(a))

print('%s %d %c %x'%('ivan',10,65,15))  #//老版本格式化输出： 字符串 整型 字符 16进制

i = 2
j = 5
print('{}*{}={} '.format(i, j, i * j))	

#//新版格式化输出: 0指format的第一个对象(如3),1指format的第二个对象(如10), 
#//                {1:x} 冒号前指对象，冒号后指定输出类型(b:二进制，x:16进制)	
print('{0}二进制:{0:4b} {1}十进制:{1:d} 16进制:{1:x}'.format(3,10))  
```



![image-20211010145434711](image/image-20211010145434711.png)

```python
a = input("请输入: ")
print(a, type(a))
```

结果

```text
请输入: 1
1 <class 'str'>
```

---



```python
print('%s %d %c %x'%('ivan',10,65,15)) 
```

结果

```text
ivan 10 A f
```



---

```python
i = 2
j = 5
print('{}*{}={} '.format(i, j, i * j))	
```

结果：

```text
2*5=10
```



---

```python
print('{0}二进制:{0:4b} {1}十进制:{1:d} 16进制:{1:x}'.format(3,10))  
```



```text
3二进制:  11 10十进制:10 16进制:a
```

**例子--猜大小**

```python
import random

def guess():
    num = int(input("请输入你猜测：小(0), 大(1)\n"))
    computer = random.randint(0, 1) //生成0 或者1
    print("computer is ",computer)
    if (num == computer):
        print("你赢了")
    else:
        print("你输了")

guess();
guess();
guess();
```

**九九算法表**

```python
for i in range(1, 10):
    for j in range(1, i + 1):
        print('{}*{}={} '.format(i, j, i * j), end='')  #//end指定结束方式，如不指定，将默认换行
    print('') 
```

**异常**

```python
x=3
y=0
try:    #//如无异常判断将终止退出，不能继续往下执行
    print(x/y)
except : 
    print("can not be zero")	
print("go go go")
```

**语法识别**

```python
#//---关键字（保留字）   -->  保留字不能用作常数或变数，或任何其他标识符名称 ,python 关键字全小写 
print  pass assert
if else  return for while continue break
class try   
def with 	import from is finally lambda 
= + - * %	  
#//---语句
counter = 100;  #//语句:把整型数据100赋值给变量counter (;表示语句结束,可省略).  
name = "John"   #//字符串类型
price = 2+3+5;  #//表达式语句 
Price = 8;      #//区分大小写(price 和Price不是同一个）
#//---注释
#                   #//单行注释 
'''  多行注释 '''    #//多行注释：三个单引号或双引号
"""  多行注释 """     

#//---字面量（直接量)  -->  直接用的数据值(如 print(34+5))
34 'ivan' True False #//基础类型： 数字 字符串 bool值。  
[2,3,'ivan',5]       #//列表 train= [2,5,'ivan',False]   
                     #//print(train)  train[2]=55 print(train) 
```







## 变量和数据类型

### 变量的定义和赋值

```python
age =3;           #//变量赋值(实现，获得空间)
                  #//1age =5;   (报错 命名：数字不能在前)               
name = 'ivan';    #//变量赋值字符串类型
girl = {'name':'lili','age':30}; #//变量赋值字典类型
a,b=1,2;          #//多重赋值， 拆解为  a=1;  b=2; 
a = b = 1;        #//连续赋值， 拆解为  a=1;  b=1; 
```

### 基础数据类型

**number: 数字(整形 浮点型 复数）**

```python
a,b,c = 10,3.14,1+2j  
print(a,b,c)
print(a+c) 
print(c,type(c))
```

输出：

```python
10 3.14 (1+2j)
(11+2j)
(1+2j) <class 'complex'>
```



**string: 字符串**

```python
str = 'hello baby'; 
print(str,str[1],str[2:4],str[6:],str[:5]); 
name="good" 
print(str+name);
```

输出：

```python
hello baby e ll baby hello
hello babygood
```



**boolean:布尔值(逻辑判断)**

```python
ret = 2>1;
print(ret); 
ret =False;
if(ret):
  print('this is true');
else:
  print('this is false');
```

输出

```text
True
this is false
```

### **复合数据类型**



#### 列表对象(升级版的数组)

```python
train = [50,20,'apple'];
print(train);
list = train;
train[2] = 'tv';
print(train);
print(list);
```



输出：

```python
[50, 20, 'apple']
[50, 20, 'tv']
[50, 20, 'tv']
```

python的复杂类型是类似于c++指针，java中的引用类型



```python
basket = ['apple', 'orange', 'apple', 'pear', 'orange', 'banana']
print(basket);
print('banana' in basket);
basket[2]=[1,2,3] 
def func():
    print("nihao")
basket[2]=func 
basket[2]()
```



输出：

```text
['apple', 'orange', 'apple', 'pear', 'orange', 'banana']
True
nihao
```









#### 元组对象（只读的列表）

```python
tuples = (1,6,'ivan',3,'good',77);
print(tuples);       #//输出 (1,6,'ivan',3,'good',77)
print(tuples[1]);    #//输出 6
print(tuples[1:3]);  #//输出 (6, 'ivan')   
	
tuples[1]=2;        #//报错，元祖是禁止修改的			

tu2 =(56,'yzg',3)
print(tuples+tu2)   #//拼接

print(tuples[2.0])  #//报错：TypeError: tuple indices must be integers or slices, not float 
                    #原因时类型不匹配，需把2.0  转为int 用 int(2.0)
    
```



#### 集合对象(无序 不重复)

他里面可以存储复杂类型，甚至函数

```python
basket = {'apple', 'orange', 'apple', 'pear', 'orange', 'banana'}
print(basket);
print('banana' in basket);
```

#### 字典对象(键值对 类似JSON对象) 

```python
man={'name':'ivan','age':30};
print(man);
obj={};  #//定义空的字典对象
obj['name']='yzg';
obj['age']=28;
print(obj['name'],type(obj));
man = obj;
obj['age'] =10;
print(man);
```



### 空间分配:  变量里存放的是引用

```python
str1 = "ivan";
str2 = str1;    #//赋值是 引用的拷贝(引用是指向实体的地址)
print(id(str1)) #//id() 是查看对象的存储地址
print(id(str2))
print('str1 = ' + str1);  
print('str2 = ' + str2); 	
str1 = "yzg";
print(id(str1))
print(id(str2))
a =1 
b =a 
print(id(a))
print(id(b))
```

```python
140686874448880
140686874448880
str1 = ivan
str2 = ivan
140686874449136
140686874448880
9788992
9788992
```

```python
obj1 = {'name':'ivan', 'age':30};
obj2 = obj1;            #//赋值只是引用的拷贝，它们还是指向同一实体
obj1['name'] = 'yzg';   #//本身可变 
print('obj1 name = ' + obj1['name']);  
print('obj2 name = ' + obj2['name']); 	#//都改变为'yzg'， 证明指向的是同一实体	
```





### 嵌套引用：可扩展表示 复杂数据结构

```python
train = [50,20,'apple'];
train[1] ={'name':'lili','age':30}
print(train)


#//可把函数名，看成指向代码块的引用
def gogo():
    print("i can gogogo")
    
train[1]['teach']=gogo  
print(train)
train[1]['teach']()	
```





### 数据运算

#### 算术

```python
print(6+3*5/2); 
#//---浮点型精度问题(因二进制，0.333表示有问题）运算中有0.3出现都会有问题
print(0.3-0.2);             #输出0.099  
print(0.1+0.2==0.3);        #输出 false
#//解决方法：放大后再缩小
print((10*0.1+10*0.2)/10==0.3); #输出 true 
#//---% 取模(求余）
print(3%2);  #单双数判断

#//---优先运算加 ()  
print((10+20)/2);  

print(2**3);  #//2的3次方(幂) 2^3
print(9//2);  #//取整除 为4	 结果就不会是小数了
```



#### 赋值运算

```python
a=2; 	 
a+=3 	  #//与 a = a+3; 相同
print(a); 
a%=2;     #//与 a = a%2; 相同
print(a);    
a**=3
print(a);    
a = 9; 
a//=4
print(a); 
```

#### 比较

```python
age =18;
if(age>=18):
  print('成年');

today ='11.10';
if(today!='11.11'):
  print('双11还未到');

a=2;
b='2';
if(a==b):
  print('值相等');
```

#### 位运算

```python
a=60 #//对应二进制00111100
b=13 #//对应二进制00001101
print(a&b)    # 00001100
print(a|b)    # 00111101
print(a^b)    # 00110001(‘异’或，一样为0不一样为1)
print(~a)     # 11000011
c=4           # 00000100
print(c<<1)   # 00001000
print(c>>1)   # 00000010
```

#### 逻辑运算

!--->not  &&-->and  ||--->or

```python
age =25;
print('是青年吗 ',(age>18 and age<30));

hasHouse,money =True,1000;
#hasHouse,money =False,1000;
if(hasHouse or money>1000000):
  print("有房或有100万,嫁给他")

if not(hasHouse or money>1000000):
  print("即没房也没100万,不嫁")

list = [1,2,3,4,8];
print('3在list中吗',3 in list);
print('6不在list中吗',6 not in list);

lili = {'name':'lili','age':30};
x = lili;
x['name']='linda';
print(x,'是lili这个人吗',x is lili);
```

#### 类型转换

```python
#//int() 转换为整型数字 	
print(int(3.14)+2);	#5
print(int('12')+5); #17
print(int(0xa)+3); # 13
#//转float
print(float(3)+1.24);#4.24
print(3+1.24); #4.24
#//str() 转换为字符串    
print(str('12')+'5');  #125

lili = {'name':'lili','age':30};
print(str(lili)+'good');
print(lili+'good'); #fail  error	

#//隐式转换（自动转换）   
name = 'ivan';  print(name[1]); #//字符串转换为列表 --> 查找某位置的字符
print( '7'+'people');           #//数字转换为字符串	--> 进行拼接
print( '7'-'people');           #//报错：隐式转换失败 error 	
```



## 流程控制

#### 分支判断

```python
age=12;            #//要顶格写
if(age<18):        #//true  逻辑成立为真
  print('未成年'); #//注意要有缩进
else:              #//false 逻辑不成立为假
  print('成年');

#//注意: python里无switch	
```

**猜数字**

```python
import random
pcNum = random.randint(0, 100)

def guess_num(num):
    print("right num is ",pcNum)
    if pcNum > num:
        print('你的数字小了')
        return 1
    elif pcNum < num:
        print('你的数字大了')
        return 1
    else:
        print('你赢了')
        return 0

ret = 1
while(1):
    num  = int(input('请输入数字(0-100)\n'))
    if(guess_num(num) ==0):
        break
```

**什么是真，什么是假？**

```python
a =1;
#a =0;
a ='lili';
#a ='';
a ={'name':'lili'};
#a ={};
if(a):  #//真的 True  非零数字 非空字符串 非空对象
  print('真');
else:   #//假   False 数字零   空字符串 空对象;  
  print('假');
```

#### 循环while

```python
i=0;
while(i<5):   #//先判断，再决定是否继续做
  i = i+1;
	print(i);
```

**例:计算1+2+3 ... +98+99+100的值**

```python
total=0;
i=1;
while(i<=100):
  total+=i;
  i+=1;
print(total);
```

**斐波那契数列**

```python
a, b = 0, 1   #//多重赋值， 拆解为  a=0;  b=1; 
while a < 10:
    print(a)
    a, b = b, a+b
```



#### 循环for

```python
#//遍历对象元素	
box = ['banana', 'apple',  'book']
for e in box:   
   print(e);
   
for x in 'Python':  #//遍历
   print(x);  	
```

**累加加**

```python
box = [2,6,3]
sum=0
for e in box:
    sum+=e
print("sum=",sum)
```

**遍历一个数字数列**

```python
for i in range(5):
  if(i==2):
    break;      #//跳出终止整个循环
    #//continue;  跳过本次循环，继续下一次循环
  print(i);
```

```text
0
1  
```



```python
range(start, stop[, step])
```

+ start: 计数从 start 开始。默认是从 0 开始。例如range（5）等价于range（0， 5）;
+ stop: 计数到 stop 结束，**但不包括 stop**。例如：range（0， 5） 是[0, 1, 2, 3, 4]没有5
+ step：步长，默认为1。例如：range（0， 5） 等价于 range(0, 5, 1)





**找出偶数值**

```python
for num in range(2, 10):
    if num % 2 == 0:
        print("找到一偶数：", num)
    continue
```

```python
找到一偶数： 2
找到一偶数： 4
找到一偶数： 6
找到一偶数： 8
```

**除女同学都不需要报年龄**

```python
listPerson = [{'name':'lili','sex':'male','age':35},
              {'name':'wg','sex':'male','age':28},
              {'name':'xm','sex':'male','age':26},
              {'name':'linda','sex':'female','age':32},
              {'name':'ww','sex':'male','age':37}];

for obj in listPerson:
  if(obj['sex']=='female'):
    print('female no report age');
    continue;
  print(obj); 
```

**二分查找**

```python
def bisearch(buf, key):
    l1 = 0
    h1 = len(buf) - 1
    index = 0
    while l1 < h1:
        mid = (h1 + l1)  #// 2
        if buf[mid] < key:
            l1 = mid
        elif buf[mid] > key:
            h1 = mid
        else:
            print('find it {}'.format(buf[mid]))
            index = mid
            break
    return index

data = [1, 2, 4, 7, 9, 11, 33, 77]
i = bisearch(data, 9)
print('location index is', i)	
```



## 函数

### 定义说明

### 初识

```python
#//关键字：def                --  让系统识别 这是函数
#//函数名: start              --  名字 (事情的名称， 注： 定义多个函数时名字不能相同)
#//函数体：冒号后缩进的代码块 --  内容（描述事如何做）
def start():   # 定义（规划做什么事）                
  print('starting... machine ');
  print('start success');	
```

**例：做菜**

```python
def doDinner(name):
  print('i do dinner '+ name);
doDinner('fish');
doDinner('红烧肉');
doDinner('清炒土豆丝'); 
```

### 定义声明（规划做什么事），及调用（开始做事）

```python
def sum(n): #//空函数
  pass      #//占位，什么也不做

sum();
```

### 传参

传递的是引用

```python
def start(name): #//函数参数: ()  --  输入（做事需要什么东西， 如 name）             
  print('start '+ name +' success');		           

start('iphone');
start('pad');

def start2(n): #//形参 n （相当于局部变量）
  #//n = a;  参数n 相当于局部变量，
  print('start '+ n +' success');	
a ='iphone';
start2(a);    #//函数传参， 类似于变量的赋值   n = a;，把实参赋值给形参
```

**列表做参数 （引用的拷贝，都指向同一份实体)**

```python
a = ['ivan','yzg','lili']
def change(addr):
	addr[1]='wangwei';
change(a);
print(a);
```

```text
['ivan', 'wangwei', 'lili']
```



**字典做参数**

```python
def car(): print(' dirver car');  #//需先定义，后再使用
def bus(): print(' dirver bus');

person ={
  'name':'ivan',
  'driver':car      
}

def change(obj):
  obj['name']='yzg';   #//更改对象的属性
  obj['driver']= bus;  #//更改对象的方法

change(person);
print(person['name']);
person['driver']();
```

```text
yzg
dirver bus
```



**函数做参数**

```python
def fn(callback): #//函数参数: ()  --  输入（做事需要什么东西， 如 callback） 
  print(callback,' type:',type(callback));
  callback();    #//通过参数，间接调用函数 (回调函数）       

def start():
  print('start tv');

fn(start);  #//函数做参数传入
```





```text
<function start at 0x7fb44519f0d0>  type: <class 'function'>
start tv
```



**类对象做参数**

```python
class Animal:  #//定义对象 Animal
  name = "animal";
  def breath(this):
    print("can breath from water");

def air():
  print("breath from air");
def change(o):
  print("after change");
  o.breath = air;

obj =  Animal(); #//新建对象实例
print(obj.name);
obj.breath();
change(obj);     #//对象做实参（引用类型传递 是地址传递，指向的是同一实体)
print(obj.name);
obj.breath();	
```





```text
animal
can breath from water
after change
animal
breath from air
```



**默认参数**

默认参数只能在末尾，可多个。

```python
def fn(name,money=500):
  print(name,'捐款',money);

fn('lili',1000);
fn('wangwei');
```

```text
lili 捐款 1000
wangwei 捐款 500
```





**不定参**

*args 传入的参数是 元组类型

```python
def test(*args):    
    print(args)   
    for i in args:
        print(i)

test(1,2,3)
```



```text
(1, 2, 3)
1
2
3
```

****kwargs 传入的参数是 dict 类型**

```python
def test(**kwargs):
    print(kwargs)
    keys = kwargs.keys()
    value = kwargs.values()
    print(keys)
    print(value)

test(a=1,b=2,c=3,d=4)
```

```text
{'a': 1, 'b': 2, 'c': 3, 'd': 4}
dict_keys(['a', 'b', 'c', 'd'])
dict_values([1, 2, 3, 4])
```

### 例子

**多个数的累加加**

```python
def sum(*args):    #//args里存放了所以的实参
    ret = 0;
    for obj in args:
        print(obj);
        ret += obj;
    print('sum is', ret);
    return ret;

sum(1);
sum(1, 4, 3);	
```

```text
1
sum is 1
1
4
3
sum is 8
```

**作业：写一个按照下面方式调用都能正常工作的 sum 函数**

```python
print(sum(2,3));  #// Outputs 5
print(sum(2)(3)); #// Outputs 5
```

answer

```python
def sum(*args):
  fir = args[0];
  if(len(args) == 2):
    return args[0] + args[1];
  else:
    return lambda sec:fir + sec;
print(sum(2,3));
print(sum(2)(3));
```



python的lamda表达式是一种匿名函数

```python
lambda arguments : expression
```

```python
x = lambda a : a + 10
print(x(5)) #15
```

·

**作业: 下面程序输出为多少,为什么**

```python
def func(o):
    o['siteUrl'] = "http://www.csser.com/";
    o={};    
    o['siteUrl'] = "http://www.popcg.com/";  #//改变的是另一个新创建的对象内容
CSSer={};
func(CSSer);  #//o= CSSer;
print(CSSer['siteUrl']); 
```

```text
http://www.csser.com/
```



## 返回值

```python
def sum(x, y):
    return x + y; #// 函数返回值：return --  输出（做完事后能得到什么）
                  #// 注：无return时，返回None，  return 后面语句不执行
print(sum(3, 5)); #// 传参调用
```

```text
8
```

### 返回函数

```python
def fn(a):
  print('fn run');
  def fnn(b):
    print('fnn run ..');
    return a+b;
  return fnn;
print(fn(10)(20));
```

**解析：拆分 替换法**

```python
def fn(a):
#//  a =10;
    print('fn run');
    def  fnn(b):  //局部函数 （函数内的函数）
# // b = 20;
        print(' run ..');
        return a+b;
    return fnn;   //函数名只有加（），才表示调用函数执行。否则只是引用地址的传递
#//fnn();  报错， 原因：局部函数外部不能访问，
#//print(fn(10)(20));
x = fn(10);  #//x = func2     x里存放的是函数执行的结果，即 return 后面的东西
y= x(20);    #//y = func2(20);  局部函数可以通过return暴露给外面访问。
             #//  y = a+b;   y里面存放函数执行的结果（即return 后面的东西）
print(y);    #//30；	
```

### 返回对象

```python
def fun():
  return {
    'name': 'ivan',
    'driver':lambda str:'can dirver '+str,
  };
print('Person '+ fun()['name']);
print(fun()['driver']('car'));
```

### 作用域

作用域： 能读写变量函数的范围  -->  权限

```python
country = 'china'; #// 全局变量(任意地方用）

def fn():       #// 函数作用域分函数内外
    country = 'yindu';
    age = 35;    #// 局部变量
    print('fn: ', country);
    print('fn: ', age);
    def fn1():  #//局部函数
        print('fn1 go ');

print(country);
fn();
print(age); #// 不能访问函数内部资源， 故报错NameError::age is not defined
fn1(); #// 局部函数不能访问
```

**作用域链(挑战)	**

 函数嵌套 --> 形成链条 --> 变量回溯（当前没有，沿着链条追查上家）

```python
name = "first";
def fn1():
    name = "second";
    def fn2():
        print(name); #// 变量回溯（当前没有，追查上家）
    fn2();
    print(name);

fn1();
print(name);
fn2(); #// fn2是局部函数，不能访问
```

**下面程序输出的信息是**

```python
country='china';  #//全局变量(任意地方用）
age =80;
def fn():
  country = 'yindu';
  print('2 level country is ',country);
  name1 = 'ivan';  #//局部变量(只能在函数内部用）
  age =30;      #//同名时，在局部作用域内（函数内），局部变量有效。

  def fn():      #//嵌套子函数
    print('3 level name is ',name1);  #//子函数可用父函数作用域内的变量 
    age =8;
  fn();
  print('2 level age is ',age);
fn();
print('1 level age is ',age);    #//80 同名时：函数外，全局变量的有效 
print('1 level name is ',name1); #//不能访问局部变量 NameError: name 'name1' is not defined
```

**下面程序输出的信息是**

```python
i=0;
def fn1(i):
  print( 'i = ',i);

a = [1,2,3];
def fn(callback):
  for i in range(3):
    a[i] = callback;
  callback(i);
fn(fn1);
a[0](i);
a[1](i);
```

## 函数式编程(挑战):面向映射

命令式编程(面向过程): 关心执行步骤，有变量，表达式，控制语句等 -> 解决步骤(告诉机器 怎么做)

元编程(面向对象): 以对象(独立个体)为核心，组织数据和关系 ->  找对象(告诉机器 是谁做的) 

函数式编程(面向映射):像数学函数(表达式)一样计算，无需更改状态和数据 ->  映射关系(告诉机器 做什么) 

### 匿名函数(用于 中间处理 无需命名 -》简洁 ) 

```python
fn = lambda x:x+10;  #//创建匿名函数lambda，让变量fn 指向它
	             #//lambda:冒号 左侧表示函数接收的参数x ,右侧表示函数的返回值x+10
	             #//等价于 def fn(x):return x+10
print(fn(1));
print((lambda x:x+10)(3)) #//可定义调用一气完成

c = lambda x,y=2: x+y    //默认值
print(c(10))	

L = [(lambda x: x**2),(lambda x: x**4)]  //字典中
print(L[0](2),L[1](2));
print((lambda x,y: x if x> y else y)(3,5))  //求最值（类三目运算）
```

### 高阶函数: 以函数为参数或返回值的函数

对列表的元素都求平方

```python
def square(x):  #//普通函数
	return x**2
	
a = map(square, [1,2,3]) #//高阶函数:以函数为参数或返回值的函数
	
print(list(a))	  #//map返回类型是map，需用list转换为列表	
```

```text
[1, 4, 9]
```

square 只是中间转换作用，可以用匿名函数-> 省去取名烦恼（因没必要取名）		

```python
a = map(lambda x: x**2, [1,2,3])
print(list(a))	
```

### 闭包:内部函数用到外部的变量 -》驻留：信息保持

```python
def outer(x):
    def inner(y):  #//inner是闭包，它引用外部的变量x
        return x + y
    return inner 

a = outer(2)
print('result:',a(3)) #//驻留了前面2的信息
```

+ 驻留：信息保持(引用在，资源不回收)

```python
例: 资料上传一半，可接着上传
def register(name): //注册信息
    def upload(age): //提交信息
        print('name:', name, 'age:', age);
    return upload;

step = register('wangwei');  //第一步，填入姓名
step(26); #//第二步，填入年龄 ，驻留(保持)了前面姓名的信息
          #//也突破作用域限制： 能调用内部函数fnn  （通过引用访问函数内的函数）
```

+ 闭包内不能改写，外部函数的同名局部变量`

```python
def outer():
    x = 5        #//python规则，赋值语句左面的变量都是局部变量
    def inner(): #//上面一行的x相对inner函数来说是函数外的局部变量（非全局变量）    	           
        x *= x   #//不能改写函数外的同名变量  error
        return x
    return inner
outer()()	
```



解决办法：通过复合数据类型来解决 (因它不是存在栈空间)

```python
def outer():
    x = [5]   #//变为容器类(复合类型)，因它不是存在栈空间上 (它内部又指向另一空间)
    def inner(): 
        x[0] *= x[0]
        return x[0]   
    return inner   #//返回函数名（暴露内部信息 ）

print(outer()())  #25	
```

###  作业：棋盘移动

**作业：棋盘移动**

```text
假设棋盘大小为50*50，左上角为坐标系原点(0,0)，
设计一个函数，接收2个参数，分别为方向(direction)，步长(step)，
该函数控制棋子的运动。棋子运动的新的坐标除了依赖于方向和步长以外，
当然还要根据原来所处的坐标点，用闭包就可以保持住这个棋子原来所处的坐标。
```



```python
origin = [0, 0] 
legal_x = [0, 50]  
legal_y = [0, 50] 
def create(pos=origin):   
    def player(direction,step):        
        new_x = pos[0] + direction[0]*step    
        new_y = pos[1] + direction[1]*step    
        pos[0] = new_x    
        pos[1] = new_y    
        #//注意！此处不能写成 pos = [new_x, new_y]，因为参数变量不能被修改，而pos[]是容器类的解决方法 
        return pos   
    return player    

player = create() # //创建棋子player，起点为原点  
print(player([1,0],10)) # //向x轴正方向移动10步  
print(player([0,1],20)) # //向y轴正方向移动20步  
print(player([-1,0],10)) # //向x轴负方向移动10步 
```





## 面向对象

### 初识

```python
class Actor:       #//定义类(只是想法)
  name = '赵丽颖'  #//类属性
  age  = 35
  def act(self):   #//类行为(方法)：形参self必须有，类似java中的this代表类的实例， 
    print(self.name," 会演戏")
  def sing(self):
    print(self.name," 会唱歌")

obj = Actor() #//创建类的实例对象 
print(obj.name) #//访问对象的属性
print(obj.age)
obj.act()     #//调用对象的方法（无参，但其实有参，它是隐藏的第一个实参，为类的实例)	
obj.sing()    

#//动态语言：可动态添加属性和方法(python是动态语言,不像c++静态语言，定义完后，后面不能修改)
obj.addr="成都"  #//动态添加属性
print(obj.addr)

def show(self):
    print(self.name,self.age,self.addr);

obj.show = show; #//动态添加方法
obj.show(obj) #//动态添加的要传入对象实例，不能隐藏
obj.sing() 	

```



输出：

```tex
赵丽颖
35
赵丽颖  会演戏
赵丽颖  会唱歌
成都
赵丽颖 35 成都
赵丽颖  会唱歌
```

### 



### 定义父类

```python
class Animal:      #//定义类(只是想法)
  name = 'animal'  #//类属性
  def eat(self):   #//类行为(方法)：形参self必须有(类似this)，代表类的实例
    print(self.name," can eat")
  def breath(self):
    print(self.name," can breath")
  def run(self):
    print(self.name," can run")	

#//父类：通常是抽象出来的
```



### 子类的继承

```python
class Cat(Animal):    #//定义子类Cat继承于类Animal(父类）
   name='cat'
   def catchMouse(self):  #//派生的新方法
     print(self.name," can catchMouse")
   def breath(self):
     print(self.name," can breath from air")		

class Fish(Animal):    
   name='fish'
   def swim(self):  #//派生的新方法
     print(self.name," can swim")
   def breath(self,str):
     print(self.name," can breath from ",str)	
```

**继承：复用(不用重复写父类方法)**

**扩展：子类Cat在继承父类Animal的能力eat，run基础上，可派生新能力，如catchMouse**

**隐藏：子类会把父类的同名方法挡住**



### 类的使用

```python
c = Cat()  #//新建类的实例对象c 
c.catchMouse()
c.breath()
c.run()

f = Fish() #//新建类的实例对象f 
f.eat();
f.breath('water');
f.swim();
f.breath();   #//会报错参数个数不匹配，因子类会隐藏了父类的同名函数, 
              #//1.用默认参数解决
              #//def breath(self,str='water')  
	     	  #//   print(self.name," can breath from ",str)	
	      	  #//注意：用重载不行，下面的同名函数会覆盖上面的同名函数，不会智能匹配参数个数
              #//2.用不定参  
```



### 多重继承

```python
class Father:
  name ="father";
  def football(self):
    print(self.name,"play football good");
  def talk(self):
    print(self.name, "talk fast");

class Mother:
  name ="mother"
  def music(self):
    print(self.name,"play music good");
  def talk(self):
    print(self.name, "talk slow");

class Son(Father,Mother): #//多重继承：儿子同事继承父母天赋
  name ="son"
  def draw(self):
    print(self.name,"draw good");

s =Son();
s.football();
s.music()
s.draw()
s.talk()  #//python没有二义性问题（c++有），父母都有时，以前一个为准

```

```tex
son play football good
son play music good
son draw good
son talk fast
```



### 多态(未来性)

```python
def play(obj):    
  obj.breath()  #//使用者在不知道具体对象情况下，直接掉接口breath. 
                #//breath会根据对象做调整

play(c);   
play(f); 
```





### 构造函数 析构函数

```python
class Line:
  name='a line'
  def __init__(this,len=3): #//可选，无时，会有默认的
    this.length = len  # 直接可以增加属性
    print('构造函数运行')
  def __del__(this): #//可选，无时，会有默认的
    print('析构函数运行，释放资源')
  def show(this):
    print('length is',this.length);


obj = Line() #//创建对象实例时，自动调用构造函数。
obj.show();  #//执行完自动析构(引用计数方式，进行垃圾回收)
print('length is ',obj.length);
```



输出：

```tex
构造函数运行
length is 3
length is  3
析构函数运行，释放资源
```





### 权限



```python
class Girl:      #//定义类(只是想法)
  name = 'girl'
  __age = 30     #//私有属性(以下划线开头)
  def registerInfo(this):
    print(this.name,'age is ',this.__age)  #//私有属性仅内部能访问
  def __getAge(this): #//私有方法(以下划线开头)
    print('private __getAge is ',this.__age)

g = Girl()
g.registerInfo()
print(g.name)
g.__getAge()        #//报错： 私有方法外部不能访问 
print(g.__age)      #//报错： 私有属性外部不能访问   (女孩年龄是秘密)        
print(g._Girl__age) #//通过这种方式，外面也能够访问“私有”变量；调试中是比较有用的！
```



### 链式调用

```python
class Person:
  def name(self, str):
    self.name = str
    return self
  def age(self, str):
    self.age = str
    return self
  def show(self):
    return self.name,self.age

obj=Person()
print(obj.name("ivan").age(37).show())	
```

输出

```tex
('ivan', 37)
```



**作业**

用链式调用，实现多关键词的信息查询,例如 

```python
query.filter(name='lili').filter(age__gt=18, address='chengdu').filter(salary=12000)
print(query.query_condition)  #//最后提交给数据库的查询信息
```





```python
class Query():
    def __init__(self):
        self.query_condition = {}
    def filter(self, **kwargs):
        self.query_condition.update(kwargs)
        return self
				
query = Query()
a = query.filter(name='lili').filter(age__gt=18, address='chengdu').filter(salary=12000)
print(query.query_condition) #//最后提交给数据库的查询信息
```



用到了字典的update方法向里面更新添加数据



```tex
{'name': 'lili', 'age__gt': 18, 'address': 'chengdu', 'salary': 12000}
```





### 列表对象

列表对象，升级版的数组

```python
worker=['yzg','ivan','liwei']; #//创建列表
print(worker[0]);
print(worker);

a2=[[2,3,4],[5,6,7],[8,9,10]]; #//创建多维列表
print(a2[1][2]);
a2[2] = 'ivan';
print(a2);
```



**对象列表的实现**



```python
worker=['yzg','ivan','liwei']; #//创建列表
print(worker[0]);
print(worker);

a2=[[2,3,4],[5,6,7],[8,9,10]]; #//创建多维列表
print(a2[1][2]);
a2[2] = 'ivan';
print(a2);
```



**改变原列表的操作方法**

```python
#//---增删改
a = [2,5,9];
print(a);
a.append(9);      #//从尾部添加 (append是列表对象内置的方法函数)
print(a);
a.extend(['lili',9]) #//从尾部添加多个元素
print(a);

a.pop();          #//从尾部删除
print(a);
a.remove(5);      #//删除指定元素
print(a);

a.insert(1, 'i')  #//插入指定位置
print(a);
a.insert(-2, '-i') #没有 -0  
print(a);

worker = ['ivan','yzg','lili','ww']
worker[3] = 'wangw'  #//元素的更改 
print(worker)
#//---选取 
age = [13,10,15,50,22,60,20];
print(age[2:5])
print(age[2:])
print(age[:3])
print(age[-2:])	
age[2:5]=3,3,3 # 批量插入
print(age)
	
#//---排序
age = [13,10,15,50,22];
age.sort();           #//升序（直接在原列表上修改）
print(age);

stu = ['lili','ivan','ara11111','1ciga'];  
print(stu)  
stu.sort();           #//排序以第一个字符来排序（数字先排，排完后，按字母顺序）
print(stu);  	

age.reverse();        #//颠倒  （升序颠倒后就是降序）  
print(age);	   

```



**不改变 原列表的操作方法**

```python
#//---查找
arr = [1, 2, 2,3];
print(len(arr));      #//查看列表的长度
print(arr.count(2));  #//查看指定元素的个数
print(max(arr));      #//查看最大值的元素 
print(min(arr));      #//查看最小值的元素 
	
print(arr.index(2)) #//查找元素位置
print(2 in arr)	    #//有该元素吗
#//---遍历
age = [40,20,10,30];
sum=0;
for v in age:
  sum+=v
print(sum);

#//---转换
name=['ivan','yzg','lili'];
print(" ".join(name))               #//转换为字符串
list =[1,2,5,7,9]
print([v*10 for v in list if v>5]); #//列表推导
	
#//---运算
age1 = [13,10,15]
age2 = [10,5]
age = age1+age2     #//拼接
print(age)
print(age2*2)      
print(age1==age2)   #//判断两列表是否相等

ret = map(lambda x:x-2,[1,2,3]) #//map映射会遍历列表元素进行转换（调用回调函数lambda）
print([v for v in ret])         #//因map后的对象不能通过print(ret)输出

ret = map(lambda x,y:x-y,age1,age2)   #//相减(通过map实现）
print([v for v in ret]) 
```





