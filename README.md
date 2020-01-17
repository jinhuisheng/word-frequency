# word-frequency

Word Frequency 单词频率需求

* 我想要一个程序，它可以帮我处理一段字符串信息，这段字符串信息是由英文单词组成，每两个单词之间有空格，
* 处理结果也为一段字符串，这个字符串应该每行只显示一个单词和它的数量，并且按出现频率倒序排列

"he is is a boy" ==> 
is 2
he 1
a 1
boy 1

## 正常逻辑
* "" => ""
* "he" => he 1
* "he is" => he 1\nis 1
* "he he is" => he 2\nis 1
* "he is is" => is 2\nhe 1

## 异常逻辑
* "he  is" => 输入不合法

