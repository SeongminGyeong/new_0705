use webbing;

-- 회원 테이블 생성 
CREATE TABLE `webbing`.`member` (
  `userId` VARCHAR(8) NOT NULL,
  `userPwd` VARCHAR(200) NOT NULL,
  `userName` VARCHAR(12) NULL,
  `mobile` VARCHAR(13) NULL,
  `email` VARCHAR(50) NULL,
  `registerDate` DATETIME NULL DEFAULT now(),
  `userImg` VARCHAR(50) NOT NULL DEFAULT 'avatar.png',
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `mobile_UNIQUE` (`mobile` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
  COMMENT = '회원 테이블';

-- 회원 테이블 수정


-- DB서버의 현재 날짜,시간을 출력하는 쿼리문;
select now();

select md5('1234');
select sha1('1234');

select sha1(md5('1234'));

-- Member테이블에 회원을 insert하는 쿼리문
insert into member(userId, userPwd, userName, mobile, email)
value(?,sha1(md5(?)),?,?,?);


-- userId로 해당 유저의 정보를 검색하는 쿼리문
select * from member where userId=?;

-- 전체 정보를 검색하는 쿼리문
select * from member;

-- 둘리 회원의 이메일을 수정

update member set email = 'ggaacc@gmail.com' where userId = 'dooly';


-- ?회원 번화번호 변경 쿼리문
update member set mobile = ?
where userId = ? ;


-- userId가 ?인 회원 삭제 (회원 탈퇴)
delete from member where userId = ? ;