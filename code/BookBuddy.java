package com.gla;

import java.util.ArrayList;

public class BookBuddy {

	ArrayList<String> bookshelf=new ArrayList<>();
	
	public void addBook(String title, String author) {
		String entry=title+"-"+author;
		bookshelf.add(entry);
	}
	
	public void searchByAuthor(String author) {
		boolean flag=false;
		for(String book:bookshelf) {
			String []arr=book.split("-");
			if(arr.length==2 && arr[1].equalsIgnoreCase(author)) {
				System.out.println(book);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("No book found");
		}
	}
	
	public String[] listToArray() {
		return bookshelf.toArray(new String[0]);
	}
	
	public void sortBooksAlphabetically() {
		int n=bookshelf.size();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				String str1=bookshelf.get(j).split("-")[0];
				String str2=bookshelf.get(j+1).split("-")[0];
				if(str1.compareToIgnoreCase(str2)>0) {
					String temp=bookshelf.get(j);
					bookshelf.set(j,bookshelf.get(j+1));
					bookshelf.set(j+1,temp);
				}
			}
		}
	}
	
	public void display() {
		for(String book:bookshelf) {
			System.out.println(book+" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		BookBuddy obj=new BookBuddy();
		
		obj.addBook("Atomic Habit", "James Clear");
		obj.addBook("The power of Habit","Charles Duhigg");
		obj.display();
		
		System.out.println();
		
		obj.searchByAuthor("James Clear");
		
		System.out.println();
		
		
		obj.sortBooksAlphabetically();
		obj.display();
		
		System.out.println();
		
		String[] booksArr=obj.listToArray();
		for(String book:booksArr) {
			System.out.println(book);
		}
		
		
		
		
		
		
	}
}
