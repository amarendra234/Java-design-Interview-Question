import java.time.LocalDate;
import java.util.*;


public class Library {
   private List<Book>books;
   private List<Member>members;
   private List<Transaction>transcations;
   private int transcounter;

   public Library(){
      books =new ArrayList<>();
      members=new ArrayList<>();
      transcations=new ArrayList<>();
      transcounter=0;
   }
   
   // adding book in Library
   public void addbook(Book book){
       books.add(book);
   }
   public void addmember( Member member){
      members.add(member);
   }
   // issue a book to an member and do transaction 
   //find member by member id
    public Member findMember(int member_id){
        for(Member member:members){
            if(member.getid()==member_id){
                return member;
            }
        }
        return null;
    }
    // find book by id
    public Book findBook(int book_id){
          for(Book book:books){
              if(book.getid()==book_id){
                return book;
              }
          }
          return null;
    }
   public void issueBook(int memberid,int bookid){
          Member member=findMember(memberid);
          Book book =findBook(bookid);
          if(book!=null && book.isAvailable()){
               book.setavailable(false);
               member.borrowBook(book);
               transcations.add(new Transaction(++transcounter, book, member, LocalDate.now(), "Borrow"));
               System.out.println("Book assign successfully");
          }else{
            System.out.println("Book is not avilable");
          }
   }
   public void returnbook(int member_id,int book_id){
      Member member=findMember(member_id);
      Book book=findBook(book_id);
      if(book!=null && !book.isAvailable()){
          book.setavailable(false);
          member.returnbook(book);
          transcations.add(new Transaction(++transcounter, book, member, LocalDate.now(), "Return"));
          System.out.println("Book returned successfully");

      }else{
        System.out.println("Book is not borrowed");
      }

   }
   // view all books in libarary
   public void showbooks(){
     System.out.println("Books in libraray");
      for(Book book:books){
         System.out.println(book);
      }
   }
   public void showmember(){
     System.out.println("Members avilable");
     for(Member member:members){
        System.out.println(member);
     }
   }
}
