class Node {
  data;
  next;
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class Stack {
  head;

  constructor() {
    this.head = null;
  }

  push(data) {
    const newNode = new Node(data);

    if (this.head == null) {
      this.head = newNode;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  pop() {
    const temp = this.head;
    this.head = this.head.next;
    return temp;
  }

  peek() {
    const temp = this.head;
    return temp;
  }

  print() {
    let current = this.head;
    console.log(" ");
    while (current != null) {
      console.log("| " + current.data + " |");
      current = current.next;
    }
    console.log("-----");
  }

  isEmpty() {
    return this.head === null;
  }
}

module.exports = Stack;
