package com.javayum;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args) {
        loanBook lb = new loanBook();
        Member member = new Member();
        Book book1 = new Book("1", "21", "思考快与慢", true);
        Book book2 = new Book("2", "22", "伟大的博弈", true);
        Book book3 = new Book("3", "23", "华尔街见闻", true);
        Book book4 = new Book("4", "24", "聪明的投资者", true);

        System.out.println(lb.loadBook(member, "ljg", book1));
        System.out.println(lb.loadBook(member, "ljg", book2));
        System.out.println(lb.loadBook(member, "ljg", book3));
        System.out.println(lb.loadBook(member, "ljg", book4));

        System.out.println( lb.loadBook(member,"zy",book1));

        System.out.println(member.Return(book1));
        System.out.println( lb.loadBook(member,"zy",book1));



    }
}