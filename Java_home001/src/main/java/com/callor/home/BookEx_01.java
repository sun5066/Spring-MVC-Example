package com.callor.home;

import com.callor.home.service.BookService;
import com.callor.home.service.BookServiceImplV1;

public class BookEx_01 {

    public static void main(String[] args) {
        BookService bookService = new BookServiceImplV1();
        if (!bookService.inputBook()) {
            System.out.println("프로그램을 종료합니다.");
        } else {
            bookService.bookList();
        }
    }
}