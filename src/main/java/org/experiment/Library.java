package org.experiment;

public class Library {
    public static Book [] storeBook = new Book[15];
    public static void add(Book b)
    {
     b.setNo(+1);
     b.setName("W Pustyni i w Puszczy");
     b.setAuthor("Sienkiewicz");
    }

    public static void getin(Book b) {
        b.getAuthor();
        b.getName();
        b.getNo();
    }


}
