import java.time.LocalDate;

public class Transaction {
    private int trancastionid;
    private Book book;
    private Member member;
    private LocalDate date;
    private String type; // type is only "Borrow" or "Return"

    public Transaction(int id,Book book,Member member, LocalDate date, String type){
           trancastionid=id;
           this.book=book;
           this.member=member;
           this.date=date;
           this.type=type;
    }
    public int getid() { return trancastionid; }
    public Book getbook() { return book;}
    public Member getMember() { return member;}
    public LocalDate getdate() { return date; }
    public String gettype() { return type;}
    @Override
    public String toString() {
        return "Transaction [transactionId=" + trancastionid + ", book=" + book.gettitle() +
                ", member=" + member.getname() + ", date=" + date + ", type=" + type + "]";
    }
}
