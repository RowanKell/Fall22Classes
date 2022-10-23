# CS201 Notes: October 3, 2022

### LinkedList

#### Implementation

1. List implemented using nodes that point to each other
   1. Each node references other nodes
2. Each node carries two pieces of data
   1. An integer info - the info in that node
   2. A node next - the node it points to

#### Construction

1. Calling new Node(...) always creates a node in memory that did not previously exist
2. writing node.next = otherNOde; makes node -> otherNode
3. node.next or node.info gives an error if node ==  null

#### Methods

1. add() and remove()
   1. These are O(1)

#### Example

