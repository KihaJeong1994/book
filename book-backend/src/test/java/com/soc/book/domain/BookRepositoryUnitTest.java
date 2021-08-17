package com.soc.book.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

//단위 테스트(DB 관련된 Bean이 IoC에 등록되면 됨) 

@Transactional
@AutoConfigureTestDatabase(replace = Replace.ANY) // 가짜 디비로 테스트 Replace.NONE 실제 DB로 테스트
@DataJpaTest // Repository 들을 다 IoC 등록해줌
public class BookRepositoryUnitTest {

	@Autowired
	private BookRepository bookRepository;
	
	// BDDMockito 패턴 given, when, then
			@Test
			public void save_테스트()  throws Exception{
				// given(테스트를 하기 위한 준비)
				Book book = new Book(null,"스프링 따라하기","코스");
			
				// when (테스트 실행)
				Book bookEntity = bookRepository.save(book);
				
				assertEquals("스프링 따라하기", bookEntity.getTitle());
				
				
			}
}
