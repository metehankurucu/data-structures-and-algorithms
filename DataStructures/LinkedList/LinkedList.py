class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0
    
    def isEmpty(self):
        return self.size == 0
    
    def addFirst(self, data):
        self.addAt(0, data)

    def addLast(self, data):
        self.addAt(self.size, data)

    def removeFirst(self):
        self.removeAt(0)

    def removeLast(self):
        self.removeAt(self.size - 1)

    def remove(self, data):
        if(self.head is None):
            return
        
        if(self.head.data == data):
            self.removeFirst(0)
            return

        current = self.head
        while(current.next != None):
            if(current.next.data == data):
                current.next = current.next.next
                self.size = self.size - 1
                return
            current = current.next


    def addAt(self, index, data):
        newNode = Node(data)

        if(self.size == 0):
            self.head = newNode
            self.size = 1
            return
        
        if(index == 0):
            newNode.next = self.head
            self.head = newNode
            self.size = self.size + 1
            return

        current = self.head
        count = 0
        while(current != None):
            if(count + 1 == index):
                newNode.next = current.next
                current.next = newNode
                self.size = self.size + 1
                return
            current = current.next
            count += 1

        current.next = newNode
        self.size = self.size + 1
    

    def removeAt(self, index):
        if(self.size == 0):
            return
        
        if(index == 0):
            self.head = self.head.next
            self.size = self.size - 1
            return

        current = self.head
        count = 0
        while(current != None):
            if(count + 1 == index):
                current.next = current.next.next
                self.size = self.size - 1
                return
            current = current.next
            count += 1


    def toArray(self):
        arr = []
        current = self.head
        while(current != None):
            arr.append(current.data)
            current = current.next
        return arr

    def fromArray(self, arr):
        for i in arr:
            self.addLast(i)

