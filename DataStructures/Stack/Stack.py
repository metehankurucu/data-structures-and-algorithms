# Stack implementation using Linked list


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:

    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head == None

    # Push item to top of stack
    def push(self, item):
        newNode = Node(item)
        if self.head is None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode

    # Remove and get first item from stack
    def pop(self):
        if not self.isEmpty():
            node = self.head
            self.head = self.head.next
            return node
        return None

    # Get first item of stack without remove
    def peek(self):
        return self.head

    def print(self):
        current = self.head
        while(current is not None):
            print("|" + str(current.data) + "|")
            current = current.next
