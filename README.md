# 스프링부트 블로그 V2

## 기획 끝
## 화면설계 끝
## 화면코드 끝
## 테이블설계

## 1단계 기능
- (특징 : 자바스크립트, 예외처리)
- 회원가입
- 로그인
- 회원정보 보기
- 회원정보 수정하기
- 게시글 작성하기
- 게시글 목록보기
- 게시글 상세보기
- 게시글 삭제하기
- 게시글 수정하기
- 댓글 작성하기
- 댓글 삭제하기

## 2단계 기능
- 유저네임 중복체크 (AJAX)
- 페이징하기
- 검색하기
- 게시글 작성하기할 때 섬네일 등록
- 게시글 목록 섬네일 보기

## 3단계 기능
- 필터 (Filter)
- 유효성 검사 (AOP)
- 인증검사 (Interceptor)
- 이메일보내기 (댓글작성이 되면 게시글 주인에게)

## 테이블 쿼리
```sql
create database blogdb;
use blogdb;
create table user_tb (
    id integer auto_increment,
    created_at timestamp,
    email varchar(20) not null,
    password varchar(60) not null,
    username varchar(20) not null unique,
    primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
create table board_tb (
    id integer auto_increment,
    content varchar(10000),
    created_at timestamp,
    title varchar(100) not null,
    user_id integer,
    primary key (id),
    constraint fk_board_user_id foreign key (user_id) references user_tb (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
create table reply_tb (
    id integer auto_increment,
    comment varchar(100) not null,
    created_at timestamp,
    board_id integer,
    user_id integer,
    primary key (id),
    constraint fk_reply_board_id foreign key (board_id) references board_tb (id),
    constraint fk_reply_user_id foreign key (user_id) references user_tb (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```