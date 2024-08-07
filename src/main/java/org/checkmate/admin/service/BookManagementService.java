package org.checkmate.admin.service;

import java.sql.SQLException;
import java.util.List;
import javafx.collections.ObservableList;
import org.checkmate.admin.dto.request.BookCreateRequestDto;
import org.checkmate.admin.dto.request.BookUpdateRequestDto;
import org.checkmate.admin.dto.response.*;

public interface BookManagementService {



    List<BookReadLoanStatusResponseDto> readAllBooks() throws SQLException;
    BookCreateResponseDto createBook(BookCreateRequestDto requestDto) throws SQLException;
    BookUpdateResponseDto updateBook(BookUpdateRequestDto requestDto) throws SQLException;
    String deleteSelectedBook(Long bookId) throws SQLException;
    BookReadInformationResponseDto readBook(Long bookId) throws SQLException;
    List<BookReadLoanStatusResponseDto> readBooksByBookName(String bookName) throws SQLException;
    List<ReadBookLoanRecordsResponseDto> readAllBookLoanRecordsAdmin() throws SQLException;

    void readPivotDepartmentsBookLoanRecords() throws SQLException;
    List<ReadBookLoanRecordsForChartResponseDto> readTeamsBookLoanRecords() throws SQLException;
    List<ReadBookLoanRecordsResponseDto> readBookLoanRecordByNameAdmin(String eName) throws SQLException;
    String deleteSelectedBookLoanRecord(Long bookId) throws SQLException;
    String update_return_date(Long blrId) throws SQLException;
}
