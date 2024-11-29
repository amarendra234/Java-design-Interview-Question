public class Book {
      private int id;
      private String title;
      private String aurthor;
      private String isbn;
      private boolean isAvailable;

      public Book(int id, String title,String aurthor,String isbn){
           this.id=id;
           this.title=title;
           this.aurthor=aurthor;
           this.isbn=isbn;
           isAvailable=true;
      }
      public int getid() { return id;}
      public String gettitle() { return title;}
      public String getaurthor() { return aurthor;}
      public String getisbn() { return isbn;}
      public boolean isAvailable() { return isAvailable;}
      public void setavailable(boolean available){
         isAvailable=available;
      }

      // object class method is to_string print details
      @Override
      public String toString(){
        return "Book [id=" + id + ", title=" + title + ", author=" + aurthor +
        ", isbn=" + isbn + ", available=" + isAvailable + "]";
      }
}
