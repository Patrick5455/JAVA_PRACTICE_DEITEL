package exercises_8.enumTypes;

import  java.util.EnumSet;

public class DisplayBook {

    public static void main(String... args) {

        System.out.println("ALL BOOKS");
        for (Book book : Book.values())
             System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getYear());


        System.out.println("\nRange of First Four Books");

        for (Book book: EnumSet.range(Book.JHTP, Book.VBHTP))
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getYear());
    }

}
