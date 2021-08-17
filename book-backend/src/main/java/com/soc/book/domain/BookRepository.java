package com.soc.book.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository 적어야 스프링 IoC에 빈으로 등록이 되는데
// JpaRepository를 extends 하면 생략가능
// JpaRepository 안의 CRUD 사용
public interface BookRepository extends JpaRepository<Book, Long>{

}
