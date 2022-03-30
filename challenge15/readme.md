# Trees
non-linear data structure defined as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children"

## Challenge
implement binary tree and binary search tree 

## Approach & Efficiency

**binary tree**

| method    | time complexity | space complexity |
|-----------|-----------------|------------------|
| preorder  | o(n)            | O(n)             |
| postorder | O(n)            | O(n)             |
| inorder   | O(n)            | O(n)             |


**binary search tree**

| method  | time complexity | space complexity |
|---------|-----------------|------------------|
| insert  | o(n)            | O(n)             |
| search  | O(log n)        | O(n)             |

## API
preorder => function use stack to travers through the tree in "root->left->right" approach

postorder => function use stack to travers through the tree in "left->right->root" approach

inorder => function use stack to travers through the tree in "left->root->right" approach

insert => insert to array using recursion way

search => function return boolean and tack element to search about using recursion way 