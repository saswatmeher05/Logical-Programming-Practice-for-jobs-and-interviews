/*	You have to implement a online library using a custom java Class "Library" 
	Methods: addBook, issueBook, returnBook, showAvailableBooks
	properties: Array to store available books, Array to store issued books
*/

class  Library
{
	String[] books;
	int no_of_books;
	Library(){
		this.books=new String[100];
		this.no_of_books=0;
	}
	void addBook(String book){
		this.books[no_of_books++]=book;
		System.out.println(book+" has been added.");
	}
	void showAvailableBooks(){
		System.out.println("Available Books are:");
		System.out.println("========================");
		for(int i=0;i<this.books.length;i++){
			if(this.books[i]==null){
				continue;
			}
			System.out.println(this.books[i]);
			}
	}
	void issueBook(String book){
		System.out.println("Issued Books:");
		System.out.println("===============");
		for(int i=0;i<this.books.length;i++){
			if(book.equals(this.books[i])){
				System.out.println(book+" has been issued.");
				this.books[i]=null;
			}
		}
	}
	void returnBook(String book){
		addBook(book);
	}

	public static void main(String[] args) 
	{
		Library customLibrary=new Library();
		System.out.println("Online Library");
		System.out.println("==================================");
		customLibrary.addBook("RD Sharma Mathematics");
		customLibrary.addBook("Algebra by Mr.Someone");
		customLibrary.showAvailableBooks();
		customLibrary.issueBook("Algebra by Mr.Someone");
		customLibrary.showAvailableBooks();
		customLibrary.returnBook("Algebra by Mr.Someone");
		customLibrary.showAvailableBooks();
	}
}
