package com.uttara.interfaces;

public interface Stack {
	public void push(int element);
	public int pop();
	public void peek();
	public void printElements();
}

class ArrayStack implements Stack
{
	int[] arr = new int[4];
	int top = -1;
	int count = 0;
	
	@Override
	public void push(int element) {
		if(top < arr.length-1)
		{
			arr[++top] = element;
			count++;
		}
		else
			System.out.println("Stack is overflow");
	}
	
	@Override
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			int data;
			data = arr[top];
			arr[top--] = 0;
			count--;
			return data;
		}
		
	}
	
	public void peek() {
		if(count > 0)
			System.out.println("Number of elements is "+count);
		else 
			System.out.println("Stack is empty");
	}
	public void printElements() {
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

class TestStack
{
	public static void main(String[] args)
	{
		ArrayStack a = new ArrayStack();
		a.push(5);
		a.push(6);
		a.push(18);
		a.push(18);
		a.push(18);
		a.peek();
		a.printElements();
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.peek();
		a.printElements();
	}
}