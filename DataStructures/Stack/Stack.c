#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node node;
typedef struct node *nodePtr;

int push(nodePtr *, int);
nodePtr pop(nodePtr *);
nodePtr peek(nodePtr *);
void printStack(nodePtr *);

int main()
{

    nodePtr head = NULL;

    push(&head, 1);
    push(&head, 2);
    push(&head, 3);
    push(&head, 4);
    push(&head, 5);

    printStack(&head);
    pop(&head);
    printStack(&head);
    pop(&head);
    printStack(&head);

    nodePtr item = peek(&head);

    if (item == NULL)
        printf("\nStack is empty");
    else
        printf("\nTop of stack is %d\n", item->data);

    return 1;
}

int push(nodePtr *head, int data)
{
    nodePtr newNode, temp;

    newNode = malloc(sizeof(node));
    newNode->data = data;
    newNode->next = NULL;

    if (*head == NULL)
    {
        *head = newNode;
    }
    else
    {
        temp = *head;
        newNode->next = temp;
        *head = newNode;
    }
    return 1;
}

nodePtr pop(nodePtr *head)
{
    nodePtr temp;

    //Empty
    if (*head == NULL)
        return NULL;

    temp = *head;

    *head = (*head)->next;
    return temp;
}

void printStack(nodePtr *head)
{
    nodePtr current = *head;

    printf("\n");
    while (current != NULL)
    {
        printf("| %d |\n", current->data);
        current = current->next;
    }
    printf("------\n");
}

nodePtr peek(nodePtr *head)
{
    nodePtr temp;
    temp = *head;
    return temp;
}
