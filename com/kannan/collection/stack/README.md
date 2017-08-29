##Describe stack operation.

Stack is a data structure that follows Last in First out strategy.

**Stack Operations:-**

|  | Description |
| ---- | ---------------------------------------------|
| Push | Pushes (inserts) the element in the stack. The location is specified by the pointer.|
| Pop  | Pulls (removes) the element out of the stack. The location is specified by the pointer.|
|Swap  | the two top most elements of the stack can be swapped.|
|Peek  | Returns the top element on the stack but does not remove it from the stack.|
|Rotate| the topmost (n) items can be moved on the stack in a rotating fashion.|


A stack has a fixed location in the memory. When a data element is pushed in the stack, the pointer points to the current element

####Describe queue operation.

Queue is a data structure that follows First in First out strategy.

**Queue Operations:**

|  | Description |
| ---- | ---------------------------------------------|
| Push | Inserts the element in the queue at the end. |
| Pop  | removes the element out of the queue from the front.|
| Size | Returns the size of the queue.|
| Front| Returns the first element of the queue. |
| Empty| to find if the queue is empty.|

####Discuss how to implement queue using stack.


A queue can be implemented by using 2 stacks:-
1. An element is inserted in the queue by pushing it into stack 1
2. An element is extracted from the queue by popping it from the stack 2
3. If the stack 2 is empty then all elements currently in stack 1 are transferred to stack 2 but in the reverse order
4. If the stack 2 is not empty just pop the value from stack 2.

####Explain stacks and queues in detail.

A stack is a data structure based on the principle Last In First Out. Stack is container to hold nodes and has two operations - push and pop. Push operation is to add nodes into the stack and pop operation is to delete nodes from the stack and returns the top most node.

A queue is a data structure based on the principle First in First Out. The nodes are kept in an order. A node is inserted from the rear of the queue and a node is deleted from the front. The first element inserted in the first element first to delete.

####Question - What are priority queues?

A priority queue is essentially a list of items in which each item has associated with it a priority
Items are inserted into a priority queue in any, arbitrary order. However, items are withdrawn from a priority queue in order of their priorities starting with the highest priority item first.

Priority queues are often used in the implementation of algorithms

####Question - What is a circular singly linked list?

In a circular singly linked list, the last node of the list is made to point to the first node. This eases the traveling through the list.

## Ref:
http://www.careerride.com/Interview-Questions-Data-Structures-Stack-queue.aspx
