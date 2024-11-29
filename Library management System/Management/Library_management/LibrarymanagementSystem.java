public class LibrarymanagementSystem {
     public static void main(String[] args){
        Library library=new Library();
        library.addbook(new Book(1,"Atomic habbit","Amarendra","97808923345"));
        library.addbook(new Book(2,"5 am club","robert kiyosaki","8978898989899"));
        library.addbook(new Book(3,"rich dad poor dad","rynda bryan","90898989898"));
        library.addbook(new Book(4,"the mystery","james thon","124568989898"));
        //library.showbooks();
        library.addmember(new Member(1, "Alice"));
        library.addmember(new Member(2, "Bob"));
        library.issueBook(1, 1);
       // library.showbooks();
       library.showmember();
       library.returnbook(1, 1);
       library.showmember();
      
        

     }
}
