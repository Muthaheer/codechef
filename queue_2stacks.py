# Program that implements queue using 2 stacks
stack1 = [];
stack2 = [];

def enqueue(item):
	stack1.append(item);

def dequeue():
	# pop all elements of stack1 and push it to stack2
	while(len(stack1)):
		stack2.append(stack1.pop());

	# pop the first element from stack2, which would be the oldest element of the (imaginary) queue
	ele = stack2.pop();

	# pop all elements from stack2 and push back to stack1
	while(len(stack2)):
		stack1.append(stack2.pop());

	return ele;

def display():
	for i in stack1:
		print(str(i));

t = int(input()); # no. of test cases

for i in range(0, t):
	query = list(map(int,input().split(' ')));
	if query[0] == 1:
		enqueue(query[1]);
	elif query[0] == 2:
		dequeue();
	else:
		display();