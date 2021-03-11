## GO基本语法

### 声明变量

> var name type

 var a, b *int  两个都是指针类型。在C语言中 `int *a,b`指的是a为int *   ,b为int类型

Go都有哪些类型呢

+ bool
+ string
+ int int8 int16 int32 int64
+ uint、uint8、uint16、uint32、uint64、uintptr

+ byte // uint8 的别名

+ rune // int32 的别名 代表一个 Unicode 码

+ float32、float64

+ complex64、complex128

   变量被声明后自动会赋值(注意默认值)

可批量声明

```go

var (
    a int
    b string
    c []float32
    d func() bool
    e struct {
        x int
    }
)
```

简短声明初始化

> 名字 := 表达式

限制：

+ 定义变量，同时显式初始化。
+ 不能提供数据类型。
+ 只能用在函数内部。

```go
i, j := 0, 1 //i=0 j=1 并且i j之间没有声明过

```



### 初始化

**标准格式**

> var 变量名 类型 = 表达式

 var hp int = 100

**推导格式类型**

> var 变量名 = 表达式

 var hp = 100  推到hp为int

```go
var attack = 40   //推到为int
var defence  = 40   //推到为int
var damageRate2 = 0.17 //推导问float64
var damageRate float32 = 0.17 //指定为float32
var damage = float32(attack-defence) * damageRate  //结果为float32
```

**短变量并初始化**

>  名字 := 表达式

:= 只能用在没有声明过的变量上，上面已经提到过

```go
// 声明 hp 变量
var hp int
// 再次声明并赋值
hp := 10 //error-----no new variables on left side of :=

```

```go
conn, err := net.Dial("tcp","127.0.0.1:8080")//函数返回两个值可以这么接收 
```

左值有多个的时候至少有一个是没有被声明过的

```go
conn, err := net.Dial("tcp", "127.0.0.1:8080")
conn2, err := net.Dial("tcp", "127.0.0.1:8080") //no error

```

### Go语言多个变量同时赋值

一个go中交换数值的例子，利用了go语言中多重赋值的属性

```go
	var a int = 100
	var b int = 200
	b, a = a, b
	fmt.Println(a, b)
```

### 匿名变量（无名字的变量）

`_` 来表示匿名变量，任何值都可以赋，只不过赋值完之后被抛弃不能使用。在接收函数的返回值的时候可占位

```go
func GetData() (int, int) {
    return 100, 200
}
func main(){
    a, _ := GetData()
    _, b := GetData()
    fmt.Println(a, b)
}
```

```text
100 200
```

> 匿名变量不占用内存空间，不会分配内存。匿名变量与匿名变量之间也不会因为多次声明而无法使用。

### Go语言变量的作用域

三种变量

+ 局部变量 ：函数内定义
+ 全局变量：函数外定义
+ 形        参：函数头中定义的变量

### Go语言整型

int8、int16、int32 和 int64   四种有符号整型

 uint8、uint16、uint32 和 uint64  四种无符号整型 

数字代表它们所占的位数

int 和 uint  会根据CPU平台的字长来确定（字长所占的字节在不同位数的机器下不同）

Unicode 字符的 rune 类型和 int32 类型是等价的

byte 和 uint8 也是等价类型      byte一般强调存储的数值   uint8 强调的是整数

还有一种无符号的整数类型   uintptr 存储指针

int 和 uint的使用需要注意会受到平台字长的影响，在有些情况（二进制传输，文件的描述结构）是不合适使用的

### GO语言浮点类型

