package com.soc.book.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //서버 실행 시에 Object Relation Mapping 됨=> 테이블이 h2에 생성됨
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 db 번호증가 전략을 따라가겠다
	private Long id;
	
	private String title;
	private String author;
}
