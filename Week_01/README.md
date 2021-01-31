####学习笔记
### 一维

- 基础

	- 数组Array （string）

		- 连续、类型一致、查询快、增删慢

			- 时间复杂度

				- 查询O(1)
				- 增删O(n)

	- 链表linked list

		- 可以不连续、增删快、查询需要遍历、慢

			- 时间复杂度

				- 查询O(n)
				- 增删O(1)

- 高级

	- 栈stack

		- 先进后出

			- 添加删除O(1)
			- 查询 O(n)  遍历

		- 代码实现

			- Stack<Integer> stack=new Stack<>();
			- stack.push();
			- stack.pop();

		- 继承 Vector

			- 底层可变数组

		- 实践

			- 最近相关性

				- 问题可以由内到外或右外到内的分解

	- 队列queue

		- 先进先出

			- 添加删除O(1)
			- 查询 O(n) 遍历

		- 代码实现

			- Queue<String> queue=new LinkedList<String>();
			- queue.offer("aa");
			- queue.poll();

		- 先来后到问题

	- 双端队列 deque

		- Deque<String> deque=new LinkedList<String>();
		- 为给定一个类型的元素进行线性处理、能够快速随机访问任何一个元素
		- 高效地插入、删除容器尾部元素
		- 支持高效的插入和删除容器头部元素
		- 将双端队列用作队列时，FIFO

			- 将元素添加到双端队列的末尾，从双端队列的开头移除元素

		- 用作LIFO堆栈

			- 元素被推入双端队列的开头，并从双端队列的开头弹出

		- LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用

	- Priority Queue

		- 插入操作 O（1）
		- 取出操作 O（logN）- 按照元素的优先级取出
		- 底层具体实现的数据结构较多样和复杂

			- heap
			- bst
			- treap