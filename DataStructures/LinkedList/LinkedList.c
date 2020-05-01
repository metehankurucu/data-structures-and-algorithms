#include <stdio.h>
#include <stdlib.h>

struct node
{
	int data;
	struct node *next;
};

typedef struct node node;
typedef struct node *nodePtr;

int insert(nodePtr *, int);
nodePtr delete (nodePtr *, int);
nodePtr search(nodePtr *, int);
void printList(nodePtr *);

int main()
{

	nodePtr head = NULL;

	insert(&head, 1);
	insert(&head, 2);
	insert(&head, 3);
	insert(&head, 4);
	insert(&head, 5);

	printList(&head);

	nodePtr item = search(&head, 3);

	if (item == NULL)
		printf("item not found");
	else
		printf("item found => %d", item->data);

	return 1;
}

int insert(nodePtr *head, int data)
{
	nodePtr newNode, current;

	newNode = malloc(sizeof(node));
	newNode->data = data;
	newNode->next = NULL;

	if (*head == NULL)
	{
		*head = newNode;
		return 1;
	}

	current = *head;
	if (current != NULL)
	{
		while (current->next != NULL)
			current = current->next;

		current->next = newNode;
	}

	return 1;
}

nodePtr delete (nodePtr *head, int data)
{
	nodePtr current;

	//List empty
	if (*head == NULL)
		return NULL;

	current = *head;

	//Head will be deleted
	if (current->data == data)
	{
		*head = current->next;
		return current;
	}

	while (current->next != NULL)
	{

		//Found node
		if (current->next->data == data)
		{
			nodePtr temp = current->next;
			current->next = current->next->next;
			return temp;
		}
		current = current->next;
	}

	//Not found
	return NULL;
}

void printList(nodePtr *head)
{
	nodePtr current = *head;

	printf("\n");
	while (current != NULL)
	{
		printf("%d ", current->data);
		current = current->next;
	}
}

nodePtr search(nodePtr *head, int data)
{
	nodePtr current;

	current = *head;

	while (current != NULL)
	{
		//Found node
		if (current->data == data)
		{
			return current;
		}
		current = current->next;
	}

	//Not found
	return NULL;
}
