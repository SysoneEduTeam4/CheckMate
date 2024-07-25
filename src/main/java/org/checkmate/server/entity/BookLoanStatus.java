package org.checkmate.server.entity;

import java.util.Date;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * [Users] 도서 대여 정보 응답 객체
 * HISTORY1: 최초 생성                                         [송헌욱  2024.07.25]
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookLoanStatus {

    private Long bookId; // 고유 식별자
    private String ISBN; // ISBN
    private String bName; // 책이름
    private String author; // 저자
    private String publisher; // 출판사
    private Boolean lStatus; // 대출 가능 상태
    private Date returnPreDate; // 반납 예정 날짜

    @Builder
    public BookLoanStatus(Long bookId, String ISBN, String bName, String author, String publisher,
            Boolean lStatus, Date returnPreDate) {
        this.bookId = bookId;
        this.ISBN = ISBN;
        this.bName = bName;
        this.author = author;
        this.publisher = publisher;
        this.lStatus = lStatus;
        this.returnPreDate = returnPreDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        BookLoanStatus that = (BookLoanStatus) object;
        return Objects.equals(bookId, that.bookId) && Objects.equals(ISBN,
                that.ISBN) && Objects.equals(bName, that.bName) && Objects.equals(
                author, that.author) && Objects.equals(publisher, that.publisher)
                && Objects.equals(lStatus, that.lStatus) && Objects.equals(
                returnPreDate, that.returnPreDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, ISBN, bName, author, publisher, lStatus, returnPreDate);
    }

}