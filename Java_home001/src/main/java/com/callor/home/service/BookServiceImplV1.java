package com.callor.home.service;

import java.util.Scanner;

public class BookServiceImplV1 implements BookService {
    protected Scanner scanner;
    protected String strBCode;
    protected String strBName;

    public BookServiceImplV1() {
        this.scanner = new Scanner(System.in);
    }

    protected boolean inputBookCode() {
        while (true) {
            System.out.print("도서코드(QUIT:종료) >> ");
            strBCode = scanner.nextLine();

            int intBCodeLength = strBCode.length();
            if (intBCodeLength < 0 || intBCodeLength > 5) {
                System.out.println("도서코드는 13자리 이내의 숫자로 입력하세요");
                continue;
            }

            if (strBCode.equals("QUIT")) {
                return false;
            }

            int intBCode = 0;
            try {
                intBCode = Integer.valueOf(strBCode);
            } catch (Exception e) {
                System.out.println("도서코드는 숫자로만 입력해야 합니다");
                continue;
            }

            strBCode = String.format("%05d", intBCode);
            break;
        }
        return true;
    }

    protected boolean inputBookName() {
        while (true) {
            System.out.print("도서명(QUIT:종료) >> ");
            strBName = scanner.nextLine();

            if (strBName.isEmpty()) {
                System.out.println("도서명은 반드시 입력해야 합니다");
                continue;
            }

            if (strBName.equals("QUIT")) {
                return false;
            }

            break;
        }
        return true;
    }

    @Override
    public boolean inputBook() {
        if (!inputBookCode()) return false;
        if (!inputBookName()) return false;

        scanner.close();
        return true;
    }

    @Override
    public void bookList() {
        System.out.println("================================");
        System.out.println("입력한 도서정보");
        System.out.println("--------------------------------");
        System.out.printf("도서코드 : %s\n", strBCode);
        System.out.printf("도서명 : %s\n", strBName);
        System.out.println("================================");
    }
}
