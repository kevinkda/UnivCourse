作业1： 题目：利用继承、多态、类与类之间的关联关系实现可扩展的连连看数据模型算法，要求实现生成地图、判定两个节点是否能够连接的功能。进行连接判定是要求能够扩展：即提供默认的两折以内的连接之外额外提供三折连接和随意连接（需要提供基本的随机数生成代码）

考点：二维数组、继承、多态

难度：中

作业2：题目：利用继承、多态、类与类之间的关联关系和lambda等实现对音乐播放设备的抽象描述，要求：
音乐播放器拥有存储器，存储器有一个public byte[] read(String fileName)方法读取文件，存储器分为内置存储器和tf读卡器
播放器拥有一个cpu，分为专用处理器和通用处理器两种，它们有一个public byte[] processor（String fileName）方法先利用存储器的read()方法读取文件，然后处理文件，结果仍为byte[]
播放器都有一个play(String fileName)方法调用操作系统的play方法进行音乐播放，音乐播放器均拥有操作系统（分为智能和非智能系统，操作系统包括bootloader()方法用于启动，play(play(String fileName)方法用于播放音乐，该方法首先交给processor()处理获取byte[]，然后交给解码器播放，解码器分为软件解码器和硬件解码器，解码器提供decode ()方法进行音乐播放，CPU承担软件解码器的功能）
提供一个静态方法用于组合创建符合要求的音乐播放器设备

考点：静态方法、继承、多态、类与类的关联关系、lambda、this

难度：中





public byte[] read(String fileName)
public byte[] processor（String fileName）
play(String fileName)
read()
bootloader()