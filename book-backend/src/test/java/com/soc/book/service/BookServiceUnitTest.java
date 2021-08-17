package com.soc.book.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.soc.book.domain.Book;
import com.soc.book.domain.BookRepository;


/*
 * 단위 테스트(Service와 관련된 애들만 메모리에 띄우면 됨) 
 * BookRepository => 가짜 객체로 만들 수 있음
 * */


@ExtendWith(MockitoExtension.class)
public class BookServiceUnitTest {
	
	@InjectMocks // BookService 객체가 만들어 질 때 BookServiceUnitTest에 @Mock로 등록된 모든 애들을 주입받는다
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	// BDDMockito 패턴 given, when, then
		@Test
		public void 저장하기_테스트()  throws Exception{
			// given(테스트를 하기 위한 준비)
			Book book = new Book(null,"스프링 따라하기","코스");
			when(bookRepository.save(book)).thenReturn(book);
		
			// when (테스트 실행)
			Book bookEntity = bookService.저장하기(book);
			
			
		}
	
	
}
