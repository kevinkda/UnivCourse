# 利用JDBC连接数据库，完成增加修改删除以及查询的操作，全程调用存储过程（做一个控制台的就行）
create procedure 20200612_select_user(IN arg1 int)
begin
    select * from 20200612_user;
end;

create procedure 20200612_insert_user(IN arg1 varchar(255))
begin
    #     insert into `20200612_user`(userName) values ('@arg1');
    insert into `20200612_user`(userName) values (arg1);
end;

create procedure 20200612_modify_user(IN arg1 int, IN arg2 varchar(255))
begin
    #     update `20200612_user` set userName='@arg2' where userId = 52;
    update `20200612_user` set userName=arg2 where userId = arg1;
end;

create procedure 20200612_delect_user(IN arg1 int)
begin
    #     delete from 20200612_user where userID = 52;
    delete from 20200612_user where userID = arg1;
end;