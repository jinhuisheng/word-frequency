# word-frequency

Word Frequency 单词频率需求

* 我想要一个程序，它可以帮我处理一段字符串信息，这段字符串信息是由英文单词组成，每两个单词之间有空格，
* 处理结果也为一段字符串，这个字符串应该每行只显示一个单词和它的数量，并且按出现频率倒序排列

## 框定范围
```java
//    @Test
//    void demo() {
//        assertThat(WordFrequency.calculate("he is is a boy")).isEqualTo("is 2\nhe 1\na 1\nboy 1");
//    }

```
### 名词
单词(换行) 个数 顺序（倒序）

## 正常逻辑
""=>""
"he" => "he 1"
"he is" => "he 1\nis 1"
"he he" => "he 2\n"
"he he is"=>"he 2\nis 1"
"he is is"=>"he 1\nis 2"


## 异常逻辑
* "he  is" => 输入不合法

