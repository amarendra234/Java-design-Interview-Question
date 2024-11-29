import java.util.*;
public class Member {
  private int id;
  private String name;
  private List<Book>borrowbooks;
 
   // constructor to Intilize all member
   public Member(int id,String name){
      this.id=id;
      this.name=name;
      borrowbooks=new ArrayList<>();
   }
   // making getter setter method

   public int getid() { return id;}
   public String getname() { return name;}
   public List<Book> getborrowedbook() { return borrowbooks;}

   // borrow a book
   public void borrowBook(Book book){
       borrowbooks.add(book);
   }
   public void returnbook( Book book){
     borrowbooks.remove(book);
   }
   @Override
    public String toString(){
        return "Member [id=" + id + ", name=" + name +
        ", borrowedBooksCount=" + borrowbooks.size() + "]";
    }

}
